package cs264.ex4.no2;

public class LinuxDecorator extends Decorator{
    public LinuxDecorator(Machine machine) {
        super(machine);
    }


    public void run() {
        setLinux();
        machine.run();
    }

    public void setLinux() {
        System.out.println("set linux");
    }
}
