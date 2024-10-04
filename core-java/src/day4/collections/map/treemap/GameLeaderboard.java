package day4.collections.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class GameLeaderboard {
    @Override
    public String toString() {
        return "GameLeaderboard{" +
                "leaderBoard=" + leaderBoard +
                '}';
    }

    private TreeMap<Integer, String> leaderBoard;

    public GameLeaderboard() {
        this.leaderBoard = new TreeMap<>(Comparator.reverseOrder());
    }


    public void addOrUpdatePlayer(int score, String playerName) {
        // Remove the previous score if the player already exist in the board
        leaderBoard.entrySet().removeIf(entry -> entry.getValue().equals(playerName));
        //Add the new Score and player to the board
        leaderBoard.put(score, playerName);
    }





    public static void main(String[] args) {

        GameLeaderboard leaderBoard = new GameLeaderboard();

        leaderBoard.addOrUpdatePlayer(4300, "Player#57");
        leaderBoard.addOrUpdatePlayer(9300, "Player#34");
        leaderBoard.addOrUpdatePlayer(25300, "Player#12");

        leaderBoard.addOrUpdatePlayer(10900, "Player#90");
        leaderBoard.addOrUpdatePlayer(30900, "Player#90");

        leaderBoard.addOrUpdatePlayer(29300, "Player#34");
        leaderBoard.addOrUpdatePlayer(1300, "Player#12");

        System.out.println(leaderBoard);

    }
}
