package ejercicio_02.solucion;

public abstract class Weapon {
    protected String name;
    protected String platform;
    protected int damage;

    public int getDamage() {
        return damage;
    }

    public abstract void use();
}
