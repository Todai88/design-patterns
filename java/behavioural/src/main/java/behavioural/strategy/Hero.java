package strategy;

public class Hero implements Character {
    final String name;
    final int damage;

    public Hero(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public int attack(Weapon weaponStrategy) {
        return weaponStrategy.attack(this.damage);
    }

    @Override
    public void printAttack(Weapon weaponStrategy) {
        System.out.println(String.format("The hero %s attacks with a %s. %s deals %d damage",
                this.name, weaponStrategy.getWeapon(),
                this.name, attack(weaponStrategy)));
    }
}
