public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(4500);
        boss.setDamage(45);
        boss.setBossWeapon();
        System.out.println("Health: " + boss.getHealth() + " Damage: "
                + boss.getDamage() + " Weapon: " + boss.getBossWeapon().getBladeOfChaos());
    }
}