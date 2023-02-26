package summary.designMode.observe;

import java.util.List;

public class Observe {
    /**
     * 观察者
     * 发布订阅
     * 订阅者
     * 发布者
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
