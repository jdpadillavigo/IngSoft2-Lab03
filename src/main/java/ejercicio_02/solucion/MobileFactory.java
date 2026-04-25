package ejercicio_02.solucion;

public class MobileFactory implements GameElementFactory {
    @Override
    public Character createWarrior() {
        return new MobileWarrior();
    }

    @Override
    public Character createEnemy() {
        return new MobileEnemy();
    }

    @Override
    public Weapon createSword() {
        return new MobileSword();
    }

    @Override
    public Weapon createClaw() {
        return new MobileClaw();
    }
}
