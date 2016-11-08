package nyc.c4q;

public class ScissorParrot implements Player {
    private int mScore = 0;

    @Override
    public INPUT getInput() {
        return INPUT.SCISSOR;
    }

    @Override
    public int getScore() {
        return mScore;
    }

    @Override
    public void resetScore() {
        mScore = 0;
    }

    @Override
    public void incrementScore() {
        mScore += 1;
    }

    @Override
    public String getName() {
        return "ScissorParrot";
    }
}
