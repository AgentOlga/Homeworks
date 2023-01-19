package Driver;

import static java.lang.System.out;

public class DriverB extends DriverBase {

    public DriverB(String name, boolean hasDriversLicense, int drivingExperienceInYears) {
        super(name, hasDriversLicense, drivingExperienceInYears);
    }

    @Override
    public void startMove() {
        out.println("Водитель категории В " + getName() + " начал движение. ");

    }

    @Override
    public void stopMove() {
        out.println(" Водитель категории B " + getName() + " становился");
    }

    @Override
    public void refill() {
        out.println("Водитель категории В " + getName() + " заправил авто.");
    }
}