/**
 * Вместимость
 */
public enum Capacity {
    EXTRA_SMALL(1,10),
    SMALL(10,25),
    MIDDLE(40,50),
    LARGE(60,80),
    EXTRA_LARGE(100, 120);
    private final int bottomLimitCapacity;
    private final int upperLimitCapacity;

    Capacity(int bottomLimitCapacity, int upperLimitCapacity) {
        this.bottomLimitCapacity = bottomLimitCapacity;
        this.upperLimitCapacity = upperLimitCapacity;
    }

    @Override
    public String toString() {
        return "Вместимость:" + bottomLimitCapacity +" - " + upperLimitCapacity + "мест." ;
    }
}
