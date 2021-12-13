package pattern.structural.decorator;

public class BoodingDecorator extends DecoratorAB {
    protected int BoodingPrice = 8;
    public BoodingDecorator(MilkteaAB milkteaAB) {
        super(milkteaAB);
    }

    @Override
    protected String getMaterial() {
        return super.getMaterial() + " + Booding";
    }

    @Override
    protected int cost() {
        return super.cost() + BoodingPrice;
    }
}

class Coconut extends DecoratorAB {
    protected int CoconutPrice = 0;

    public Coconut(MilkteaAB milkteaAB) {
        super(milkteaAB);
    }

    @Override
    protected String getMaterial() {
        return super.getMaterial() + " + Coconut";
    }

    @Override
    protected int cost() {
        return super.cost() + CoconutPrice;
    }
}