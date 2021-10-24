package cs264.homework7.uml;

public abstract class Decorator extends ObjectAbstract{
    Object object;

    public Decorator(Object object) {
        this.object = object;
    }

    @Override
    protected void doSomething() {

    }

    protected abstract void doSomethingInDecorator();
}

class DecoratorA extends Decorator {
    public DecoratorA(Object object) {
        super(object);
    }

    @Override
    protected void doSomething() {
        super.doSomething();
    }

    @Override
    protected void doSomethingInDecorator() {

    }
}

class DecoratorB extends Decorator {
    public DecoratorB(Object object) {
        super(object);
    }

    @Override
    protected void doSomething() {
        super.doSomething();
    }

    @Override
    protected void doSomethingInDecorator() {

    }
}
