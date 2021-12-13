package pattern.structural.proxy.ex1.staticproxy;

import pattern.structural.proxy.ex1.IOrderService;
import pattern.structural.proxy.ex1.Order;
import pattern.structural.proxy.ex1.OrderServiceImpl;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod();

        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("proxy static is assigned to db" + dbRouter);

        afterMethod();
        return 0;
    }

    private void beforeMethod() {
        System.out.println("static proxy before");
    }

    private void afterMethod()  {
        System.out.println("static proxy after");
    }

}
