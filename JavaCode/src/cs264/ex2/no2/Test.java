package cs264.ex2.no2;

public class Test {
    public static void main(String[] args) {

        Director director = new Director();
        IBuilder booding1 = new ComputerUser("booding","Xiu",20,"booding Xiu","1891234");
        IBuilder booding2 = new ComputerUser("boooding","Cai",20,"boooding Cai","1891235");

        director.construct(booding1);
        User user1 = booding1.getUser();
        System.out.println("First User");
        user1.showUser();

        director.construct(booding2);
        User user2 = booding2.getUser();
        System.out.println("Second User");
        user2.showUser();

    }
}
