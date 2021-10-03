package cs264.ex1.no3;
// Solve exercise 1 in experiment 1 with double-checked locking

public class Generator {
    private volatile static Generator generator;
    private Generator() {}
    private int id = (int)(Math.random() * 100);
    public static Generator getGenerator() {
        if (generator == null) {
            synchronized (Generator.class) {
                if (generator == null) {
                    generator = new Generator();
                }
            }
        }
        return generator;
    }

    public int getID() {
        return id;
    }
}
