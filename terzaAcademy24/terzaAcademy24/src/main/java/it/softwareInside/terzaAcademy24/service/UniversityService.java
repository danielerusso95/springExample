package it.softwareInside.terzaAcademy24.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.softwareInside.terzaAcademy24.model.University;
import it.softwareInside.terzaAcademy24.repository.UniversityRepository;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class UniversityService {

	
	@Autowired
	private UniversityRepository universityRepositoty;
	
	public List<University> getElementsByCountry(String country) {
		
		//universityRepositoty.countByCountry(country)
		if(universityRepositoty.countByCountry(country)> 0 ) {
			System.out.println("sono qui!");
			return universityRepositoty.findbyCountry(country);
		}
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		String url = "http://universities.hipolabs.com/search?country=" + country;
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url(url)
				.build();

		try (Response response = client.newCall(request).execute()) {
			
			JsonNode actualObj = mapper.readTree(response.body().string());
			ArrayList<University> listaUni = new ArrayList<University>();
			
			for(int i = 0; i < actualObj.size();i++) {
				University university = new ObjectMapper().readValue(actualObj.get(i).toString(), University.class);
				universityRepositoty.save(university);
				listaUni.add(university);
			}
			
			return listaUni;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	
	
}
