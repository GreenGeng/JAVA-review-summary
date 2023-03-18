package summary.designMode.observe;

import java.util.ArrayList;
import java.util.List;

public class NewspaperOffice {
    private List<Customer> list = new ArrayList<>();


    public void addCustomer(Customer customer){
        list.add(customer);
    }

    public void office(){
        //遍历客户挨个通知
        list.forEach(l->l.update());
    }
    //来了一份新的报纸
    public void newspapaer(){
        // 通知所有客户
        office();
    }
}
