package summary.designMode.abstractfactory;

public class Test {
    public static void main(String[] args) {
        MideaFactory mideaFactory = new MideaFactory();
        mideaFactory.getGridge().produce();
        mideaFactory.getAirConditioner().produce();

        GreeFactory greeFactory = new GreeFactory();
        greeFactory.getGridge().produce();
        greeFactory.getAirConditioner().produce();


    }
}
