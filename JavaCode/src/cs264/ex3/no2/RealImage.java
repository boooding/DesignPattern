package cs264.ex3.no2;
//a string number fileName,
//        a number function loadFromDisk()
//        a number function display().
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        loadFromDisk();
        System.out.println("Image " + this.fileName + " is displayed");
    }

    public void loadFromDisk() {
        System.out.println("Image loaded from disk");
    }
}
