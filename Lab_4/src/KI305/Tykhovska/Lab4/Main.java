package KI305.Tykhovska.Lab4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Клас {@code Main} є драйвером програми для демонстрації роботи пакету {@code KI305.Tykhovska.Lab4}.
 */
public class Main  {
    /** Назва файлу для запису результату */
    private  static final String OUTPUT_FILE = "Result.txt";
    /** Об'єкт Scanner для зчитування вводу користувача */
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Головний метод програми.
     *
     * @param args Аргументи командного рядка
     */
    public static void main(String[] args) {
        try {
            double result = performCalculation();
            writeToFile(result);

            System.out.printf("Result: %.6f%n", result);

        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.err.println("File error: " + ex.getMessage());
        } finally {
            SCANNER.close();
        }
    }

    /**
     * Виконує зчитування аргументу x з консолі
     * та обчислює значення функції.
     *
     * @return Результат обчислення функції
     * @throws IllegalArgumentException якщо введено не число
     * @throws ArithmeticException якщо знаменник функції близький до нуля
     */
    public static double performCalculation() {

        System.out.print("Enter x: ");

        if (!SCANNER.hasNextDouble())
            throw new IllegalArgumentException("Invalid input");

        double x = SCANNER.nextDouble();
        return Calculation.calculate(x);
    }

    /**
     * Записує результат обчислення у файл.
     *
     * @param result Значення, яке буде записане у файл
     * @throws IOException якщо виникає помилка під час запису у файл
     */
    public static void writeToFile(double result) throws IOException {
        try (PrintWriter writer = new PrintWriter(OUTPUT_FILE)) {
            writer.printf("Result: %.6f%n", result);
        }
    }
}