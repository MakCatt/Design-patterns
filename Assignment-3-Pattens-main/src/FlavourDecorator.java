public abstract class FlavourDecorator implements Beverage {

    public Beverage beverage;

    public FlavourDecorator(Beverage beverage) {

        this.beverage = beverage;
    }

    @Override
    public int Price() {
        return 0;
    }
}
