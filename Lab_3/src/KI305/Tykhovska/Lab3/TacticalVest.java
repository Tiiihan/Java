package KI305.Tykhovska.Lab3;

/**
 * Клас {@code TacticalVest}, що описує тактичний жилет військового альпініста.
 */
public class TacticalVest {
    private int weight;
    private int size;

    /**
     * @param weight вага у грамах
     * @param size розмір жилета
     */
    public TacticalVest(int weight, int size) {
        this.weight = weight;
        this.size = size;
    }

    /** @return вага жилета */
    public int getWeight() { return weight; }
    /** @param weight нова вага */
    public void setWeight(int weight) { this.weight = weight; }

    /** @return розмір жилета */
    public int getSize() { return size; }
    /** @param size новий розмір */
    public void setSize(int size) { this.size = size; }

    /** Виводить інформацію про жилет. */
    public void showInfo() {
        System.out.println("Tactical vest");
        System.out.printf("\tSize: %d, Weight: %d%n", this.size, this.weight);
    }
}
