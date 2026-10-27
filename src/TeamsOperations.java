package ipl_project;

import java.util.ArrayList;
import java.util.List;

public class TeamsOperations {

	List<Team> teamList = new ArrayList<>();

	TeamDao teamDao = new TeamDao();

	public List<Team> getAllTeams() {
		teamList = teamDao.getAllTeams();
		return teamList;
	}

	List<Team> teamById = new ArrayList<>();

	public List<Team> getTeamById(int i) {
		teamById = teamDao.getTeamById(i);
		return teamById;
	}

	List<Team> teamByTeamName = new ArrayList<>();

	public List<Team> getTeamByTeamName(String teamName) {
		teamByTeamName = teamDao.getTeamName(teamName);
		return teamByTeamName;
	}

}
