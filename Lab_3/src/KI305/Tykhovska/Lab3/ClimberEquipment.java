package KI305.Tykhovska.Lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Абстрактний клас {@code ClimberEquipment}, що описує спорядження альпініста.
 * Містить базові елементи спорядження — страхувальну систему, шолом і мотузку.
 * Використовується як базовий клас для конкретних типів спорядження.
 */
public abstract class ClimberEquipment {

    private InsuranceSystem insuranceSystem;
    private Helmet helmet;
    private ClimbingRope rope;

    /** Конструктор за замовчуванням. */
    public ClimberEquipment(){}

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
    }

    /**
     * Конструктор з шоломом і мотузкою.
     * @param helmet шолом
     * @param rope мотузка
     */
    public ClimberEquipment(Helmet helmet, ClimbingRope rope) {
        this(null, helmet, rope);
    }

    /**
     * Конструктор лише зі страхувальною системою.
     * @param system страхувальна система
     */
    public ClimberEquipment(InsuranceSystem system) {
        this(system, null, null);
    }

    /** @return страхувальна система альпініста */
    public InsuranceSystem getInsuranceSystem() { return insuranceSystem; }
    /** @param insuranceSystem нова страхувальна система */
    public void setInsuranceSystem(InsuranceSystem insuranceSystem) { this.insuranceSystem = insuranceSystem; }

    /** @return шолом альпініста */
    public Helmet getHelmet() { return helmet; }
    /** @param helmet новий шолом */
    public void setHelmet(Helmet helmet) { this.helmet = helmet; }

    /** @return мотузка альпініста */
    public ClimbingRope getClimbingRope() { return rope; }
    /** @param rope нова мотузка */
    public void setClimbingRop(ClimbingRope rope) { this.rope = rope; }


    /**
     * Виводить інформацію про всі елементи спорядження.
     */
    public void showInfo() {
        System.out.println("\nInfo about climber's equipment:");
        if (insuranceSystem != null) insuranceSystem.ShowInfo();
        if (helmet != null) helmet.ShowInfo();
        if (rope != null) rope.ShowInfo();
    }

    /**
     * Обчислює загальну вагу елементів спорядження.
     * @return сумарна вага в грамах
     */
    public int totalWeight() {
        int totalWeight = 0;
        if (helmet != null) totalWeight += helmet.getWeight();
        if (insuranceSystem != null) totalWeight += insuranceSystem.getWeight();

        return totalWeight;
    }

    /**
     * Перевіряє, чи спорядження повне (усі елементи не null).
     * @return true, якщо спорядження повне, інакше false
     */
    public boolean isFullEquipped() {
        return helmet != null && insuranceSystem != null && rope != null;
    }

    /**
     * Порівнює сумарну вагу двох комплектів спорядження.
     * @param obj інший об'єкт {@code ClimberEquipment} для порівняння
     */
    public void compareTotalWeight(ClimberEquipment obj) {
        if (this.totalWeight() == obj.totalWeight())
            System.out.println("Their total weight is the same");
        else if (this.totalWeight() > obj.totalWeight())
            System.out.println("Total weight of the first equipment is greater");
        else
            System.out.println("Total weight of the second equipment is greater");
    }
}

