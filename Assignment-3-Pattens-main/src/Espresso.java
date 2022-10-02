public class Espresso implements Beverage{

    @Override
    public void getDesc() {
        System.out.println("coffee: espresso");
    }

    @Override
    public int Price() {
        return 10;
    }
}
