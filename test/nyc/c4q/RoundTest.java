package nyc.c4q;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class RoundTest {
    private Round mTestSubject;
    private PaperGal mPaper;
    private ScissorParrot mScissors;
    private RockDude mRock;

    @Before
    public void setUp() throws Exception {
        mTestSubject = new Round();
        mPaper = new PaperGal();
        mScissors = new ScissorParrot();
        mRock = new RockDude();
    }

    @Test
    public void playRound() throws Exception {
        Optional<Player> pvpWinner = mTestSubject.playRound(mPaper, mPaper);
        Optional<Player> rvrWinner = mTestSubject.playRound(mRock, mRock);
        Optional<Player> svsWinner = mTestSubject.playRound(mScissors, mScissors);
        Optional<Player> pvrWinner = mTestSubject.playRound(mPaper, mRock);
        Optional<Player> rvpWinner = mTestSubject.playRound(mRock, mPaper);

        assertEquals(Optional.empty(), pvpWinner);
        assertEquals(true, pvrWinner.isPresent());
        assertEquals(mPaper, pvrWinner.get());
        assertEquals(pvrWinner, rvpWinner);
    }

}