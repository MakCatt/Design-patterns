public class ChocolateDecorator extends FlavourDecorator {

    public ChocolateDecorator(Beverage beverage) {

        super(beverage);
    }

    @Override
    public void getDesc() {

        beverage.getDesc();
        addChocolate(beverage);
    }

    public void addChocolate(Beverage beverage) {

        System.out.println("with chocolate");
    }

    @Override
    public int Price() {
        return beverage.Price() + 3;
    }
}
