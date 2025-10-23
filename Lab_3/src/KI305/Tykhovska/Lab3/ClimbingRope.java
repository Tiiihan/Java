package KI305.Tykhovska.Lab3;

/**
 * Клас {@code ClimbingRope} описує мотузку для альпінізму.
 */
public class ClimbingRope {
    private RopeType type;
    private int length;
    private float diameter;
    private int breakingLoad;

    /**
     * @param type тип мотузки (STATIC або DYNAMIC)
     * @param length довжина у метрах
     * @param diameter діаметр у мм
     * @param breakingLoad руйнівне навантаження у кг
     */
    public ClimbingRope(RopeType type, int length, float diameter, int breakingLoad) {
        this.type = type;
        this.length = length;
        this.diameter = diameter;
        this.breakingLoad = breakingLoad;
    }

    /** @return тип мотузки */
    public RopeType getType() { return type; }
    /** @param type новий тип мотузки */
    public void setType(RopeType type) { this.type = type; }

    /** @return довжина у метрах */
    public int getLength() { return length; }
    /** @param length нова довжина */
    public void setLength(int length) { this.length = length; }

    /** @return діаметр мотузки */
    public float getDiameter() { return diameter; }
    /** @param diameter новий діаметр */
    public void setDiameter(float diameter) { this.diameter = diameter; }

    /** @return руйнівне навантаження у кг */
    public int getBreakingLoad() { return breakingLoad; }
    /** @param breakingLoad нове руйнівне навантаження */
    public void setBreakingLoad(int breakingLoad) { this.breakingLoad = breakingLoad; }

    /** Виводить інформацію про мотузку. */
    public void ShowInfo() {
        System.out.println("Climbing rope");
        System.out.printf("\tType: %s, length: %d, diameter: %.1f, breaking load: %d kH%n",
                this.type, this.length, this.diameter, this.breakingLoad);
    }
}
