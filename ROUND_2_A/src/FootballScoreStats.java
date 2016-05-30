
public class FootballScoreStats {

	private GamelData footballData;

	public FootballScoreStats(GamelData footballData) {
		this.footballData = footballData;
	}

	public int teamTotal(String teamName) {
		int total = 0;
		Game[] played =  footballData.getAllPlayed();
		for (Game game : played) {
			if(game.getHomeTeam().equals(teamName)){
				total += game.getHomeTeamScore();
			}
			if(game.getAwayTeam().equals(teamName)){
				total += game.getAwayTeamScore();
			}
		}
		return total;
	}

}
