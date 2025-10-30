package KI305.Tykhovska.Lab4;

/**
 * Клас {@code Calculation} для виконання математичних обчислень.
 * Реалізує формулу: y = sin(x - 9) / (x - cos(2x))
 */
public class Calculation {
    /**
     * Від'ємник для аргументу синуса
     */
    private final static int SUBTRACTOR = 9;
    /**
     * Множник для аргументу косинуса
     */
    private final static int MULTIPLIER = 2;
    /**
     * Точність для порівняння з нулем
     */
    private final static double EPSILON = 1e-10;

    /**
     * Обчислює значення функції y = sin(x - 9) / (x - cos(2x)).
     *
     * @param x Значення аргументу x
     * @return Результат обчислення функції
     * @throws ArithmeticException якщо знаменник близький до нуля
     */
    public static double calculate(double x)
    {
        double denominator = (x - Math.cos(MULTIPLIER * x));

        if(Math.abs(denominator) < EPSILON)
            throw new ArithmeticException("Division by zero");

       return Math.sin(x - SUBTRACTOR) / denominator;
    }
}
