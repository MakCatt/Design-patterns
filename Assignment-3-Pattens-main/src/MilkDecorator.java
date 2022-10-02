public class MilkDecorator extends FlavourDecorator {

    public MilkDecorator(Beverage beverage) {

        super(beverage);
    }

    @Override
    public void getDesc() {

        beverage.getDesc();
        addMilk(beverage);
    }

    public void addMilk(Beverage beverage) {

        System.out.println("with milk");
    }

    @Override
    public int Price() {
        return beverage.Price() + 2;
    }
}