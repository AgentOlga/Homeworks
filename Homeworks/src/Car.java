import Driver.DriverB;


/** Автомобиль
 *
 */

public class Car extends Transport <DriverB> {
    private BodyType bodyType;
    public Car (String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
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
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Данных по транспортному средству недостаточно.");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля." + getBrand());

    }

    @Override
    public void theBestLapTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMin = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах " + theBestTimeInMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 50;
        int maxBound = 80;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость автомобиля " + maxSpeed);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}



