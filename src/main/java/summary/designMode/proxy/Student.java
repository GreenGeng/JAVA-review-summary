package summary.designMode.proxy;

import summary.designMode.proxy.Person;

public class Student implements Person {
    @Override
    public void dowork() {
        System.out.println("做作业");
    }
}
