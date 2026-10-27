package ipl_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {

	public List<Player> getAllPlayers() {

		List<Player> allPlayers = new ArrayList<>();
		try {
			Connection con = myDbCong.getMySQLDbConnection();
			Statement st = con.createStatement();

			String query = "select * from player";

			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				Player p = new Player();

				p.setPid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setTeam_name(rs.getString(3));
				p.setCategory(rs.getString(4));
				p.setScore(rs.getInt(5));
				p.setCatches(rs.getInt(6));
				p.setWickets(rs.getInt(7));

				allPlayers.add(p);

			}
			return allPlayers;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public Player getTopScorer() throws SQLException {
		Player player = null;

		Connection con = myDbCong.getMySQLDbConnection();
		String query = "SELECT * FROM player " + "ORDER BY CAST(score AS UNSIGNED) DESC LIMIT 1";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {

			int id = rs.getInt(1);
			String name = rs.getString(2);
			String teamName = rs.getString(3);
			String category = rs.getString(4);
			int score = rs.getInt(5);
			int catches = rs.getInt(6);
			int wickets = rs.getInt(7);

			player = new Player(id, name, teamName, category, score, catches, wickets);
		}

		rs.close();
		ps.close();
		con.close();

		return player;
	}

	public List<Player> getTopNPlayer(int i) throws Exception {
		List<Player> addTopNPlayer = new ArrayList<>();

		Connection con = myDbCong.getMySQLDbConnection();
		String query = "SELECT * FROM player " + "ORDER BY CAST(score AS UNSIGNED) DESC LIMIT ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, i);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Player p = new Player();

			p.setPid(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setTeam_name(rs.getString(3));
			p.setCategory(rs.getString(4));
			p.setScore(rs.getInt(5));
			p.setCatches(rs.getInt(6));
			p.setWickets(rs.getInt(7));

			addTopNPlayer.add(p);

		}
		return addTopNPlayer;
	}

	public static Player topWicketTaker() throws SQLException {
		Player player = null;
		Connection con = myDbCong.getMySQLDbConnection();

		String query = "SELECT * FROM player " + "ORDER BY CAST(wickets AS UNSIGNED) DESC LIMIT 1";

		PreparedStatement ps = con.prepareStatement(query);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {

			int id = rs.getInt(1);
			String name = rs.getString(2);
			String teamName = rs.getString(3);
			String category = rs.getString(4);
			int score = rs.getInt(5);
			int catches = rs.getInt(6);
			int wickets = rs.getInt(7);

			player = new Player(id, name, teamName, category, score, catches, wickets);
		}

		return player;
	}

	public static List<Player> topNWicketTaker(int i) throws SQLException {

		List<Player> topNWicketTaker = new ArrayList<>();

		Connection con = myDbCong.getMySQLDbConnection();

		String query = "SELECT * FROM player " + "ORDER BY CAST(wickets AS UNSIGNED) DESC LIMIT ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, i);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Player p = new Player();

			p.setPid(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setTeam_name(rs.getString(3));
			p.setCategory(rs.getString(4));
			p.setScore(rs.getInt(5));
			p.setCatches(rs.getInt(6));
			p.setWickets(rs.getInt(7));

			topNWicketTaker.add(p);
		}

		return topNWicketTaker;

	}

	public List<Player> getPlayersByTeamAndMinimumScore(String team, int score) {

		List<Player> playerList = new ArrayList<>();

		try {
			Connection con = myDbCong.getMySQLDbConnection();

			String query = "SELECT * FROM player " + "WHERE team_name = ? AND score >= ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, team);
			ps.setInt(2, score);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Player p = new Player();

				p.setPid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setTeam_name(rs.getString(3));
				p.setCategory(rs.getString(4));
				p.setScore(rs.getInt(5));
				p.setCatches(rs.getInt(6));
				p.setWickets(rs.getInt(7));

				playerList.add(p);
			}

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return playerList;
	}

	public List<Player> getPlayersByCategoryAndMinimumScore(String category, int score) {

		List<Player> playerList = new ArrayList<>();

		try {
			Connection con = myDbCong.getMySQLDbConnection();

			String query = "SELECT * FROM player " + "WHERE category = ? AND score >= ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, category);
			ps.setInt(2, score);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Player p = new Player();

				p.setPid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setTeam_name(rs.getString(3));
				p.setCategory(rs.getString(4));
				p.setScore(rs.getInt(5));
				p.setCatches(rs.getInt(6));
				p.setWickets(rs.getInt(7));

				playerList.add(p);
			}

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return playerList;
	}

	public List<Player> getPlayersByMinimumCatches(int catches) {

		List<Player> playerList = new ArrayList<>();

		try {
			Connection con = myDbCong.getMySQLDbConnection();

			String query = "SELECT * FROM player WHERE catches >= ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, catches);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Player p = new Player();

				p.setPid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setTeam_name(rs.getString(3));
				p.setCategory(rs.getString(4));
				p.setScore(rs.getInt(5));
				p.setCatches(rs.getInt(6));
				p.setWickets(rs.getInt(7));

				playerList.add(p);
			}

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return playerList;
	}

	public List<Player> getTopNCatchers(int n) {

		List<Player> playerList = new ArrayList<>();

		try {
			Connection con = myDbCong.getMySQLDbConnection();

			String query = "SELECT * FROM player " + "ORDER BY catches DESC LIMIT ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, n);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Player p = new Player();

				p.setPid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setTeam_name(rs.getString(3));
				p.setCategory(rs.getString(4));
				p.setScore(rs.getInt(5));
				p.setCatches(rs.getInt(6));
				p.setWickets(rs.getInt(7));

				playerList.add(p);
			}

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return playerList;
	}


}
