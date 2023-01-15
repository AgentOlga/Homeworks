/** Автомобиль
 *
 */

public class Car extends Transport {


    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String regNumber;
    private final int numberOfSeat;
    private boolean tyres;


    public static final String DEFAULT_VALUE = "default";
    public static final double DEFAULT_ENGINE_VOLUME = 1.5;
    public static final String DEFAULT_COLOR = "white";
    public static final int DEFAULT_YEAR = 2000;
    public static final int DEFAULT_SEATS = 5;


    public Car (String brand, String model, int yearOfManufactureOfTheVehicle, String countryProduction, String bodyColor, int maxMovementSpeed, double engineVolume, String transmission, String bodyType, String regNumber, int numberOfSeat, boolean tyres) {
        super (brand, model, yearOfManufactureOfTheVehicle, countryProduction, bodyColor, maxMovementSpeed);

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
        setTransmission(transmission);
        setBodyType(bodyType);
        setTyres(tyres);

    }

    public void setEngineVolume(double engineVolume)
    {
        if (engineVolume <= 0){
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        }else {
            this.engineVolume = engineVolume;
        }
    }


    public double getEngineVolume() {
        return engineVolume;
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

    @Override
    public String toString() {
        return "Car{" +
                " brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", bodyColor='" + getBodyColor() + '\'' +
                ", yearOfManufactureOfTheVehicle=" + getYearOfManufactureOfTheVehicle() +
                ", countryProduction='" + getCountryProduction() + '\'' +
                ", maxMovementSpeed=" + getMaxMovementSpeed() +
                " engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", numberOfSeat=" + numberOfSeat +
                ", tyres=" + tyres +
                '}';
    }
}



