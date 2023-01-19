package Driver;

import static java.lang.System.out;

public class DriverC extends DriverBase {
    public DriverC (String name, boolean hasDriversLicense, int drivingExperienceInYears) {
        super(name,hasDriversLicense,drivingExperienceInYears);
    }
    @Override
    public void startMove() {
        out.println("Водитель категории C " + getName() + " начал движение. ");

    }
    @Override
    public void stopMove(){
        out.println(" Водитель категории C " + getName() + " становился");
    }
    @Override
    public void refill() {
        out.println("Водитель категории C " + getName()+ " заправил авто.");
    }
}
