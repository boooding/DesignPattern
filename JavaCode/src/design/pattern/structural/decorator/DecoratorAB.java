package design.pattern.structural.decorator;

public class DecoratorAB extends MilkteaAB{
    private MilkteaAB milktea;

    public DecoratorAB(MilkteaAB milkteaAB) {
        this.milktea = milkteaAB;
    }

    @Override
    protected String getMaterial() {
        return this.milktea.getMaterial();
    }

    @Override
    protected int cost() {
        return this.milktea.cost();
    }
}
