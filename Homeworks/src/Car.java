import Driver.DriverB;


/** Автомобиль
 *
 */

public class Car extends Transport <DriverB> {
    public Car (String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);

    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение.");

    }

    @Override
    public void stopMove() {
        System.out.println(" Автомобиль марки " +getBrand() + " закончил движение ");

    }



    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля.");

    }

    @Override
    public void theBestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }
}



