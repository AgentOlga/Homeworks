/**
 * Грузоподъемность
 */
public enum BearingCapacity {
    N1(0.0f,3.5f),
    N2(3.5f,12.0f),
    N3(12.0f,null);
    private Float bottomLimit;
    private Float upperLimit;

    BearingCapacity(Float bottomLimit, Float upperLimit) {
        this.bottomLimit = bottomLimit;
        this.upperLimit = upperLimit;
    }

    public Float getBottomLimit() {
        return bottomLimit;
    }

    public Float getUpperLimit() {
        return upperLimit;
    }

    @Override
    public String toString() {
        if(upperLimit != null) {
            return "Грузоподъемность: от " + bottomLimit +" тонн до " + upperLimit + "тонн." ;
        } else {
            return  " Грузоподъемность: до " + bottomLimit + "тонн. до";
        }

    }
}
