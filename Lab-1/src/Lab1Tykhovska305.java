import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Лабораторна робота №1.
 * Програма будує рівнобедрений трикутник, що починається з центру квадратної матриці.
 * Користувач задає розмір квадратної матриці , символ для побудови трикутника.
 * Результат виводиться у консоль та зберігається у текстовий файл.
 */
public class Lab1Tykhovska305 {

    /**
     * Точка входу у програму.
     *
     * @param args
     * @throws FileNotFoundException якщо не вдається створити або відкрити файл.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        // Файл для збереження результату
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        // Отримання розміру квадратної матриці
        System.out.print("Enter size of square matrix: ");
        int nRow = in.nextInt();
        in.nextLine();

        // Отримання символу для малювання трикутника
        System.out.print("Enter symbol to draw triangle: ");
        String symbol = in.nextLine();

        // Перевірка правильності введення символу
        while (symbol.length() != 1) {
            System.out.print("Enter correct symbol to draw triangle: ");
            symbol = in.nextLine();
        }

        // Центр квадратної матриці
        int center = nRow / 2;

        // Зубчастий масив
        char[][] arr = new char[nRow][];

        // Формування зубчастого масиву
        for (int i = 0; i < nRow; i++) {
            if (i >= center) {
                int level = i - center; // відстань від центру
                int lengthOfArr = 2 * level + 1; // кількість символів у рядку
                arr[i] = new char[lengthOfArr];

                // Заповнення рядка
                for (int j = 0; j < lengthOfArr; j++) {
                    arr[i][j] = (char) symbol.codePointAt(0);
                }
            }
        }

        // Виведення трикутника в консоль і файл
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].length > 0) {
                int level = i - center;
                int numOfSpaces = center - level; // кількість пробілів для центрування

                // Відступи для правильного відображення
                for (int s = 0; s < numOfSpaces; s++) {
                    System.out.print(" ");
                    fout.print(" ");
                }

                // Виведення символів трикутника
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                    fout.print(arr[i][j]);
                }

                System.out.println();
                fout.println();
            } else {
                System.out.println();
                fout.println();
            }
        }

        fout.flush();
        fout.close();
    }
}
