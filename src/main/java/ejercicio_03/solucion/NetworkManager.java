package ejercicio_03.solucion;

public class NetworkManager {
    GameConfig config;

    public NetworkManager() {
        this.config = new GameConfig();
        config.setDebugMode(true);
    }

    public void connect() {
        System.out.println("Conectando a: " + config.getDatabaseUrl());
    }
}
