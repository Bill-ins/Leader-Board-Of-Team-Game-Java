public class Team {

    Player player[];
    private String teamName;
    private String teamCountry;
    private int playerCount = 0;
    private int teamScore = 0;

    // Constructor to initailize Team name in Country
    public Team(String teamName, String teamCountry) {
        player = new Player[5];
        this.teamName = teamName;
        this.teamCountry = teamCountry;
    }

    // This method is for adding player to the team
    /** For calculating the total score I just declared a instance variable and keep adding the score of the
     *  new player while adding the new player to the team */
    public void addPlayer(String playerName, int score) {
        if(playerCount < 5) {

            player[playerCount] = new Player(playerName, score);
            playerCount++;
            teamScore = teamScore + score;

        } else {
            System.out.println("Maximum Player Reached");
        }
    }

    // This is for returning the total team score
    public int totalTeamScore() {
        return teamScore;
    }

    // This methods print all the player details in the team
    public void showPlayers() {
        for(int i = 0; i < playerCount; i++) {
            System.out.println(player[i]);
        }
    }

    @Override
    public String toString() {
        return "Team { " +
                "Team Name = '" + teamName + '\'' +
                ", Country = '" + teamCountry + '\'' +
                ", Team Score = " + teamScore +
               " }";
    }

}
