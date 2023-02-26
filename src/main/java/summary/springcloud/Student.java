package summary.springcloud;

public class Student implements Person{
    @Override
    public void dowork() {
        System.out.println("做作业");
    }
}
