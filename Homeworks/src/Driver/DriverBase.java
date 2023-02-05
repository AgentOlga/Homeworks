package Driver;

public abstract class DriverBase {
   private String name;
   private boolean hasDriversLicense;
   private int drivingExperienceInYears;

    public DriverBase(String name, boolean hasDriversLicense, int drivingExperienceInYears) {
        this.name = name;
        this.hasDriversLicense = hasDriversLicense;
        this.drivingExperienceInYears = drivingExperienceInYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriversLicense() {
        return hasDriversLicense;
    }

    public void setHasDriversLicense(boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
    }

    public int getDrivingExperienceInYears() {
        return drivingExperienceInYears;
    }

    public void setDrivingExperienceInYears(int drivingExperienceInYears) {
        this.drivingExperienceInYears = drivingExperienceInYears;
    }
    public abstract void startMove();
    public abstract void stopMove();
    public abstract void refill();

    @Override
    public String toString() {
        return "Водитель "  + name ;
    }
}
