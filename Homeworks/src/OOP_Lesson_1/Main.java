package OOP_Lesson_1;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Lada Granta";
        lada.engineVolume = 1.7;
        lada.color = "yellow";
        lada.year = 2015;
        lada.country = "Russia";

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "BMW Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "black";
        bmw.year = 2021;
        bmw.country = "Germany";

        Car audi = new Car();
        audi.brand = "AUDI";
        audi.model = "Audi A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "black";
        audi.year = 2020;
        audi.country = "Germany";

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Kia Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "red";
        kia.year = 2018;
        kia.country = "South Korea";

        Car hyundai = new Car();
        hyundai.brand ="Hyundai";
        hyundai.model = "Hyundai Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "orange";
        hyundai.year = 2016;
        hyundai.country = "South Korea";

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(lada);
        System.out.println(hyundai);
        System.out.println(kia);

    }
}
