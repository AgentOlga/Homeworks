import Driver.DriverD;

public class Bus extends Transport<DriverD> {
    public Bus (String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void  startMove() {
        System.out.println("Автобус марки " + getBrand() + getModel() + " начал движение.");
    }
    @Override
    public void stopMove() {
        System.out.println("Автобус марки " + getBrand() + getModel() + " остановился. ");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void theBestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }

}
