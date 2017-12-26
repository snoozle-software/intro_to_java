package classesLesson7.scoreBoard;

public class Scoreboard {

	// attributes
	private int homeScore = 0;
	private int vistorScore = 0;
	private String homeTeamName = "";
	private String vistorTeamName = "";
	
	// methods
	
	// Constructors
	public Scoreboard() {
		super();
	}
	
	public Scoreboard(int homeScore, int vistorScore, 
			          String homeTeamName, String vistorTeamName)
	{
		this.homeScore = homeScore;
		this.vistorScore = vistorScore;
		this.homeTeamName = homeTeamName;
		this.vistorTeamName = vistorTeamName;
	}
	
	// Getter and Setters
	public int getHomeScore()
	{
		return this.homeScore;
	}
	
	public void setHomeScore(int homeScore)
	{
		this.homeScore = homeScore;
	}

	public int getVistorScore() {
		return vistorScore;
	}

	public void setVistorScore(int vistorScore) {
		this.vistorScore = vistorScore;
	}

	public String getHomeTeamName() {
		return homeTeamName;
	}

	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}

	public String getVistorTeamName() {
		return vistorTeamName;
	}

	public void setVistorTeamName(String vistorTeamName) {
		this.vistorTeamName = vistorTeamName;
	}
	
	// mutator
	public void incHomeScore()
	{
		this.homeScore++;
	}
	

	public void incVistorScore()
	{
		this.vistorScore++;
	}
	
	
}
