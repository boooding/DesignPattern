package cs264.ex3.no2;

//    3. The ProxyImage class has
//    an image number realImage,
//    a string number fileName,
//    a number function display().
public class ProxyImage implements Image{
    static Image image;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("proxy call happening now");
        if (image == null) {
            image = new RealImage(this.fileName);
        }
        image.display();
    }
}
