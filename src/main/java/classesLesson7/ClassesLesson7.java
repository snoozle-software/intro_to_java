package classesLesson7;

import classesLesson7.scoreBoard.Scoreboard;

public class ClassesLesson7 {

	public static void main(String[] args) {
		Scoreboard scoreboard = new Scoreboard();
		scoreboard.setHomeTeamName("Chiefs");
		scoreboard.setHomeScore(35);
		scoreboard.setVistorTeamName("Raiders");
		scoreboard.setVistorScore(14);
		scoreboard.incVistorScore();
		
		Scoreboard scoreboard2 = new Scoreboard(14,17,"Cowboys","Eagles");

	}

}
