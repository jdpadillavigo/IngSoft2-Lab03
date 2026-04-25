package ejercicio_03.solucion;

public class GameSession {
    GameConfig config;

    public GameSession() {
        this.config = new GameConfig();
        config.setDebugMode(true);
    }

    public void startSession() {
        System.out.println("Iniciando sesión...");
        System.out.println("Máximo jugadores: " + config.getMaxPlayers());
    }
}
