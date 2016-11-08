package nyc.c4q;

public class Main {

    public static void main(String[] args) {
        PaperGal player1 = new PaperGal();
        ScissorParrot player2 = new ScissorParrot();
        RockDude player3 = new RockDude();
        SingleGame game = new SingleGame(player3, player2, 5);

        while (!game.isGameOver()){
            System.out.println("Current Round: "+ game.getCurrentRound());
            game.playRound();
        }

        System.out.println(game.getWinner().getName());
    }
}
