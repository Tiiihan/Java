package KI305.Tykhovska.Lab3;

/**
 * Підклас {@code MilitaryClimberEquipment } спорядження альпініста, що реалізує військове спорядження.
 * Розширює {@link ClimberEquipment} і реалізує {@link MilitaryEquipment}.
 */
public class MilitaryClimberEquipment extends ClimberEquipment implements MilitaryEquipment {

    private TacticalVest tacticalVest;
    private Weapon weapon;

    /**
     * @param system страхувальна система
     * @param helmet шолом
     * @param rope мотузка
     * @param tacticalVest тактичний жилет
     * @param weapon зброя
     */
    public MilitaryClimberEquipment(InsuranceSystem system, Helmet helmet, ClimbingRope rope,
                                    TacticalVest tacticalVest, Weapon weapon) {
        super(system, helmet, rope);
        this.tacticalVest = tacticalVest;
        this.weapon = weapon;
    }

    /** @return тактичний жилет */
    public TacticalVest getTacticalVest() { return tacticalVest; }
    /** @param tacticalVest новий тактичний жилет */
    public void setTacticalVest(TacticalVest tacticalVest) { this.tacticalVest = tacticalVest; }

    /** @return зброя */
    public Weapon getWeapon() { return weapon; }
    /** @param weapon нова зброя */
    public void setWeapon(Weapon weapon) { this.weapon = weapon; }


    @Override
    public void cleanWeapon() {
        if (hasWeapon()) {
            System.out.println("Weapon cleaned!");
        } else {
            System.out.println("No weapon to clean!");
        }
    }

    @Override
    public boolean unequipWeapon() {
        if (this.weapon != null) {
            this.weapon = null;
            System.out.println("Weapon unequipped successfully");
            return true;
        }
        System.out.println("No weapon to unequip");
        return false;
    }

    @Override
    public void reloadWeapon() {
        if (hasWeapon() && weapon.getMagazineCapacity() > 0) {
            weapon.setAmmoCount(weapon.getMagazineCapacity());
            System.out.println("Weapon reloaded! Ammo: " + weapon.getAmmoCount());
        } else {
            System.out.println("Cannot reload - no weapon or invalid magazine capacity");
        }
    }

    @Override
    public boolean hasWeapon() {
        return this.weapon != null;
    }

    /**
     * Обчислює повну вагу спорядження.
     *
     * @return сумарна вага спорядження
     */
    @Override
    public int totalWeight() {
        int baseWeight = super.totalWeight();
        int vestWeight = (tacticalVest != null) ? tacticalVest.getWeight() : 0;
        int weaponWeight = (weapon != null) ? weapon.getWeight() : 0;

        return baseWeight + vestWeight + weaponWeight;
    }

    /**
     * Перевіряє, чи військове спорядження повне.
     *
     * @return true, якщо усі елементи присутні
     */
    @Override
    public boolean isFullEquipped() {
        return super.isFullEquipped() && this.weapon != null && this.tacticalVest != null;
    }

    /**
     * Виводить повну інформацію про військове спорядження.
     */
    @Override
    public void showInfo() {
        super.showInfo();
        if (this.tacticalVest != null) this.tacticalVest.showInfo();
        if (this.weapon != null) this.weapon.showInfo();
    }
}