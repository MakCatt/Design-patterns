public class Troll extends Character {

    public Troll() {

        super.weapon = new AxeBehavior();
    }

    public void fight() {

        super.weapon.useWeapon();
    }
}
