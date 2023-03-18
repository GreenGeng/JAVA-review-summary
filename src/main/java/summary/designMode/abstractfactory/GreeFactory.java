package summary.designMode.abstractfactory;

public class GreeFactory implements Factory{
    @Override
    public Fridge getGridge() {
        return new GreeFridge();
    }

    @Override
    public AirConditioner getAirConditioner() {
        return new GreeAirConditioner();
    }
}
