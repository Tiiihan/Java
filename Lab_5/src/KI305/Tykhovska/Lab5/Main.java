package KI305.Tykhovska.Lab5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Клас {@code Main} є драйвером програми, який демонструє роботу класів
 * {@code BinaryIO}, {@code TxtIO} та {@code Calculation}.
 * Програма зчитує аргумент x, обчислює значення функції, записує результат
 * у текстовий та двійковий файли та читає його назад.
 */
public class Main {

    /** Назва двійкового файлу для запису результату */
    private static final String OUTPUT_BIN_FILE = "Result.bin";

    /** Назва текстового файлу для запису результату */
    private static final String OUTPUT_TXT_FILE = "Result.txt";

    /** Об’єкт {@code Scanner} для зчитування введення користувача */
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Головний метод програми.
     *
     * @param args Аргументи командного рядка
     */
    public static void main(String[] args)
    {
        try {
            double result = performCalculation();

            FileIO binIO = new BinaryIO();
            FileIO txtIO = new TxtIO();

            binIO.write(OUTPUT_BIN_FILE, result);
            txtIO.write(OUTPUT_TXT_FILE, result);

            double binResult = binIO.read(OUTPUT_BIN_FILE);
            double txtResult = txtIO.read(OUTPUT_TXT_FILE);

            System.out.printf("Binary result: %.6f%n", binResult);
            System.out.printf("Text result: %.6f%n", txtResult);

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    /**
     * Зчитує значення аргументу x з консолі та виконує обчислення функції.
     *
     * @return Результат обчислення функції
     * @throws IllegalArgumentException якщо введення не є числом
     * @throws ArithmeticException якщо знаменник функції наближається до нуля
     */
    public static double performCalculation() {

        System.out.print("Enter x: ");

        if (!SCANNER.hasNextDouble())
            throw new IllegalArgumentException("Invalid input");

        double x = SCANNER.nextDouble();
        return Calculation.calculate(x);
    }
}