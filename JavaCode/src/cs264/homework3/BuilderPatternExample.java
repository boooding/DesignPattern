package cs264.homework3;

public class BuilderPatternExample {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");
        Director director = new Director();
        Builder MacAirComputer = new MacBulider("MacAir");
        Builder LenovoComputer = new LenovoBulider("Y7000P");
        // Making Computer
        director.construct(MacAirComputer);
        Product p1 = MacAirComputer.getComputer();
        p1.showProduct();
        director.construct(LenovoComputer);
        Product p2 = LenovoComputer.getComputer();
        p2.showProduct();
    }
}