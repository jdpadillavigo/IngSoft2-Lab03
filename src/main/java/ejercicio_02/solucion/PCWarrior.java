package ejercicio_02.solucion;

public class PCWarrior extends Character {
    @Override
    public void attack(Character target) {
        int damage = (this.weapon != null) ? this.weapon.getDamage() : 5; // 5 de daño base sin arma
        System.out.println("Guerrero PC ataca con efectos en HD a " + target.name);
        if (this.weapon != null) {
            this.weapon.use();
        }
        target.takeDamage(damage);
    }
}
