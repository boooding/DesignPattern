package cs264.homework3;

public class Director
{
    Builder builder;
    // Director knows how to use the builder and the sequence of steps.
    public void construct(Builder builder)
    {
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.addCPU();
        builder.addRam();
        builder.addDisplay();
        builder.addKeyboard();
        builder.endOperations();
    }
}

