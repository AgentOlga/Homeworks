import Driver.*;

public class Truck extends Transport <DriverC> {
         public Truck (String brand, String model, double engineVolume, DriverC driver) {
             super(brand, model, engineVolume, driver);
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
    public void pitStop(){
        System.out.println("Пит-стоп у грузовика.");
    }

    @Override
    public void theBestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }
}
