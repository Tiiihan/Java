package KI305.Tykhovska.Lab3;

/**
 * Клас {@code Helmet} описує шолом альпініста.
 */
public class Helmet {
    private String brand;
    private int weight;
    private int size;

    /**
     * @param brand бренд шолома
     * @param weight вага у грамах
     * @param size розмір шолома
     */
    public Helmet(String brand, int weight, int size) {
        this.brand = brand;
        this.weight = weight;
        this.size = size;
    }

    /** @return бренд шолома */
    public String getBrand() { return brand; }
    /** @param brand новий бренд */
    public void setBrand(String brand) { this.brand = brand; }

    /** @return вага у грамах */
    public int getWeight() { return weight; }
    /** @param weight нова вага */
    public void setWeight(int weight) { this.weight = weight; }

    /** @return розмір шолома */
    public int getSize() { return size; }
    /** @param size новий розмір */
    public void setSize(int size) { this.size = size; }

    /** Виводить інформацію про шолом. */
    public void ShowInfo() {
        System.out.println("Helmet");
        System.out.printf("\tBrand: %s, size: %d, weight: %d%n", this.brand, this.size, this.weight);
    }
}
