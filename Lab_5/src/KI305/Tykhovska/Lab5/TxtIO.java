package KI305.Tykhovska.Lab5;

import java.io.*;
import java.util.Scanner;

/**
 * Клас {@code TxtIO} реалізує текстове читання та запис.
 */
public class TxtIO implements FileIO {

    @Override
    public void write(String fileName, double value) throws IOException {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.printf("%f", value);
        }
    }

    @Override
    public double read(String fileName) throws IOException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            return scanner.nextDouble();
        }
    }
}
