package summary.designMode.abstractfactory;

public class MideaFactory implements Factory{
    @Override
    public Fridge getGridge() {
        return new MideaFridge();
    }

    @Override
    public AirConditioner getAirConditioner() {
        return new MideaAirConditioner();
    }
}
