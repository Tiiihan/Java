package KI305.Tykhovska.Lab6;

/**
 * Базовий інтерфейс для всіх інструментів.
 * Інструменти можуть порівнюватися між собою.
 */
public interface Tool extends Comparable<Tool> {

    /**
     * Повертає назву інструмента.
     *
     * @return назва інструмента
     */
    String getName();

    /**
     * Повертає текстове представлення інструмента.
     *
     * @return рядок з інформацією про інструмент
     */
    @Override
    String toString();
}
