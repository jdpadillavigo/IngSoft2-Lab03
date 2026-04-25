package ejercicio_01.solucion;

public abstract class GameFactory {
    public abstract Game createGame();

    public void playGame() {
        System.out.println("¡Iniciaste el juego!");
    }
}
