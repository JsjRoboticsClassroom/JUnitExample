package nyc.c4q;

import java.util.Optional;

public class Round {

    public Optional<Player> playRound(Player player1, Player player2){
        Optional<Player> winner = Optional.empty();
        int result = compare(player1.getInput(), player2.getInput());
        if (result == 1 ){
            winner = Optional.of(player1);
        } else if (result == -1) {
            winner = Optional.of(player2);
        }
        return winner;
    }

    /**
     *
     * @param p1
     * @param p2
     * @return 1 if p1 > p2
     *         0 if p1 == p2
     *         -1 if p1 < p2
     */
    private int compare(INPUT p1, INPUT p2) {
        if (p1 == INPUT.ROCK && p2 == INPUT.SCISSOR) {
            return 1;
        }

        if (p1 == INPUT.PAPER && p2 == INPUT.ROCK) {
            return 1;
        }

        if (p1 == INPUT.SCISSOR && p2 == INPUT.PAPER) {
            return 1;
        }

        if (p1 == p2) {
            return 0;
        }

        return -1;
    }
}
