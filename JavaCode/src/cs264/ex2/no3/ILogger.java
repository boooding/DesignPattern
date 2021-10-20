package cs264.ex2.no3;

public interface ILogger {
    void save();
    void display();
}
abstract class LoggerFactory {
    public abstract ILogger creatLogger();
}
