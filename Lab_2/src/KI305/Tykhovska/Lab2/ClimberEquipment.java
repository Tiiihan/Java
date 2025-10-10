package KI305.Tykhovska.Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Клас {@code ClimberEquipment} описує спорядження альпініста,
 * яке включає страхувальну систему, шолом та мотузку.
 *
 * <p>Клас демонструє використання композиції, конструкторів різних типів
 * та методів для аналізу, порівняння і виведення інформації.</p>
 *
 */
public class ClimberEquipment {

    private InsuranceSystem insuranceSystem;
    private Helmet helmet;
    private ClimbingRope rope;

    private final String logFile = "src\\log.txt";

    /**
     * Метод для запису подій у лог-файл.
     * @param msg текст повідомлення для запису
     */
    private void log(String msg) {
        try (FileWriter fw = new FileWriter(logFile, true)) {
            fw.write(LocalDateTime.now() + " - " + msg + "\n");
        } catch (IOException e) {
            System.err.println("Logging failed: " + e.getMessage());
        }
    }

    /**
     * Повний конструктор, який створює всі складові спорядження.
     *
     * @param brand бренд страхувальної системи
     * @param weight вага страхувальної системи
     * @param size розмір страхувальної системи
     * @param brandHelmet бренд шолома
     * @param weightHelmet вага шолома
     * @param sizeHelmet розмір шолома
     * @param type тип мотузки (STATIC або DYNAMIC)
     * @param length довжина мотузки
     * @param diameter діаметр мотузки
     * @param breakingLoad руйнівне навантаження мотузки
     */
    public ClimberEquipment(String brand, int weight, int size, String brandHelmet, int weightHelmet,
                            int sizeHelmet, RopeType type, int length, float diameter, int breakingLoad) {
        this.insuranceSystem = new InsuranceSystem(brand, weight, size);
        this.helmet = new Helmet(brandHelmet, weightHelmet, sizeHelmet);
        this.rope = new ClimbingRope(type, length, diameter, breakingLoad);
        log("Initialise objects in constructor 1");
    }

    /**
     * Конструктор, який приймає готові об'єкти спорядження.
     * @param system страхувальна система
     * @param helmet шолом
     * @param rope мотузка
     */
    public ClimberEquipment(InsuranceSystem system, Helmet helmet, ClimbingRope rope) {
        this.insuranceSystem = system;
        this.helmet = helmet;
        this.rope = rope;
        log("Initialise objects in constructor 2");
    }

    /**
     * Конструктор з шоломом і мотузкою.
     * @param helmet шолом
     * @param rope мотузка
     */
    public ClimberEquipment(Helmet helmet, ClimbingRope rope) {
        this(null, helmet, rope);
        log("Initialise objects in constructor 3");
    }

    /**
     * Конструктор лише зі страхувальною системою.
     * @param system страхувальна система
     */
    public ClimberEquipment(InsuranceSystem system) {
        this(system, null, null);
        log("Initialise objects in constructor 4");
    }


    public InsuranceSystem getInsuranceSystem() { return insuranceSystem; }
    public void setInsuranceSystem(InsuranceSystem insuranceSystem) { this.insuranceSystem = insuranceSystem; }

    public Helmet getHelmet() { return helmet; }
    public void setHelmet(Helmet helmet) { this.helmet = helmet; }

    public ClimbingRope getClimbingRop() { return rope; }
    public void setClimbingRop(ClimbingRope rope) { this.rope = rope; }


    /**
     * Виводить інформацію про всі елементи спорядження.
     */
    public void ShowInfo() {
        System.out.println("\nInfo about climber's equipment:");
        if (insuranceSystem != null) insuranceSystem.ShowInfo();
        if (helmet != null) helmet.ShowInfo();
        if (rope != null) rope.ShowInfo();
        log("Invoke ShowInfo method");
    }

    /**
     * Обчислює загальну вагу елементів спорядження.
     * @return сумарна вага в грамах
     */
    public int TotalWeight() {
        int totalWeight = 0;
        if (helmet != null) totalWeight += helmet.getWeight();
        if (insuranceSystem != null) totalWeight += insuranceSystem.getWeight();
        log("Invoke TotalWeight method");
        return totalWeight;
    }

    /**
     * Перевіряє, чи спорядження повне (усі елементи не null).
     * @return true, якщо спорядження повне, інакше false
     */
    public boolean IsFullEquipped() {
        log("Invoke IsFullEquipped method");
        return helmet != null && insuranceSystem != null && rope != null;
    }

    /**
     * Порівнює сумарну вагу двох комплектів спорядження.
     * @param obj інший об'єкт {@code ClimberEquipment} для порівняння
     */
    public void CompareTotalWeight(ClimberEquipment obj) {
        log("Invoke CompareTotalWeight method");
        if (this.TotalWeight() == obj.TotalWeight())
            System.out.println("Their total weight is the same");
        else if (this.TotalWeight() > obj.TotalWeight())
            System.out.println("Total weight of the first equipment is greater");
        else
            System.out.println("Total weight of the second equipment is greater");
    }
}

