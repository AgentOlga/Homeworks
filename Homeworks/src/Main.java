import Driver.*;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Водитель категории B",
                    true, 3);

            Car car = new Car("Brand" ,
                    "Model" ,
                    2.6, driverB, BodyType.Coupe);

            DriverD driverD = new DriverD("Водитель категории D",
                    true, 1);

            Bus bus = new Bus("Brand" ,
                    "Model" ,
                    2.6, driverD, Capacity.LARGE);
            DriverC driverC = new DriverC("Водитель категории C",
                    true, 5);

            Truck truck = new Truck("Brand" ,
                    "Model" ,
                    7.6, driverC, BearingCapacity.N2);


            printInfo(car);
            printInfo(bus);
            printInfo(truck);

        }
    }


    public static void printInfo(Transport<?> transport) {
        System.out.println(" " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде.");
    }
}



