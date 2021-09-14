package it.softwareinside.criptoforecast.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.workday.insights.timeseries.arima.Arima;
import com.workday.insights.timeseries.arima.struct.ArimaParams;
import com.workday.insights.timeseries.arima.struct.ForecastResult;

import it.softwareinside.criptoforecast.model.Cripto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class CriptoService {

	public Cripto getData() {	
		OkHttpClient client = new OkHttpClient();


		String url = "https://candle.etoro.com/candles/desc.json/OneDay/100/100000?client_request_id=8adb14c8-90a7-4c04-9368-870ab31645f0";

		ObjectMapper mapper = new ObjectMapper();
		Request request = new Request.Builder()
				.url(url)
				.build();

		try (Response response = client.newCall(request).execute()) {
			JsonNode actualObj = mapper.readTree(response.body().string());
			JsonNode candles = actualObj.get("Candles").get(0).get("Candles");
			Cripto cripto = new Cripto();
			for(int i = 0; i < candles.size();i++) {
				cripto.getCripto().add(candles.get(i).get("Close").doubleValue());
			}
			return cripto;

		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

	public double[] forecast() {
		// Prepare input timeseries data.
		ArrayList<Double> array = this.getData().getCripto();

		double[] dataArray = new double[array.size()];

		for (int i = 0; i < dataArray.length; i++) {
			dataArray[i] = array.get(i).doubleValue();
		}

		// Set ARIMA model parameters.
		int p = 3;
		int d = 0;
		int q = 3;
		int P = 1;
		int D = 1;
		int Q = 0;
		int m = 0;
		int forecastSize = 10;

		ArimaParams params = new ArimaParams(p, d, q, P, D, Q, m);
		// Obtain forecast result. The structure contains forecasted values and performance metric etc.
		ForecastResult forecastResult = Arima.forecast_arima(dataArray, forecastSize, params);

		// Read forecast values
		double[] forecastData = forecastResult.getForecast(); // in this example, it will return { 2 }

		// You can obtain upper- and lower-bounds of confidence intervals on forecast values.
		// By default, it computes at 95%-confidence level. This value can be adjusted in ForecastUtil.java
		double[] uppers = forecastResult.getForecastUpperConf();
		double[] lowers = forecastResult.getForecastLowerConf();

		// You can also obtain the root mean-square error as validation metric.
		double rmse = forecastResult.getRMSE();

		// It also provides the maximum normalized variance of the forecast values and their confidence interval.
		double maxNormalizedVariance = forecastResult.getMaxNormalizedVariance();

		// Finally you can read log messages.
		String log = forecastResult.getLog();


		return forecastData;
	}


}
