// Предопределенные исключения
import java.util.Scanner;

public class Task2 {
    // Шаг 1. Измените код в Task1 на следующий:
    public static class Exception1 {
        public void exceptionDemo1() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
    }
    /* Шаг 2. Запустите эту программу со следующими выводами: Qwerty 0 1.2 1.
    Посмотрите на вывод. */
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo1();
        //Exception2 exception2 = new Exception2();
        //exception2.exceptionDemo2();
    }

    /* Объяснение: 1. Qwerty - исключение NumberFormatException
    Программа попытается преобразовать строку "Qwerty" в целое число, что невозможно.
    2. 0 - исключение ArithmeticException - незаконная арифметическая операция - деление на ноль
    3. 1.2 - исключение NumberFormatException
    Программа попытается преобразовать строку "1.2" в целое число, что невозможно
    4. 1 - 2 - успешное выполнение программы */

    /* Шаг 3. Измените код, добавив блоки try – catch, чтобы иметь дело с
    определяемыми исключениями.
    Объясните поведение программы */
    public static class Exception2 {
        public void exceptionDemo2() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero.");
            }
        }
    }

    /* Чтобы избежать сбоев программы, можно обернуть код в блоки try-catch,
    чтобы обрабатывать возможные исключения */
}
