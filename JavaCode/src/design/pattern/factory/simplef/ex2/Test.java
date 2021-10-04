package design.pattern.factory.simplef.ex2;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) { return; }
        video.produce();
    }
}
