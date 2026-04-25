package ejercicio_02.solucion;

public class Cliente {
    public static void main(String[] args) {
        PCFactory pcFactory = new PCFactory();
        MobileFactory mobileFactory = new MobileFactory();

        Character pcWarrior = pcFactory.createWarrior();
        Character mobileEnemy = mobileFactory.createEnemy();

        Weapon pcSword = pcFactory.createSword();
        Weapon mobileClaw = mobileFactory.createClaw();

        pcWarrior.equipWeapon(pcSword);
        mobileEnemy.equipWeapon(mobileClaw);

        System.out.println("--- Inicio del combate ---");
        pcWarrior.attack(mobileEnemy);
        mobileEnemy.attack(pcWarrior);

        Weapon mobileSword = mobileFactory.createSword();
        pcWarrior.equipWeapon(mobileSword);
        System.out.println("--- Combate Inconsistente ---");
        pcWarrior.attack(mobileEnemy);
    }
}
