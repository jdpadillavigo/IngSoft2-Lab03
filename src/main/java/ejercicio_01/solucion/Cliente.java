package ejercicio_01.solucion;

public class Cliente {
    public static void main(String[] args) {
//        PuzzleFactory creator = new PuzzleFactory();
//        creator.playGame();
//
//        Game gamePuzzle = creator.createGame();
//        gamePuzzle.start();

        RPGFactory creator = new RPGFactory();
        creator.playGame();

        Game gameRPG = creator.createGame();
        gameRPG.start();
    }
}
