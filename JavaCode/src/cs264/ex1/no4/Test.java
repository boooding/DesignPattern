package cs264.ex1.no4;

public class Test {
    public static void main(String[] args) {
        Light rl = TrafficLight.getTrafficLight("red");
        Light gl = TrafficLight.getTrafficLight("green");
        Light yl = TrafficLight.getTrafficLight("yellow");
        System.out.println(rl.col);
        System.out.println(gl.col);
        System.out.println(yl.col);
    }
}
