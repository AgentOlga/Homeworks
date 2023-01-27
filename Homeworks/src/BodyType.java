
/**
*Тип кузова автомобиля
 */

public enum BodyType {
    Sedan("Седан"),
    Hatchback ("Хетчбек"),
    Coupe("Купе"),
    StationWagon("Универсал"),
    OffRoad("Внедорожник"),
    Crossover("Кроссовер"),
    Pickup("Пикап"),
    Van("Фургон"),
    Minivan("Минивэн");

    private final String name;

    BodyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Тип кузова : " + name;
    }
}
