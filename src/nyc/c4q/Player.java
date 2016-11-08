package nyc.c4q;

public interface Player {
    INPUT getInput();
    int getScore();
    void resetScore();
    void incrementScore();

    String getName();
}
