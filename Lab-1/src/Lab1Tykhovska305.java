import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Лабораторна робота №1.
 * Програма створює рівнобедрений трикутник, який починається із центру квадрата.
 * Символ для створення трикутника, а також розмір квадратної матриці задає користувач.
 * Створений масив виводиться в консоль та записується у текстовий файл.
 */
public class Lab1Tykhovska305 {

    /**
     * Статичний метод main є точкою входу в програму
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Отримання розміру матриці від користувача
        System.out.print("Enter size of square matrix: ");
        int nRow = in.nextInt();
        in.nextLine();

        // Отримання символу для малювання трикутника
        System.out.print("Enter symbol to draw triangle: ");
        String symbol = in.nextLine();

        // Перевірка коректності введеного символу
        while(symbol.length() > 1 || symbol.length() < 1)
        {
            System.out.print("Enter correct symbol to draw triangle: ");
            symbol = in.nextLine();
        }

        // Визначення центру трикутника
        int center = nRow / 2;

        // Зубчастий масив для зберігання трикутника
        char[][] arr = new char[nRow][];

        // Запис результату у файл з обробкою винятків
        try (PrintWriter fout = new PrintWriter(new File("MyFile.txt"))) {

            /**
             * Малюємо трикутник і зберігаємо у зубчастий масив.
             * Трикутник будується від центру донизу.
             */
            for (int i = 0; i < nRow; i++) {
                if (i < center) {
                    // Порожні рядки зверху (до центру)
                    arr[i] = new char[0];  // рядок без символів
                    System.out.println();
                    fout.println();
                }
                else {
                    /**
                     * Обчислення параметрів для поточного рядка трикутника:
                     * - currentLevel: рівень трикутника (відстань від центру)
                     * - leftBound: ліва межа заповнення символами
                     * - rightBound: права межа заповнення символами
                     * - length: кількість символів у поточному рядку
                     */
                    int currentLevel = i - center;
                    int leftBound = center - currentLevel;
                    int rightBound = center + currentLevel;
                    int length = rightBound - leftBound + 1;

                    // Ініціалізація масиву для поточного рядка
                    arr[i] = new char[length];

                    // Заповнення масиву символами
                    for (int j = 0; j < length; j++) {
                        arr[i][j] = (char) symbol.codePointAt(0);
                    }

                    // Вивід на консоль
                    for (int j = 0; j < leftBound; j++) System.out.print(" ");
                    for (char c : arr[i]) System.out.print(c);
                    System.out.println();

                    // Вивід у файл
                    for (int j = 0; j < leftBound; j++) fout.print(" ");
                    for (char c : arr[i]) fout.print(c);
                    fout.println();
                }
            }
        }
        catch (FileNotFoundException e) {
            /**
             * Обробка помилки створення файлу
             * @exception FileNotFoundException
             */
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}