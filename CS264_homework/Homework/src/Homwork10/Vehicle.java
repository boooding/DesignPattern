package Homwork10;
/*
    1.
    Create a Vehicle interface according to the Flyweight pattern.

    2.
    we need to make sure to expose all the relevant methods:
    start(), stop(), getColor().

    3.
    Next up, create a Car class as a concrete Vehicle.
    implements all the methods of the Vehicle interface.
    As for its state, it should have an engine and a color field.

    4.
    Finally, you need to create the VehicleFactory,
    the factory only creates one vehicle per color.
 */
public interface Vehicle {
    void start();
    void stop();
    String getColor();
}
