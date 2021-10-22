package cs264.ex4.no2;

public class Decorator implements Machine{
    protected Machine machine;
    @Override
    public void run() {
        machine.run();
    }
    public Decorator(Machine machine) {
        this.machine = machine;
    }

}
