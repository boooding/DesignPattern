package pattern.structural.proxy.ex1;

public class OrderDaoImpl implements IOrderDao{
    @Override
    public int insert(Order order) {
        System.out.println("Dao add Order");
        return 1;
    }
}
