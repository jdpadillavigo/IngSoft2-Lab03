package ejercicio_02.solucion;

public class MobileWarrior extends Character {
    @Override
    public void attack(Character target) {
        int damage = (this.weapon != null) ? this.weapon.getDamage() : 5; // 5 de daño base sin arma
        System.out.println("Guerrero Mobile ataca con efectos básicos a " + target.name);
        if (this.weapon != null) {
            this.weapon.use();
        }
        target.takeDamage(damage);
    }
}
