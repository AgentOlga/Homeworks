import Driver.DriverD;

public class Bus extends Transport<DriverD> {
    private Capacity capacity;
    public Bus (String brand, String model, double engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
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
    public void printType() {
        if (capacity != null) {
            System.out.println(capacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно.");
        }
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса" + getBrand());
    }

    @Override
    public void theBestLapTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMin = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах " + theBestTimeInMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 50;
        int maxBound = 80;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость автобуса " + maxSpeed);
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
