public class Player {

    private String playerName;
    private int score;

    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player { " +
                "Player Name = '" + playerName + '\'' +
                ", Score = " + score +
                " }";
    }
}
