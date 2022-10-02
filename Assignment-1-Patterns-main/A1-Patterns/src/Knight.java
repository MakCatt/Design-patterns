public class Knight extends Character {

    public Knight() {

        super.weapon = new KnifeBehavior();
    }

    public void fight() {

        super.weapon.useWeapon();
    }
}