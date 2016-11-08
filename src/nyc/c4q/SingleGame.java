package nyc.c4q;

import java.util.Optional;

public class SingleGame {
    private int mNumberRounds;
    private Player mPlayer1;
    private Player mPlayer2;

    public SingleGame(Player player1, Player player2, int numberOfRounds) {
        mPlayer1 = player1;
        mPlayer2 = player2;
        mNumberRounds = numberOfRounds;
    }

    public int getCurrentRound(){
        return mPlayer1.getScore() + mPlayer2.getScore();
    }

    public boolean isGameOver(){
        int majorityWins = mNumberRounds / 2 + 1;
        return mPlayer1.getScore() >= majorityWins ||
                mPlayer2.getScore() >= majorityWins;
    }

    public void playRound() {
        Round round = new Round();
        Optional<Player> winner = round.playRound(mPlayer1, mPlayer2);
        if (winner.isPresent()){
            winner.get().incrementScore();
        }
    }

    public Player getWinner() {
        if ( mPlayer1.getScore() > mPlayer2.getScore()){
            return mPlayer1;
        }

        if (mPlayer2.getScore() > mPlayer1.getScore()) {
            return mPlayer2;
        }

        throw new IllegalStateException("No Winner");
    }
}
