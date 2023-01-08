package transport;


import java.security.Key;

/** Автомобиль
 *
 */

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private String bodyType;
    private String regNumber;
    private final int numberOfSeat;
    private boolean tyres;
    private CarKey key;

    public static final String DEFAULT_VALUE = "default";
    public static final double DEFAULT_ENGINE_VOLUME = 1.5;
    public static final String DEFAULT_COLOR = "white";
    public static final int DEFAULT_YEAR = 2000;
    public static final int DEFAULT_SEATS = 5;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String regNumber, int numberOfSeat, boolean tyres, boolean remoteStartEngine, boolean keylessEntry)
    {
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

        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }
        if (numberOfSeat <= 0) {
            this.numberOfSeat = DEFAULT_SEATS;
        } else {
            this.numberOfSeat = numberOfSeat;
        }

        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setBodyType(bodyType);
        setTyres(tyres);
        setCarKey(remoteStartEngine,keylessEntry);

    }

    public void setEngineVolume(double engineVolume)
    {
        if (engineVolume <= 0){
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        }else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if(color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public String getBrand() { return brand;}
    public String getModel() {return model;}

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank()) {
            this.regNumber = DEFAULT_VALUE;
        } else {
            this.regNumber = regNumber;
        }
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public boolean isTyres() {
        return tyres;
    }

    public void setTyres(boolean tyres) {
        this.tyres = tyres;
    }

    public void changeTyres(int month) {
        if (month >= 4 && month <= 10) {
        setTyres(true);
    }
        else  {
        setTyres(false);
        }
      }

    public void setCarKey(boolean remoteStartEngine, boolean keylessEntry) {
        this.key = new CarKey(remoteStartEngine,keylessEntry);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", numberOfSeat=" + numberOfSeat +
                ", tyres=" + tyres +
                ", key=" + key +
                '}';
    }
}

    class CarKey {
        private final boolean remoteStartEngine;
        private final boolean keylessEntry;

        public CarKey(boolean remoteStartEngine, boolean keylessEntry) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStartEngine=" + remoteStartEngine +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }
    }


