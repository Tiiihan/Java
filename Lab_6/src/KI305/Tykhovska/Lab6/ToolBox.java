package KI305.Tykhovska.Lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Параметризований контейнер для зберігання інструментів.
 *
 * @param <T> тип інструментів, які реалізують інтерфейс Tool
 */
public class ToolBox<T extends Tool> {

    /** Список інструментів у коробці */
    private List<T> items = new ArrayList<>();

    /**
     * Додає інструмент у коробку.
     *
     * @param item інструмент для додавання
     */
    public void add(T item) { items.add(item); }

    /**
     * Видаляє інструмент за індексом.
     *
     * @param index позиція інструмента у списку
     * @return видалений інструмент
     */
    public T remove(int index) { return items.remove(index); }

    /**
     * Повертає кількість інструментів у коробці.
     *
     * @return кількість інструментів
     */
    public int size() { return items.size(); }

    /**
     * Виводить усі інструменти у коробці на консоль.
     */
    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    /**
     * Знаходить інструмент з мінімальною вагою.
     *
     * @return інструмент, що реалізує Weighable з найменшою вагою, або null, якщо коробка порожня
     */
    public Weighable findMinWeight() {
        Weighable min = null;
        for (T item : items) {
            if (item instanceof Weighable w) {
                if (min == null || w.getWeight() < min.getWeight()) {
                    min = w;
                }
            }
        }
        return min;
    }

    /**
     * Знаходить інструмент з мінімальною довжиною.
     *
     * @return інструмент, що реалізує Measurable з найменшою довжиною, або null, якщо коробка порожня
     */
    public Measurable findMinLength() {
        Measurable min = null;
        for (T item : items) {
            if (item instanceof Measurable m) {
                if (min == null || m.getLength() < min.getLength()) {
                    min = m;
                }
            }
        }
        return min;
    }
}
