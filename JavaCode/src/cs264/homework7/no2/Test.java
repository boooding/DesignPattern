package cs264.homework7.no2;

public class Test {
    public static void main(String[] args) {
        BYD byd = new BYD();
        byd.showComponent();
        Decorator bydGPS = new DecoratorGPS(byd);
        bydGPS.showComponent();
        Decorator bydGPSGrapher = new DecoratorGrapher(bydGPS);
        bydGPSGrapher.showComponent();
    }
}
