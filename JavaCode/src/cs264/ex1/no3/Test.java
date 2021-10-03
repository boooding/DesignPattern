package cs264.ex1.no3;

public class Test {
    public static void main(String[] args) {
        Generator g1 = Generator.getGenerator();
        Generator g2 = Generator.getGenerator();
        System.out.println(g1 == g2);
        System.out.println(g1.getID());
        System.out.println(g2.getID());
    }
}
