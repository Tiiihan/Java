package KI305.Tykhovska.Lab3;

/**
 * Клас {@code Weapon}, що описує зброю військового альпініста.
 */
public class Weapon {
    private int ammoCount;
    private int magazineCapacity;
    private int weight;

    /**
     * @param ammoCount кількість патронів
     * @param magazineCapacity місткість магазину
     * @param weight вага зброї у грамах
     */
    public Weapon(int ammoCount, int magazineCapacity, int weight) {
        this.magazineCapacity = magazineCapacity;
        this.ammoCount = ammoCount;
        this.weight = weight;
    }

    /** @return кількість патронів */
    public int getAmmoCount() { return ammoCount; }
    /** @param ammoCount нова кількість патронів */
    public void setAmmoCount(int ammoCount) { this.ammoCount = ammoCount; }

    /** @return вага зброї */
    public int getWeight() { return weight; }
    /** @param weight нова вага */
    public void setWeight(int weight) { this.weight = weight; }

    /** @return місткість магазину */
    public int getMagazineCapacity() { return magazineCapacity; }
    /** @param magazineCapacity нова місткість магазину */
    public void setMagazineCapacity(int magazineCapacity) { this.magazineCapacity = magazineCapacity; }

    /** Виводить інформацію про зброю. */
    public void showInfo() {
        System.out.println("Weapon");
        System.out.printf("\tAmmo: %d, Weight: %d, Magazine capacity: %d%n",
                this.ammoCount, this.weight, this.magazineCapacity);
    }
}
