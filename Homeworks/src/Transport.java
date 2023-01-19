import Driver.*;

public abstract class Transport <T extends DriverBase> implements Racer {
    private final String brand;
    private final String model;
    double engineVolume;
    private final T driver;

    public static final String DEFAULT_VALUE = "default";
    public static final double DEFAULT_ENGINE_VOLUME = 1.5;

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        this.driver = driver;

    }

    public abstract void startMove();
    public abstract void stopMove();

        public String getBrand () {
            return brand;
        }
        public String getModel () {
            return model;
        }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setEngineVolume(double engineVolume) {
            if(engineVolume <= 0 ) {
               engineVolume = DEFAULT_ENGINE_VOLUME;
            }
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver +
                '}';
    }
}