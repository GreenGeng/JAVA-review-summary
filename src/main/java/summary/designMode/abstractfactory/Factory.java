package summary.designMode.abstractfactory;

public interface Factory {
    //生产冰箱
    Fridge getGridge();
    //生产空调
    AirConditioner getAirConditioner();
}
