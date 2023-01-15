public class Main {

    public static void main(String[] args) {
       Car lada = new Car ("Lada", "Lada Granta", 2015, "Russia",  "red", 185, 2.7, "auto", "sedan",
               "AA345", 5,true );
       Car bmw = new Car ("BMW", "BMW Z8", 2022, "Germany",
               "black", 220, 4.5, "auto", "coupe", "DK195", +
               4, true);
       Car audi = new Car("AUDI", "Audi A4", 2021,  "Germany", "red",
              220, 4.5, "auto","sedan", "GR435", 5, false);

       Bus hyundai = new Bus("Hyundai", "H350", "grey", 2020, "Korea", 200);
       Bus man = new Bus("Man","Lion's Coach","yellow",2021, "Germany",
               190);
       Bus volvo = new Bus("Volvo", "Volvo 7900", "yellow", 2019, "Sweden", 200);

        System.out.println(bmw);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(hyundai);
        System.out.println(man);
        System.out.println(volvo);

    }
}
