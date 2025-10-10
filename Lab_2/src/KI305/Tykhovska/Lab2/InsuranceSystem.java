package KI305.Tykhovska.Lab2;

/**
 * Клас {@code InsuranceSystem} описує страхувальну систему альпініста.
 */
public class InsuranceSystem {
    private String brand;
    private  int weight;
    private int size;

    public InsuranceSystem(String brand, int weight, int size)
    {
        this.brand = brand;
        this.weight = weight;
        this.size = size;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    public void ShowInfo()
    {
        System.out.println("Insurance system");
        System.out.printf("\tBrand: %s, size: %d, weight: %d%n", this.brand, this.size, this.weight);
    }
}
