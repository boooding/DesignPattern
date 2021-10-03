package cs264.ex1.no1;

public class Test {
    public static void main(String[] args) {
        Generator g1 = Generator.getGenerator();
        Generator g2 = Generator.getGenerator();
        System.out.print("g1 == g2 is ");
        System.out.print(g1 == g2);
        System.out.println();
        System.out.println("g1 id: " + g1.getId());
        System.out.println("g2 id: " + g2.getId());
    }
}
