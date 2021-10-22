package cs264.ex4.no2;

public class Test {
    public static void main(String[] args) {
        Machine machine = new BareComputer();
        machine.run();
        System.out.println("");
        LinuxDecorator linux = new LinuxDecorator(machine);
        linux.run();
        System.out.println("");
        WindowsDecorator windowsDecorator = new WindowsDecorator(machine);
        windowsDecorator.run();
        System.out.println("");
        EclipseDecorator eclipseDecorator = new EclipseDecorator(machine);
        eclipseDecorator.run();
    }
}
