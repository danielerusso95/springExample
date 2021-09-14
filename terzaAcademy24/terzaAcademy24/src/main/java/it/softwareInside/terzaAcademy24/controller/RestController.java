package it.softwareInside.terzaAcademy24.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.softwareInside.terzaAcademy24.model.University;
import it.softwareInside.terzaAcademy24.service.UniversityService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@CrossOrigin
@RequestMapping("/api/")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	
	@Autowired
	private UniversityService universityService;
	
	@GetMapping("/findByCountry")
	public List<University> findByCountry(@RequestParam(name="country") String country){
		return universityService.getElementsByCountry(country);
	}
	
	
	
	@GetMapping("test")
	public JsonNode getTest() {
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		String url = "http://universities.hipolabs.com/search?country=italy";

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url(url)
				.build();

		try (Response response = client.newCall(request).execute()) {
			
			JsonNode actualObj = mapper.readTree(response.body().string());
			
			System.out.println("lenghh " + actualObj.size());
			System.out.println("caso1 " + actualObj);
			System.out.println("caso2 " +actualObj.get(0));
			
			ArrayList<University> listaUni = new ArrayList<University>();
			
			for(int i = 0; i < actualObj.size();i++) {
				University university = new ObjectMapper().readValue(actualObj.get(i).toString(), University.class);
				listaUni.add(university);
			}
			
			
			
			System.out.println("----->" + listaUni);
			
			
			//University university = new ObjectMapper().readValue(actualObj.get(0).toString(), University.class);
			//System.out.println("stampo obj university " + university);
			
			return actualObj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

		
	}
	
	
	
}
