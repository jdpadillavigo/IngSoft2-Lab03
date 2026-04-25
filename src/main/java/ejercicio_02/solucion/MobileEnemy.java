package ejercicio_02.solucion;

public class MobileEnemy extends Character {
    @Override
    public void attack(Character target) {
        int damage = (this.weapon != null) ? this.weapon.getDamage() : 5; // 5 de daño base sin arma
        System.out.println("Enemigo Mobile ataca con furia pixelada a " + target.name);
        if (this.weapon != null) {
            this.weapon.use();
        }
        target.takeDamage(damage);
    }
}
