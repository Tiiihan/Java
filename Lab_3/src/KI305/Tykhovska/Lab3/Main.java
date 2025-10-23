package KI305.Tykhovska.Lab3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Клас {@code Main} є драйвером програми для демонстрації роботи пакету {@code KI305.Tykhovska.Lab3}.
 */
public class Main {
    public static void main(String[] args) {
        InsuranceSystem insurance = new InsuranceSystem("Petzl", 800, 50);
        Helmet helmet = new Helmet("Black Diamond", 350, 57);
        ClimbingRope rope = new ClimbingRope(RopeType.DYNAMIC, 60, 9.8f, 2200);

        TacticalVest vest = new TacticalVest(3000, 42);
        Weapon weapon = new Weapon(10, 30, 4000);

        MilitaryClimberEquipment soldierEquipment =
                new MilitaryClimberEquipment(insurance, helmet, rope, vest, weapon);

        soldierEquipment.showInfo();

        boolean isEquipped = soldierEquipment.isFullEquipped();
        System.out.printf("\nIs full equipped? %b", isEquipped);

        int totalWeight = soldierEquipment.totalWeight();
        System.out.printf("\nTotal weight of equipment: %d", totalWeight);

        System.out.println();

        soldierEquipment.reloadWeapon();
        soldierEquipment.cleanWeapon();
        soldierEquipment.unequipWeapon();
        soldierEquipment.cleanWeapon();
    }
}