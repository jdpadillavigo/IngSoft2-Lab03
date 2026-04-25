package ejercicio_03.solucion;

public class DatabaseManager {
    GameConfig config;

    public DatabaseManager() {
        this.config = GameConfig.getInstance();
    }

    public void saveData() {
        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Máximo jugadores permitidos: " + config.getMaxPlayers());
    }
}
