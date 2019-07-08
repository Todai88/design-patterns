package strategy;

public class Longbow implements Weapon {
    final int LONGBOW_MODIFIER = 7;

    @Override
    public int attack(int damage) {
        return damage * LONGBOW_MODIFIER;
    }

    @Override
    public String getWeapon() {
        return "Longbow";
    }
}
