package it.softwareinside.university;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import it.softwareinside.university.model.SimpleEntity;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

class test {

	private final OkHttpClient client = new OkHttpClient();
	SimpleEntity sampleResponse = new SimpleEntity("Baeldung");
	@Test
	void test() throws IOException, JSONException{
		Request request = new Request.Builder()
				.url("http://universities.hipolabs.com/search?country=italy")
				.build();

	
		Response response = client.newCall(request).execute();
		
		JSONArray json = new JSONArray(response.body().string());  
		System.out.println(json);

	}

}
