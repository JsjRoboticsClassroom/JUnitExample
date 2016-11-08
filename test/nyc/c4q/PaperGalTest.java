package nyc.c4q;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaperGalTest {
    private PaperGal mTestSubject;

    @Before
    public void setUp() throws Exception {
        mTestSubject = new PaperGal();
    }

    @Test
    public void testResetScore() {
        mTestSubject.setScore(5);
        assertEquals(mTestSubject.getScore(), 5);
        mTestSubject.resetScore();
        assertEquals(mTestSubject.getScore(), 0);
    }

    @Test
    public void testIncrementScore() {
        mTestSubject.resetScore();
        assertEquals(mTestSubject.getScore(), 0);
        mTestSubject.incrementScore();
        assertEquals(mTestSubject.getScore(), 1);
        mTestSubject.incrementScore();
        assertEquals(mTestSubject.getScore(), 2);
    }

    @Test
    public void testGetInput() {
        assertEquals(mTestSubject.getInput(), INPUT.PAPER);
    }
    @After
    public void tearDown() throws Exception {

    }

}