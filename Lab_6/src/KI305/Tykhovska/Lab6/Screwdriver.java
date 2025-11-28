package KI305.Tykhovska.Lab6;

/**
 * Клас викрутки.
 * Реалізує інтерфейси Tool та Measurable.
 */
public class Screwdriver implements Tool, Measurable {

    /** Тип викрутки (пласка, хрестова) */
    private String type;

    /** Довжина викрутки у сантиметрах */
    private int length;

    /**
     * Конструктор викрутки.
     *
     * @param type тип викрутки
     * @param length довжина викрутки у см
     */
    public Screwdriver(String type, int length) {
        this.type = type;
        this.length = length;
    }

    /**
     * Повертає тип викрутки.
     *
     * @return тип викрутки
     */
    @Override
    public String getName() {
        return type;
    }

    /**
     * Повертає рядок з інформацією про викрутку.
     *
     * @return інформація про викрутку
     */
    @Override
    public String toString() {
        return String.format("Screwdriver: %s, length = %d", type, length);
    }

    /**
     * Повертає довжину викрутки.
     *
     * @return довжина у сантиметрах
     */
    @Override
    public int getLength() {
        return length;
    }

    /**
     * Порівнює викрутки за довжиною (або з іншими інструментами з довжиною).
     *
     * @param other інший інструмент
     * @return негативне число, якщо this коротший, позитивне, якщо довший, 0 якщо рівні або інший тип
     */
    @Override
    public int compareTo(Tool other) {
        if (other instanceof Measurable m) {
            return Integer.compare(this.length, m.getLength());
        }
        return 0;
    }
}
