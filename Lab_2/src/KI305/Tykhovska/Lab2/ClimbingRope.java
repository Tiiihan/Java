package KI305.Tykhovska.Lab2;

/**
 * Клас {@code ClimbingRope} описує мотузку для альпінізму.
 */
public class ClimbingRope {
    private RopeType type; //static or dynamic rope
    private  int length;
    private float diameter;
    private int breakingLoad;

    public ClimbingRope(RopeType type, int length, float diameter, int breakingLoad)
    {
        this.type = type;
        this.length = length;
        this.diameter = diameter;
        this.breakingLoad = breakingLoad;
    }

    public RopeType getType() { return type; }
    public void setType(RopeType type) { this.type = type; }

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public float getDiameter() { return diameter; }
    public void setDiameter(float diameter) { this.diameter = diameter; }

    public int getBreakingLoad() { return breakingLoad; }
    public void setBreakingLoad(int breakingLoad) {  this.breakingLoad = breakingLoad; }

    public void ShowInfo()
    {
        System.out.println("Climbing rope");
        System.out.printf("\tType: %s, length: %d, diameter: %f, breaking load: %d kH%n", this.type, this.length, this.diameter, this.breakingLoad);
    }
}
