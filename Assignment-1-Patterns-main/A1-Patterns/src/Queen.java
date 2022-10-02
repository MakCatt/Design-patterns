public class Queen extends Character {

    public Queen() {

        super.weapon = new BowAndArrowBehavior();
    }

    public void fight() {

        super.weapon.useWeapon();
    }
}
