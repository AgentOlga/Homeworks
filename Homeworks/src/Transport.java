public abstract class Transport {
    private final String brand;
    private final String model;
    private String bodyColor;
    private final int yearOfManufactureOfTheVehicle;
    private final String countryProduction;
    private int maxMovementSpeed;

    public static final String DEFAULT_VALUE = "default";
    public static final double DEFAULT_ENGINE_VOLUME = 1.5;
    public static final String DEFAULT_COLOR = "white";
    public static final int DEFAULT_YEAR = 2000;
    public static final int DEFAULT_SEATS = 5;
    public static  final int DEFAULT_SPEED = 185;


    public Transport(String brand, String model, int yearOfManufactureOfTheVehicle, String countryProduction, String bodyColor, int maxMovementSpeed) {
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
        if (yearOfManufactureOfTheVehicle <= 0) {
            this.yearOfManufactureOfTheVehicle = DEFAULT_YEAR;
        } else {
            this.yearOfManufactureOfTheVehicle = yearOfManufactureOfTheVehicle;
        }
        if (countryProduction == null || countryProduction.isBlank()) {
            this.countryProduction = DEFAULT_VALUE;
        } else {
            this.countryProduction = countryProduction;
        }
        if (bodyColor == null || bodyColor.isBlank()) {
            this.bodyColor = DEFAULT_VALUE;
        } else {
            this.bodyColor= bodyColor;
        }
        if (maxMovementSpeed <= 0) {
            this.maxMovementSpeed = DEFAULT_SPEED;
        } else {
            this.maxMovementSpeed = maxMovementSpeed;
        }


    }

        public String getBrand () {
            return brand;
        }
        public String getModel () {
            return model;
        }


        public String getBodyColor () {
            return bodyColor;
        }

    public int getYearOfManufactureOfTheVehicle() {
        return yearOfManufactureOfTheVehicle;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setBodyColor (String bodyColor){
        if (bodyColor == null || bodyColor.isBlank()) {
            this.bodyColor = DEFAULT_COLOR;
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        if (maxMovementSpeed <= 0) {
            this.maxMovementSpeed = DEFAULT_SPEED;
        } else {
            this.maxMovementSpeed = maxMovementSpeed;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", yearOfManufactureOfTheVehicle=" + yearOfManufactureOfTheVehicle +
                ", countryProduction='" + countryProduction + '\'' +
                ", maxMovementSpeed=" + maxMovementSpeed +
                '}';
    }
}
