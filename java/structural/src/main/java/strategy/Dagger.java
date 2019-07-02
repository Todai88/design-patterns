package strategy;

public class Dagger implements Weapon {

    final int DAGGER_MODIFIER = 4;

    @Override
    public int attack(int damage) {
        return DAGGER_MODIFIER * damage;
    }

    @Override
    public String getWeapon() {
        return "Dagger";
    }
}
