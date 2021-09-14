package it.softwareinside.mysqltest.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.softwareinside.mysqltest.model.PostalCode;
import it.softwareinside.mysqltest.repository.PostalCodeRepository;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class PostalCodeService {

	@Autowired
	PostalCodeRepository postalCodeRepository;

	public List<PostalCode> getAllPostalCode() {
		return postalCodeRepository.findAll();	
	}
	public void deleteAll() {
		postalCodeRepository.deleteAll();	
	}

	public List<PostalCode> getElementsByPostalCode(String postal_code) {

		if(postalCodeRepository.countByCode(postal_code)>0 ) {
			System.out.println("sono qui!");
			return postalCodeRepository.findbyCode(postal_code);
		}

		ObjectMapper mapper = new ObjectMapper();
		String url = "https://api.zippopotam.us/it/"+ postal_code;
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url(url)
				.build();

		try (Response response = client.newCall(request).execute()) {

			JsonNode actualObj = mapper.readTree(response.body().string());
			ArrayList<PostalCode> listaPostalCode = new ArrayList<PostalCode>();

			PostalCode postalCode = new ObjectMapper().readValue(actualObj.toString(), PostalCode.class);
			postalCodeRepository.save(postalCode);
			listaPostalCode.add(postalCode);


			return listaPostalCode;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;


	}

}
