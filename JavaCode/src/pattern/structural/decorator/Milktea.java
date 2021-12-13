package pattern.structural.decorator;

public class Milktea extends MilkteaAB{
    @Override
    protected String getMaterial() {
        return "milktea";
    }

    @Override
    protected int cost() {
        return 10;
    }
}
