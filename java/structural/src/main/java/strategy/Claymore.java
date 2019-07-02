package strategy;

public class Claymore implements Weapon {

    final int CLAYMORE_MODIFIER = 10;

    @Override
    public int attack(int damage) {
        return CLAYMORE_MODIFIER * damage;
    }

    @Override
    public String getWeapon() {
        return "Claymore";
    }
}
