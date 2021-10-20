package cs264.ex3.no1;

/*
    Write an AbstractFactory interface to produce shoes and clothing.
    The brands include Nike, Anta, and LiNing.
    Write a shoe interface and a clothing interface,
    which have a show() function to show its information of brands.
    Write a Test class to create different brands of shoes and clothing.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        IShoes shoes;
        IClothing clothing;
        // nike
        abstractFactory = new Nike();
        shoes = abstractFactory.createShoes();
        clothing = abstractFactory.createCloth();
        shoes.show();
        clothing.show();
        System.out.println();
        // LiNing
        abstractFactory = new LiNing();
        shoes = abstractFactory.createShoes();
        clothing = abstractFactory.createCloth();
        shoes.show();
        clothing.show();
        System.out.println();
        // Anta
        abstractFactory = new Anta();
        shoes = abstractFactory.createShoes();
        clothing = abstractFactory.createCloth();
        shoes.show();
        clothing.show();
        System.out.println();
    }
}

