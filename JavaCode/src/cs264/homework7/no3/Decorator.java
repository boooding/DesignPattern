package cs264.homework7.no3;

public abstract class Decorator implements Shape{
    protected Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public abstract void draw();
}

class ShapeDecorator extends Decorator {
    private double edges = 0;
    private double interior = 0;

    public ShapeDecorator(Shape shape) {
        super(shape);
    }

    public ShapeDecorator(Shape shape, double edges, double interior) {
        super(shape);
        this.edges = edges;
        this.interior = interior;
    }

    public double getEdges() {
        return edges;
    }

    public void setEdges(double edges) {
        this.edges = edges;
    }

    public double getInterior() {
        return interior;
    }

    public void setInterior(double interior) {
        this.interior = interior;
    }

    @Override
    public void draw() {
        System.out.println("Shape is drew with edges " + this.edges + " interior" + this.interior);
    }
}

class Circlefill extends Decorator {
    private String Color = "";

    public Circlefill(Shape shape) {
        super(shape);
    }

    public void setedgefill(String color) {
        this.Color = color;
        System.out.println("The Color is drew to " + color);
    }

    @Override
    public void draw() {

    }
}