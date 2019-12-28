package strategy;

public class GameLogic {
    public static void main(String[] args) {
        var bethany = new Hero(10, "Bethany the stronk");
        var joakim = new Hero(5, "Joakim the sneaky rogue");
        var nigel = new Monster(15, "Nigel the angry");
        var ditz = new Monster(3, "Ditz the leave-voter");
        bethany.printAttack(new Claymore());
        joakim.printAttack(new Longbow());
        nigel.printAttack(new Hammer());
        ditz.printAttack(new Dagger());
    }
}
