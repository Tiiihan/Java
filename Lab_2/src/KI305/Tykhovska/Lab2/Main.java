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
    }
}