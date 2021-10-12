package cs264.homework2;

public abstract class Log implements Cloneable{
    @Override
    public Log clone() throws CloneNotSupportedException {
        return (Log)super.clone();
    }
}
