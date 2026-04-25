package ejercicio_02.solucion;

public abstract class Character {
    protected String name;
    protected String platform;
    protected int health = 100;
    protected Weapon weapon;

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(this.name + " equipó " + weapon.name);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " (" + this.platform + ") recibe " + damage + " de daño. Vida restante: " + this.health);
    }

    public abstract void attack(Character target);
}
