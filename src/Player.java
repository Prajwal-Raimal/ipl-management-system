package ipl_project;

public class Player {

	private int pid;
	private String name;
	private String team_name;
	private String category;
	private int score;
	private int catches;
	private int wickets;

	public Player() {

	}

	public Player(int pid, String name, String team_name, String category, int score, int catches, int wickets) {
		this.pid = pid;
		this.name = name;
		this.team_name = team_name;
		this.category = category;
		this.score = score;
		this.catches = catches;
		this.wickets = wickets;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCatches() {
		return catches;
	}

	public void setCatches(int catches) {
		this.catches = catches;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", team_name=" + team_name + ", category=" + category
				+ ", score=" + score + ", catches=" + catches + ", wickets=" + wickets + "]";
	}

	
	
	
	
	
	
}
