package transport;

public class Main {

        public static void main(String[] args) {
        Car lada = new Car("Lada",  "Lada Granta", 1.7, "yellow", 2015, "Russia", "auto", "sedan", "A009ss", 5, true, false, false);

        Car bmw = new Car("BMW","BMW Z8", 3.0, "black", 2021, "Germany", "auto", "coupe", "DK300 195", 4, false, true, true);

        System.out.println(bmw);

        System.out.println(lada);

    }
}

