package ipl_project;

import java.util.List;

public class IplMainApp {

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to IPL.com");

		PlayerOperations playrsOps = new PlayerOperations();

		System.out.println("1. Get All Players All Teams   ");
		List<Player> allPlayerList = playrsOps.getAllPlayers();
		allPlayerList.forEach(System.out::println);

		System.out.println("\n2. Get All Players of Given TeamName ");
		List<Player> allPlayersGivenTeamName = playrsOps.getAllPlayersGivenTeamName("RCB");
		allPlayersGivenTeamName.forEach(System.out::println);

		System.out.println("\n3. Get All Batters of all Team");
		List<Player> allBatters = playrsOps.getAllBatters();
		allBatters.forEach(System.out::println);

		System.out.println("\n4. Get All Batters Given TeamName");
		List<Player> allBattersGivenTeamName = playrsOps.getAllBattersGivenTeamName("RCB");
		allBattersGivenTeamName.forEach(System.out::println);

		System.out.println("\n5. Get All Bowlers of all team ");
		List<Player> allBowlers = playrsOps.getAllBowlers();
		allBowlers.forEach(System.out::println);

		System.out.println("\n6. Get All Bowlers given TeamName ");
		List<Player> allBowlersGivenTeamName = playrsOps.getAllBowlersGivenTeamName("RCB");
		allBowlersGivenTeamName.forEach(System.out::println);

		System.out.println("\n7. Gel All Rounders ");
		List<Player> allRounders = playrsOps.getAllAllRounders();
		allRounders.forEach(System.out::println);

		System.out.println("\n8. Get All Rounders given TeamName");
		List<Player> allRoundersGivnTeam = playrsOps.getAllAllRoundersGivenTeamName("RCB");
		allRoundersGivnTeam.forEach(System.out::println);

		System.out.println("\n9. Get All WicketKeeper ");
		List<Player> allWicketKeeper = playrsOps.getWicketKeeper();
		allWicketKeeper.forEach(System.out::println);

		System.out.println("\n10. Get All WicketKeeper given team");
		List<Player> allWicketKeeperGivenTeam = playrsOps.getWicketKeeperGivenTeam("RCB");
		allWicketKeeperGivenTeam.forEach(System.out::println);

		System.out.println("\n11 Get Player By Given ID ");
		List<Player> playerGivenId = playrsOps.getPlayerByGivenID(23);
		playerGivenId.forEach(System.out::println);

		System.out.println("\n12 Get Player By Given Name");
		List<Player> playerGivenName = playrsOps.getPlayerByGivenName("virat kohli");
		playerGivenName.forEach(System.out::println);

		System.out.println("\n13 Get Player with minimum score");
		List<Player> playerGivenMinimumScore = playrsOps.getPlayerByGivenMinimumScore(3000);
		playerGivenMinimumScore.forEach(System.out::println);

		System.out.println("\n14 Get Player with Top Scorer");
		Player pro = playrsOps.getTopScorer();
		System.out.println(pro);

		System.out.println("\n15 Get N Number of Player ");
		List<Player> topNPlayers = playrsOps.getTopNScorer(10);
		topNPlayers.forEach(System.out::println);

		System.out.println("\n16 Get Player with top WicketTaker");
		Player topwicketTaker = playrsOps.getTopWicketTaker();
		System.out.println(topwicketTaker);

		System.out.println("\n17 Get N Number of Player top wicketTaker");
		List<Player> topNWicketTaker = playrsOps.getTopNWicketTaker(5);
		topNWicketTaker.forEach(System.out::println);

		System.out.println("\n18 Get Players by Minimum Wickets");
		List<Player> minimumWickts = playrsOps.getMinimumWickets(150);
		minimumWickts.forEach(System.out::println);

		System.out.println("\n19. Get Players by Team Name and Minimum Score");
		List<Player> playersByTeamAndScore = playrsOps.getPlayersByTeamAndMinimumScore("RCB", 1000);
		playersByTeamAndScore.forEach(System.out::println);

		System.out.println("\n20. Get Players by Category and Minimum Score");
		List<Player> playersByCategoryAndScore = playrsOps.getPlayersByCategoryAndMinimumScore("Batsman", 2000);
		playersByCategoryAndScore.forEach(System.out::println);

		System.out.println("\n21. Get Players with Minimum Catches");
		List<Player> playersByMinimumCatches = playrsOps.getPlayersByMinimumCatches(20);
		playersByMinimumCatches.forEach(System.out::println);

		System.out.println("\n22. Get Top N Players by Catches");
		List<Player> topNCatchers = playrsOps.getTopNCatchers(5);
		topNCatchers.forEach(System.out::println);

		TeamsOperations teamsOps = new TeamsOperations();

		System.out.println("\n23. Get All Ipl Teams");
		List<Team> getAllTeams = teamsOps.getAllTeams();
		getAllTeams.forEach(System.out::println);

		System.out.println("\n24. Get Team by Given Team ID ");
		List<Team> teamById = teamsOps.getTeamById(9);
		teamById.forEach(System.out::println);

		System.out.println("\n25. Get Team by Given Team Name");
		List<Team> teamByTeamName = teamsOps.getTeamByTeamName("Royal Challengers Bengaluru");
		teamByTeamName.forEach(System.out::println);

	}
}
