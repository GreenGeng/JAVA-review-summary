package summary.designMode.observe;


public class Observe {
    /**
     * 观察者
     * 发布订阅
     * 收到通知的 就是 一对多关系里 多的那个就是观察者也就是订阅者
     * 1是发布者 多是订阅者
     *
     */

    public static void main(String[] args) {
        NewspaperOffice office = new NewspaperOffice();
        //当来了一个新报纸
        office.addCustomer(new CustomerA());
        office.addCustomer(new CustomerB());
        office.newspapaer();
    }
}
