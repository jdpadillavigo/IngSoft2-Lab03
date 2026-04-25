package ejercicio_02.solucion;

public interface GameElementFactory {
    Character createWarrior();
    Character createEnemy();
    Weapon createSword();
    Weapon createClaw();
}
