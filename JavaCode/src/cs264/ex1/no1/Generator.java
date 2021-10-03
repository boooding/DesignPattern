package cs264.ex1.no1;

// Use Singleton pattern to write a Generator class with a getID() function
// to generate unique identity (ID) for records in a database.
// Write a Test class to test the Generator class.

public class Generator {
    private final static Generator generator = new Generator();
    private int id;

    private Generator() {
        id = (int)(Math.random() * 100);
    }

    public static Generator getGenerator() {
        return generator;
    }

    public int getId() {
        return id;
    }
}
