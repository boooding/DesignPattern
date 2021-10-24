package cs264.homework7.no3;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        System.out.println();

        Circlefill circlefill = new Circlefill(shape);
        circlefill.setedgefill("Red");
        circlefill.draw();

        ShapeDecorator shapeDecorator = new ShapeDecorator(circlefill, 2.1, 2.1);
        shapeDecorator.setInterior(1.1);
        shapeDecorator.draw();
    }
}
