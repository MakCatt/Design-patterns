public class King extends Character {

    public King() {

        super.weapon = new SwordBehavior();
    }

    public void fight() {

        super.weapon.useWeapon();
    }
}
