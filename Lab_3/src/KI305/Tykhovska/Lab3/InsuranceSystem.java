package KI305.Tykhovska.Lab3;

/**
 * Клас {@code InsuranceSystem}, що описує страхувальну систему альпініста.
 */
public class InsuranceSystem {
    private String brand;
    private int weight;
    private int size;

    /**
     * @param brand бренд системи
     * @param weight вага у грамах
     * @param size розмір системи
     */
    public InsuranceSystem(String brand, int weight, int size) {
        this.brand = brand;
        this.weight = weight;
        this.size = size;
    }

    /** @return бренд системи */
    public String getBrand() { return brand; }
    /** @param brand новий бренд */
    public void setBrand(String brand) { this.brand = brand; }

    /** @return вага у грамах */
    public int getWeight() { return weight; }
    /** @param weight нова вага */
    public void setWeight(int weight) { this.weight = weight; }

    /** @return розмір системи */
    public int getSize() { return size; }
    /** @param size новий розмір */
    public void setSize(int size) { this.size = size; }

    /** Виводить інформацію про страхувальну систему. */
    public void ShowInfo() {
        System.out.println("Insurance system");
        System.out.printf("\tBrand: %s, size: %d, weight: %d%n", this.brand, this.size, this.weight);
    }
}