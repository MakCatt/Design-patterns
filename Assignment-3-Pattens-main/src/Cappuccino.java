public class Cappuccino implements Beverage {

    @Override
    public void getDesc() {
        System.out.println("coffee: cappuccino");
    }

    @Override
    public int Price() {
        return 15;
    }
}
