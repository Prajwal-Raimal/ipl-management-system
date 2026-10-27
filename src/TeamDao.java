package ipl_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeamDao {

	List<Team> allTeams = new ArrayList<>();

	public List<Team> getAllTeams() {
		try {
			Connection con = myDbCong.getMySQLDbConnection();

			Statement st = con.createStatement();

			String query = "select * from team";

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				Team team = new Team();
				team.setTeamId(rs.getInt(1));
				team.setTeamName(rs.getString(2));
				team.setHomeCity(rs.getString(3));
				team.setHomeVenue(rs.getString(4));

				allTeams.add(team);
			}

			return allTeams;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	List<Team> teamId = new ArrayList<>();

	public List<Team> getTeamById(int i) {
		try {
			Connection con = myDbCong.getMySQLDbConnection();

			Statement st = con.createStatement();

			String query = "SELECT * FROM team WHERE team_id = " + " " + i;

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				Team team = new Team();

				team.setTeamId(rs.getInt(1));
				team.setTeamName(rs.getString(2));
				team.setHomeCity(rs.getString(3));
				team.setHomeVenue(rs.getString(4));

				teamId.add(team);
			}

			return teamId;

		} catch (

		SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	List<Team> TeamByName = new ArrayList<>();

	public List<Team> getTeamName(String teamName) {
		List<Team> teamByName = new ArrayList<>();

		String query = "SELECT * FROM team WHERE team_name = ?";

		try {
			Connection con = myDbCong.getMySQLDbConnection();

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, teamName);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Team team = new Team();

				team.setTeamId(rs.getInt(1));
				team.setTeamName(rs.getString(2));
				team.setHomeCity(rs.getString(3));
				team.setHomeVenue(rs.getString(4));

				teamByName.add(team);
			}

			return teamByName;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	List<Team> newTeam = new ArrayList<>();

	public List<Team> addNewTeam(Team team) {

		return null;
	}

}
