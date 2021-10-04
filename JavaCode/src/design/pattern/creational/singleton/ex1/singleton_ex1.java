package design.pattern.creational.singleton.ex1;

public class singleton_ex1 {
    public static void main(String[] args) {
        // Constructor is private.We cannot use "new" here.
        // Captain c = new Captain(); is error
        Captain c1 = Captain.getCaptain();
        Captain c2 = Captain.getCaptain();
        System.out.println(c1 == c2);
    }
}
final class Captain {
    // instance
    private static Captain captain;

    // construct
    private Captain() {}

    public static synchronized Captain getCaptain() {
        // Lazy initialization
        if (captain == null) {
            captain = new Captain();
            System.out.println("New captain is elected for your team.");
        } else {
            System.out.print("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;
        // Because the singleton instance will not be created until the getCaptain() method is called.
        // delay the object creation process.
    }
}

final class Captain2 {
    // eager
    private static final Captain2 captain = new Captain2();
    private Captain2() {}
    public static synchronized Captain2 getCaptain() {
        return captain;
    }
}

