package cs264.homework7.no2;

public abstract class Decorator implements Car{
    protected Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    @Override
    public abstract void showComponent();
}
class DecoratorGPS extends Decorator {
    @Override
    public void showComponent() {
        addGPS();
    }

    public DecoratorGPS(Car car) {
        super(car);
    }
    public void addGPS() {
        System.out.println("add GPS");
    }
}
class DecoratorGrapher extends Decorator {
    @Override
    public void showComponent() {
        addGrapher();
    }

    public DecoratorGrapher(Car car) {
        super(car);
    }
    public void addGrapher() {
        System.out.println("add Grapher");
    }
}