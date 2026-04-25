package ejercicio_03.solucion;

public class GameConfig {
    private static GameConfig instance;
    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;

    public GameConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/gamedb";
        this.debugMode = false;
        this.maxPlayers = 100;
    }

    public static GameConfig getInstance() {
        return new GameConfig();
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDebugMode(boolean debug) {
        this.debugMode = debug;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
}
