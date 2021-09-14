package it.softwareInside.com.Vacanze1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import it.softwareInside.com.Vacanze1.model.Coach;
import it.softwareInside.com.Vacanze1.model.League;
import it.softwareInside.com.Vacanze1.model.Team;
import it.softwareInside.com.Vacanze1.repository.CoachRepository;
import it.softwareInside.com.Vacanze1.repository.LeagueRepository;
import it.softwareInside.com.Vacanze1.repository.TeamRepository;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private LeagueRepository leagueRepository;
	@Autowired
	private TeamRepository teamRepository;
	@Autowired
	private CoachRepository coachRepository;

	/**
	 * metodo che aggiunge un team solo se non è gia presente
	 */
	public boolean insertTeam(Team teamInsert) {	

		for (int i = 0; i <teamRepository.findAll().size(); i++) {
			if(teamRepository.findAll().get(i).getNome().equals(teamInsert.getNome()))
				return false;
		}

		teamRepository.save(teamInsert);
		return true;	
	}	
	/**
	 * 
	 * metodo che inserisce un team solo se non è presente in quella lega
	 */
	public boolean InsertTeamInALeague(Team teamInsert,String nomeLeague) {

		if(!insertTeam(teamInsert))
			return false;

		League league = leagueRepository.findById(nomeLeague).get();

		if(league.getNome().equals(teamInsert.getNome()))
			return false;

		league.getTeam().add(teamInsert);	
		return true;
	}

	/**
	 * metodo che mi ritorno tutti i team
	 */

	public List<Team> getTeam() {

		return (List<Team>) teamRepository.findAll();

	}

	/**
	 * metodo che mi trova tutti i coach
	 */
	public List<Coach>findCoach() {		
		return coachRepository.findAll();
	}

	/**
	 * inserisci coach
	 * @param c
	 */
	public void insertCoach(Coach c) {
		coachRepository.save(c);
	}

	public void deleteCoach(int id) {
		Coach c = coachRepository.getById(id);
		coachRepository.delete(c);
	}

	public void updateCoach(int id,String nome) {
		Coach c = coachRepository.getById(id);
		c.setNome(nome);
		coachRepository.save(c);
	}
	
	public void insertLeague(League league) {
		leagueRepository.save(league);
	}


}


