package cs264.ex3.no2;

/*
    Write an Image interface and implement an entity of the image interface.
    ProxyImage is a proxy class to reduce the memory consumption of RealImage object loading.
    ProxyPatternDemo class use ProxyImage to get the RealImage to load and display as required.

    Tips:

    1. The Image interface contains a number function display().

    2. The RealImage class has
    a string number fileName,
    a number function loadFromDisk(),
    a number function display().

    3. The ProxyImage class has
    an image number realImage,
    a string number fileName,
    a number function display().

 */
public class Test {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("image1");
        proxyImage.display();
    }
}
