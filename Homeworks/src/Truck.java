import Driver.*;

public class Truck extends Transport <DriverC> {
        private BearingCapacity bearingCapacity;
         public Truck (String brand, String model, double engineVolume, DriverC driver, BearingCapacity bearingCapacity) {
             super(brand, model, engineVolume, driver);
             this.bearingCapacity = bearingCapacity;
         }

    @Override
    public void startMove() {
        System.out.println("Грузовик " + getBrand()  +" начал движение.");
    }

    @Override
    public void stopMove() {
        System.out.println("Грузовик " + getBrand() + " остановился.");
    }

    @Override
    public void printType() {
        if (bearingCapacity != null) {
            System.out.println(bearingCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно.");
        }
    }
    @Override
    public void pitStop(){
        System.out.println("Пит-стоп у грузовика." + getBrand());
    }

    @Override
    public void theBestLapTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMin = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах " + theBestTimeInMin);

    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость грузовика " + maxSpeed);
    }

    public BearingCapacity getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(BearingCapacity bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }
}
