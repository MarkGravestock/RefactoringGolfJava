package com.markgravestock;

public class FootballScoreStats {

	private GameData footballData;

	public FootballScoreStats(GameData footballData) {
		this.footballData = footballData;
	}

	public int teamTotal(String teamName) {
		int total = 0;
		Game[] played =  footballData.getAllPlayed();
		for (Game game : played) {
			total = getScoreForTeam(teamName, total, game);
		}
		return total;
	}

	private int getScoreForTeam(String teamName, int total, Game game) {
		if(game.getHomeTeam().equals(teamName)){
            total += game.getHomeTeamScore();
        }
		if(game.getAwayTeam().equals(teamName)){
            total += game.getAwayTeamScore();
        }
		return total;
	}

}
