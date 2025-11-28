package KI305.Tykhovska.Lab6;

/**
 * Головний клас програми-драйвера.
 * Демонструє роботу контейнера ToolBox з різними типами інструментів.
 */
public class Main {
    public static void main(String[] args) {

        ToolBox<Tool> box = new ToolBox<>();

        box.add(new Hammer("Столярний", 800));
        box.add(new Screwdriver("Хрестова", 15));
        box.add(new Hammer("Гумовий", 300));
        box.add(new Screwdriver("Пласка", 10));

        System.out.println("Інструменти у коробці:");
        box.printAll();

        System.out.println("\nНайлегший молоток (мінімальна вага):");
        System.out.println(box.findMinWeight());

        System.out.println("\nНайкоротша викрутка (мінімальна довжина):");
        System.out.println(box.findMinLength());
    }
}