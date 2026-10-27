package ipl_project;

public class Team {

	private int teamId;
	private String teamName;
	private String homeCity;
	private String homeVenue;

	Team() {

	}

	public Team(int teamId, String teamName, String homeCity, String homeVenue) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.homeCity = homeCity;
		this.homeVenue = homeVenue;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	public String getHomeVenue() {
		return homeVenue;
	}

	public void setHomeVenue(String homeVenue) {
		this.homeVenue = homeVenue;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", homeCity=" + homeCity + ", homeVenue="
				+ homeVenue + "]";
	}

}
