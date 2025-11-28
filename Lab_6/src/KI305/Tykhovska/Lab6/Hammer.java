package KI305.Tykhovska.Lab6;

/**
 * Клас молотка.
 * Реалізує інтерфейси Tool та Weighable.
 */
public class Hammer implements Tool, Weighable {

    /** Тип молотка */
    private String type;

    /** Вага молотка в грамах */
    private int weight;

    /**
     * Конструктор молотка.
     *
     * @param type назва молотка
     * @param weight вага молотка у грамах
     */
    public Hammer(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    /**
     * Повертає назву молотка.
     *
     * @return назва молотка
     */
    @Override
    public String getName() {
        return type;
    }

    /**
     * Повертає рядок з інформацією про молоток.
     *
     * @return інформація про молоток
     */
    @Override
    public String toString() {
        return String.format("Hammer: %s, weight = %d", type, weight);
    }

    /**
     * Повертає вагу молотка.
     *
     * @return вага у грамах
     */
    @Override
    public int getWeight() {
        return weight;
    }

    /**
     * Порівнює молотки за вагою (або з іншими інструментами з вагою).
     *
     * @param other інший інструмент
     * @return негативне число, якщо this легший, позитивне, якщо важчий, 0 якщо рівні або інший тип
     */
    @Override
    public int compareTo(Tool other) {
        if (other instanceof Weighable w) {
            return Integer.compare(this.weight, w.getWeight());
        }
        return 0;
    }
}
