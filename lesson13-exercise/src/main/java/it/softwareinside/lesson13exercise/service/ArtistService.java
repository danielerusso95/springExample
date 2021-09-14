package it.softwareinside.lesson13exercise.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.lesson13exercise.model.Artist;
import it.softwareinside.lesson13exercise.repository.ArtistRepository;


@Service
public class ArtistService {
	
		
		@Autowired
		private ArtistRepository artistRepository;
		 
	
		public void addArtist(Artist artist) {
			artistRepository.save(artist);
		}
		
		
		public void deleteArtist(int index) {
			artistRepository.deleteById(index);
		}
		
	
		public void deleteArtist(Artist artist) {
			artistRepository.delete(artist);
		}
		
		public void init_artists() {
			for (int i = 0; i < 10; i++) {
				artistRepository.save(new Artist(getARandomName(),getARandomSurname(),getADate(),getARandomWorks()));
			}
		}

		private String getARandomName() {
			List<String> names = Arrays.asList("roberto","marco","giulia","luca","ariel");
			Collections.shuffle(names);
			return names.get(0);
		}
		private String getARandomSurname() {
			List<String> surnames = Arrays.asList("russo","sabatino","marigliano","albano","micc");
			Collections.shuffle(surnames);
			return surnames.get(0);
		}
		private int getARandomWorks() {
			return new Random().nextInt(600)+100;
		}
		private Date getADate() {
			return Date.valueOf((1950+new Random().nextInt(50))+"-"+(1+new Random().nextInt(11))+"-"+(1+new Random().nextInt(30)));
		}
		
		public ArrayList<Artist> getAllArtists(){
			return (ArrayList<Artist>) artistRepository.findAll();
		}


		public void deleteAll() {
			artistRepository.deleteAll();
		}
		
		
}


