package OOP_Lesson_1;
/** Автомобиль
 *
 */

public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public   int year;
    public String country;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
