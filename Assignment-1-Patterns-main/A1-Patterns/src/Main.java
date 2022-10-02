public class Main {

    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();

        king.setWeapon(new BowAndArrowBehavior());

        king.fight();
    }
}
