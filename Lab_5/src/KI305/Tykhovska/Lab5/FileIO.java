package KI305.Tykhovska.Lab5;

import java.io.IOException;

/**
 * Інтерфейс {@code KI305.Tykhovska.Lab5.FileIO} визначає контракт
 * для читання та запису числових значень у файл.
 */
public interface FileIO {

    /**
     * Записує значення у файл.
     *
     * @param fileName назва файлу
     * @param value значення для запису
     * @throws IOException помилка запису або створення файлу
     */
    void write(String fileName, double value) throws IOException;

    /**
     * Зчитує значення з файлу.
     *
     * @param fileName назва файлу
     * @return зчитане значення
     * @throws IOException помилка читання або файл не існує
     */
    double read(String fileName) throws IOException;
}
