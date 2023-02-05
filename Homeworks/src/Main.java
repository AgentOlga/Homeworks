import Driver.*;
import Exception.*;
import jdk.jfr.StackTrace;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Car car = null;
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Водитель категории B",
                    true, 3);

            car = new Car("Brand",
                    "Model",
                    2.6, driverB, BodyType.Coupe);

            DriverD driverD = new DriverD("Водитель категории D",
                    true, 1);

            Bus bus = new Bus("Brand",
                    "Model",
                    2.6, driverD, Capacity.LARGE);
            DriverC driverC = new DriverC("Водитель категории C",
                    true, 5);

            Truck truck = new Truck("Brand",
                    "Model",
                    7.6, driverC, BearingCapacity.N2);


            printInfo(car);
            printInfo(bus);
            printInfo(truck);

            try {
                car.diagnostics();
            } catch (PassDiagnosticsException e) {
                e.printStackTrace();
            }

        }

        List<DriverBase> driverBases = new ArrayList<>();
        driverBases.add(new DriverB("Водитель категории B", true, 3));
        driverBases.add(new DriverC("Водитель категории C", true, 5));
        driverBases.add(new DriverD("Водитель категории D", true, 1));


        Mechanic mechanic1 = new Mechanic("John Jorgen", "AUDI", TransportType.ALL);
        Mechanic mechanic2 = new Mechanic("Peter Jannick", "BMW", TransportType.ALL);
        Mechanic mechanic3 = new Mechanic("Agneshka Borzova", "Minicars", TransportType.CAR);
        Mechanic mechanic4 = new Mechanic("Boris Jonson", "Drive and Life", TransportType.TRUCK);
        Mechanic mechanic5 = new Mechanic("Ivan Ivailo", "Berezka", TransportType.BUS);

        car.addMechanics(mechanic1);
        car.addMechanics(mechanic2);
        car.addMechanics(mechanic3);

        Bus bus = new Bus("Mercedes", "HG%", 34.5, new DriverD("Водитель категории C ", true, 5), Capacity.EXTRA_SMALL);
        bus.addMechanics(mechanic1);
        bus.addMechanics(mechanic5);


        Truck truck = new Truck("VOLVO", "GH7", 45.9, new DriverC("Georg Georgiev ", true, 12), BearingCapacity.N2);
        truck.addMechanics(mechanic4);
        truck.addMechanics(mechanic2);


        List<Transport<?>> racers = new ArrayList<>();
        racers.add(car);
        racers.add(truck);
        racers.add(bus);


        for (Transport<?> transport : racers) {
            System.out.println(transport + " " + transport.getDriver() + transport.getMechanics());
        }

        CarService carService = new CarService();
        carService.addTransport(car);
        carService.addTransport(bus);
        carService.addTransport(truck);

        carService.runCarService();
        carService.runCarService();
        carService.runCarService();


        Map < Transport<?>, Mechanic> transportMechanicMap = new HashMap<>();
        for (Transport<?> racer : racers) {
            for(Mechanic mechanic : racer.getMechanics()){
                transportMechanicMap.put(racer, mechanic);
            }
        }
        System.out.println(transportMechanicMap);
    }

        public static void printInfo (Transport < ? > transport){
            System.out.println(" " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде.");
        }
    }




