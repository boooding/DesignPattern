package design.pattern.structural.proxy.ex1;

public class OrderServiceImpl implements IOrderService{
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("service use Order");
        return iOrderDao.insert(order);
    }
}
