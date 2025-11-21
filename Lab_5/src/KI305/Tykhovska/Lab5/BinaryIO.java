package KI305.Tykhovska.Lab5;

import java.io.*;

/**
 * Клас {@code BinaryIO} реалізує двійкове читання та запис.
 */
public class BinaryIO implements FileIO {

    @Override
    public void write(String fileName, double value) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {
            out.writeDouble(value);
        }
    }

    @Override
    public double read(String fileName) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(fileName))) {
            return in.readDouble();
        }
    }
}