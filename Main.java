public class Main {
    public static void main(String[] args) {

        int teamCount = 3;

        Team team[] = new Team[teamCount];

        team[0] =  new Team("Team 1", "America");
        team[1] = new Team("Team 2", "London");
        team[2] = new Team("Team 3", "Germany");


        team[0].addPlayer("A", 3);
        team[0].addPlayer("B", 4);
        team[0].addPlayer("C", 2);

        team[1].addPlayer("E", 6);
        team[1].addPlayer("F", 7);
        team[1].addPlayer("G", 5);

        team[2].addPlayer("H", 8);
        team[2].addPlayer("I", 7);
        team[2].addPlayer("J", 6);

        // Printing all the players in each team
        team[0].showPlayers();
        System.out.println();

        team[1].showPlayers();
        System.out.println();

        team[2].showPlayers();
        System.out.println();

        System.out.println();

        // Sorting according to the Team Score in descending order
        for(int i = 0; i < teamCount; i++) {
            boolean isSorted = true;
            for (int j = 1; j < teamCount - i; j++) {

                if (team[j - 1].totalTeamScore() < team[j].totalTeamScore()) {
                    Team temp = team[j - 1];team[j - 1] = team[j];
                    team[j] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }

        // Printing the team
        for(int i = 0; i < teamCount; i++) {
            System.out.println(team[teamCount]);
        }

    }
}
