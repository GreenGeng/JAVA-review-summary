package summary.springcloud;

public class StaticProxy implements Person {

    private  Person person;
    public StaticProxy(Student student){
        this.person = student;
    }

    @Override
    public void dowork() {
        System.out.println("work before");
        person.dowork();
        System.out.println("work after");
    }
}
