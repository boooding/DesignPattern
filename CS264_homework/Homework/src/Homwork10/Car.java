package Homwork10;

public class Car implements Vehicle{
    private String engine;
    private String color;

    @Override
    public void start() {
        System.out.println("car start");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
