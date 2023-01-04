package OOP_Lesson_1;
/** Автомобиль
 *
 */

public class Car3 {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public   int year;
    public String country;

    public static final String DEFAULT_VALUE = "default";
    public static final double DEFAULT_ENGINE_VOLUME = 1.5;
    public static final String DEFAULT_COLOR = "white";
    public static final int DEFAULT_YEAR = 2000;

    public Car3(String brand, String model, double engineVolume, String color, int year, String country) {

        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setColor(color);
        setYear(year);
        setCountry(country);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

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

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
    }
    }

    public void setEngineVolume(double engineVolume) {
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

    public void setYear(int year) {
        if(year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return "Car3{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}

