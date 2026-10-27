package ipl_project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerOperations {
	List<Player> playerList = new ArrayList<>();

	PlayerDao playerDao = new PlayerDao();

	public List<Player> getAllPlayers() {

		playerList = playerDao.getAllPlayers();

		return playerList;

	}

	public List<Player> getAllPlayersGivenTeamName(String team) {
		List<Player> playersGivenTeamName = new ArrayList<>();
		for (Player player : playerList) {
			if (team.equals(player.getTeam_name())) {
				playersGivenTeamName.add(player);
			}
		}
		return playersGivenTeamName;
	}

	public List<Player> getAllBatters() {
		List<Player> allBatters = new ArrayList<>();
		String bat = "Batsman";
		playerList = playerDao.getAllPlayers();
		for (Player pro : playerList) {
			if (bat.equals(pro.getCategory())) {
				allBatters.add(pro);
			}
		}
		return allBatters;
	}

	public List<Player> getAllBattersGivenTeamName(String team) {
		List<Player> allBatteresGivenTeamName = new ArrayList<>();
		String bat = "Batsman";
		playerList = playerDao.getAllPlayers();
		for (Player pro : playerList) {
			if (team.equals(pro.getTeam_name()) && bat.equals(pro.getCategory())) {
				allBatteresGivenTeamName.add(pro);
			}
		}
		return allBatteresGivenTeamName;
	}

	public List<Player> getAllBowlers() {
		List<Player> allBowlers = new ArrayList<>();
		String bow = "Bowler";
		playerList = playerDao.getAllPlayers();
		for (Player pro : playerList) {
			if (bow.equals(pro.getCategory())) {
				allBowlers.add(pro);
			}
		}
		return allBowlers;
	}

	public List<Player> getAllBowlersGivenTeamName(String team) {
		List<Player> allBowlersGivenTeamName = new ArrayList<>();
		String bow = "Bowler";
		playerList = playerDao.getAllPlayers();
		for (Player pro : playerList) {
			if (team.equals(pro.getTeam_name()) && bow.equals(pro.getCategory())) {
				allBowlersGivenTeamName.add(pro);
			}
		}
		return allBowlersGivenTeamName;
	}

	public List<Player> getAllAllRounders() {
		List<Player> allRounders = new ArrayList<>();
		playerList = playerDao.getAllPlayers();
		String all = "All-Rounder";
		for (Player pro : playerList) {
			if (all.equals(pro.getCategory())) {
				allRounders.add(pro);
			}
		}

		return allRounders;
	}

	public List<Player> getAllAllRoundersGivenTeamName(String team) {
		List<Player> allRoundersGivenTeam = new ArrayList<>();
		playerList = playerDao.getAllPlayers();
		String all = "All-Rounder";
		for (Player pro : playerList) {
			if (team.equals(pro.getTeam_name()) && all.equals(pro.getCategory())) {
				allRoundersGivenTeam.add(pro);
			}
		}
		return allRoundersGivenTeam;
	}

	public List<Player> getWicketKeeper() {
		List<Player> allWicketKeeper = new ArrayList<>();
		playerList = playerDao.getAllPlayers();
		String wicket = "Wicket-Keeper";
		for (Player pro : playerList) {
			if (wicket.equals(pro.getCategory())) {
				allWicketKeeper.add(pro);
			}
		}
		return allWicketKeeper;
	}

	public List<Player> getWicketKeeperGivenTeam(String team) {
		List<Player> allWicketKeeper = new ArrayList<>();
		playerList = playerDao.getAllPlayers();
		String wicket = "Wicket-Keeper";
		for (Player pro : playerList) {
			if (team.equals(pro.getTeam_name()) && wicket.equals(pro.getCategory())) {
				allWicketKeeper.add(pro);
			}
		}
		return allWicketKeeper;
	}

	public List<Player> getPlayerByGivenID(int i) {
		List<Player> playerByID = new ArrayList<>();
		playerList = playerDao.getAllPlayers();
		for (Player pro : playerList) {
			if (i == pro.getPid()) {
				playerByID.add(pro);
			}
		}
		return playerByID;
	}

	public List<Player> getPlayerByGivenName(String name) {
		List<Player> playerByName = new ArrayList<>();
		playerList = playerDao.getAllPlayers();
		for (Player pro : playerList) {
			if (name.equals(pro.getName())) {
				playerByName.add(pro);
			}
		}
		return playerByName;
	}

	public List<Player> getPlayerByGivenMinimumScore(int i) {
		List<Player> minimumScore = new ArrayList<>();
		playerList = playerDao.getAllPlayers();
		for (Player pro : playerList) {
			if (i <= pro.getScore()) {
				minimumScore.add(pro);
			}
		}
		return minimumScore;
	}

	public Player getTopScorer() {
		try {
			return playerDao.getTopScorer();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public List<Player> getTopNScorer(int i) throws Exception {

		return playerDao.getTopNPlayer(i);
	}

	public Player getTopWicketTaker() throws SQLException {
		return PlayerDao.topWicketTaker();
	}

	public List<Player> getTopNWicketTaker(int i) throws SQLException {
		return PlayerDao.topNWicketTaker(i);
	}

	public List<Player> getMinimumWickets(int i) {
		List<Player> minimumWicketTaker = new ArrayList<>();

		playerList = playerDao.getAllPlayers();

		for (Player pro : playerList) {
			if (i <= pro.getWickets()) {
				minimumWicketTaker.add(pro);
			}
		}

		return minimumWicketTaker;
	}

	public List<Player> getPlayersByTeamAndMinimumScore(String team, int score) {

		return playerDao.getPlayersByTeamAndMinimumScore(team, score);
	}

	public List<Player> getPlayersByCategoryAndMinimumScore(String category, int score) {

		return playerDao.getPlayersByCategoryAndMinimumScore(category, score);
	}

	public List<Player> getPlayersByMinimumCatches(int catches) {

		return playerDao.getPlayersByMinimumCatches(catches);
	}

	public List<Player> getTopNCatchers(int n) {

		return playerDao.getTopNCatchers(n);
	}

}
