package strategy;

public class Hammer implements Weapon {
    final int HAMMER_MODIFIER = 50;

    @Override
    public int attack(int damage) {
        return HAMMER_MODIFIER * damage;
    }

    @Override
    public String getWeapon() {
        return "Hammer";
    }
}
