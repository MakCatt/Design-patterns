public class Test {

    public static void main(String[] args) throws Exception {

        Cappuccino cappuccino = new Cappuccino();

        Espresso espresso = new Espresso();

        MilkDecorator cappuccinoWithMilk = new MilkDecorator(new Cappuccino());

        ChocolateDecorator espressoWithChocolate = new ChocolateDecorator(new Espresso());

        cappuccino.getDesc();

        espresso.getDesc();

        cappuccinoWithMilk.getDesc();

        espressoWithChocolate.getDesc();

        System.out.println(cappuccino.Price());

        System.out.println(espresso.Price());

        System.out.println(cappuccinoWithMilk.Price());

        System.out.println(espressoWithChocolate.Price());
    }
}
