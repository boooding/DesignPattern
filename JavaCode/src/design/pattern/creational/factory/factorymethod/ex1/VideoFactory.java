package design.pattern.creational.factory.factorymethod.ex1;

public abstract class VideoFactory {
    public abstract Video getVideo();
//    public Video getVideo(String type) {
//        if (type.equalsIgnoreCase("Java")) {
//            return new JavaVideo();
//        } else if(type.equalsIgnoreCase("Python")) {
//            return new PythonVideo();
//        }
//        return null;
//    }
}
