package KI305.Tykhovska.Lab2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Клас {@code Main} є драйвером програми для демонстрації роботи пакету {@code KI305.Tykhovska.Lab2}.
 */
public class Main {
    public static void main(String[] args) {

        Helmet helmet1 = new Helmet("Petzl", 500, 58);
        Helmet helmet2 = new Helmet("Black Diamond", 450, 56);

        InsuranceSystem insurance1 = new InsuranceSystem("Edelrid", 700, 60);
        InsuranceSystem insurance2 = new InsuranceSystem("Mammut", 650, 58);

        ClimbingRope rope1 = new ClimbingRope( RopeType.DYNAMIC, 60, 10.5f, 2200);
        ClimbingRope rope2 = new ClimbingRope(RopeType.STATIC, 50, 9.8f, 2000);

        // Конструктор з усіма параметрами
        ClimberEquipment eq1 = new ClimberEquipment(
                "Edelrid", 700, 60,
                "Petzl", 500, 58,
                RopeType.DYNAMIC, 60, 10.5f, 2200
        );

        // Конструктор з готовими об'єктами
        ClimberEquipment eq2 = new ClimberEquipment(insurance2, helmet2, rope2);

        // Конструктор лише з Helmet і Rope
        ClimberEquipment eq3 = new ClimberEquipment(helmet1, rope2);

        // Конструктор лише з InsuranceSystem
        ClimberEquipment eq4 = new ClimberEquipment(insurance1);

        // Вивід інформації
        eq1.ShowInfo();
        eq2.ShowInfo();
        eq3.ShowInfo();
        eq4.ShowInfo();

        // Перевірка, чи повністю споряджений
        System.out.println("\neq1 fully equipped: " + eq1.IsFullEquipped());
        System.out.println("eq4 fully equipped: " + eq4.IsFullEquipped());

        System.out.println();

        // Порівняння ваги
        eq1.CompareTotalWeight(eq2);
        eq3.CompareTotalWeight(eq4);

        System.out.println();

        // Обчислення загальної ваги
        System.out.println("Total weight eq1: " + eq1.TotalWeight());
        System.out.println("Total weight eq2: " + eq2.TotalWeight());
    }
}