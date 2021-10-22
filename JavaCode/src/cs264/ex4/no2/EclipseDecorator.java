package cs264.ex4.no2;

public class EclipseDecorator extends Decorator{
    public EclipseDecorator(Machine machine) {
        super(machine);
    }

    public void setEclipse() {
        System.out.println("set Eclipse");
    }

    public void run() {
        setEclipse();
        machine.run();
    }
}
