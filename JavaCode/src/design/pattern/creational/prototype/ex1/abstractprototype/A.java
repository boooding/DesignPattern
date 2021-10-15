package design.pattern.creational.prototype.ex1.abstractprototype;


public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
