package cs264.ex2.no1;

public abstract class Prototype implements Cloneable{
    @Override
    public Prototype clone() {
        try {
            return (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
