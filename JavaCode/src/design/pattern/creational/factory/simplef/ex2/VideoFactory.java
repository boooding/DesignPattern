package design.pattern.creational.factory.simplef.ex2;

public class VideoFactory {
    public Video getVideo(String type) {
        if (type.equalsIgnoreCase("Java")) {
            return new JavaVideo();
        } else if(type.equalsIgnoreCase("Python")) {
            return new PythonVideo();
        }
        return null;
    }
}
