package design.pattern.factory.factorymethod.ex1;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory1 = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();
        Video video2 = videoFactory2.getVideo();
        video2.produce();
    }
}
