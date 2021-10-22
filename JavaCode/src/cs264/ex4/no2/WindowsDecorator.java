package cs264.ex4.no2;

public class WindowsDecorator extends Decorator{

    public WindowsDecorator(Machine machine) {
        super(machine);
    }
    public void setWindows() {
        System.out.println("set windows");
    }
    public void run(){
        System.out.println("");
        machine.run();
    }
}
