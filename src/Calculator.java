import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;


public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;


    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    BinaryOperator<Integer> devide = (x, y) -> (y == 0) ? 0 : x / y;

    //В данном решение выбрасывается исключение "Exception in thread "main" java.lang.ArithmeticException: / by zero"
    // ошибка в строке BinaryOperator<Integer> devide = (x, y) -> x / y;
    //Чтобы убрать ошибку при деления на ноль, мы будем возвращать ответ равный нулю BinaryOperator<Integer> devide = (x, y) -> (y == 0) ? 0 : x / y;


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
