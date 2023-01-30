package Driver;

import static java.lang.System.out;

public class DriverD extends DriverBase {
    public DriverD (String name, boolean hasDriversLicense, int drivingExperienceInYears) {
        super(name, hasDriversLicense, drivingExperienceInYears);
    }

    @Override
    public void startMove() {
        out.println("Водитель категории D " + getName() + " начал движение. ");

    }

    @Override
    public void stopMove() {
        out.println(" Водитель категории D " + getName() + " становился");
    }

    @Override
    public void refill() {
        out.println("Водитель категории C " + getName()+ " заправил авто.");
    }
}
