package it.softwareinside.university.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
 
@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {
 
 
    @GetMapping("/test")
    public JsonNode getTest() {
 
 
        ObjectMapper mapper = new ObjectMapper();
 
 
        //API ESTERNA
        String url = "http://universities.hipolabs.com/search?country=italy";
 

        OkHttpClient client = new OkHttpClient();
 
        Request request = new Request.Builder()
                .url(url)//CI DIAMO QUESTA API
                .build();
 

        try (Response response = client.newCall(request).execute()) {
            JsonNode actualObj = mapper.readTree(response.body().string());
 
            return actualObj;
        } catch (IOException e) {

            e.printStackTrace();
        }
        return null;
 
 
    }
 
 
 
}
