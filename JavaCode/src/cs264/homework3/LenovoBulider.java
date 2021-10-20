package cs264.homework3;

public class LenovoBulider implements Builder
{
    private String brandName;
    private Product product;
    public LenovoBulider(String brand)
    {
        product = new Product();
        this.brandName = brand;
    }
    public void startUpOperations()
    {
        //Starting with brand name
        product.add(String.format("Lenovo model is :%s",this.brandName));
    }
    public void buildBody()
    {
        product.add("This is a body of a Lenovo Computer");
    }
    public void addCPU()
    {
        product.add("CPU are added");
    }
    public void addRam()
    {
        product.add("Ram are added");
    }
    public void addDisplay()
    {
        product.add("Display are added");
    }
    public void addKeyboard()
    {
        product.add("Keyboard are added");
    }
    public void endOperations()
    { //Nothing in this case
    }
    public Product getComputer()
    {
        return product;
    }
}
