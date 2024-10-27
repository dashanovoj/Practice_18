// Предопределенные исключения
public class Task1 {
    // Шаг 1. Выполните следующую программу и посмотрите, что происходит (2 / 0):
    public static class Exception1 {
        public void exceptionDemo1() {
            System.out.println( 2 / 0);
        }
    }
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo1();
        // Exception2 exception2 = new Exception2();
        // exception2.exceptionDemo2();
    }
    /* Ответ: программа даст сбой и вы получите следующее сообщение:
    Exception in thread "main" java.lang.ArithmeticException: / by zero... */

    /* Объяснение: ArithmeticException в Java возникает при выполнении
    незаконной арифметической операции, в нашем случае при делении целого числа на ноль. */

    // Шаг 2. Измените программу следующим образом: замените 2/0 на 2,0 / 0,0 и повторно вызовите метод.

    /* Ответ: В консоли вывода вы получите Infinity */

    /* Объяснение: В Java, когда вы выполняете деление с плавающей точкой,
    деление на ноль не вызывает исключение.
    Вместо этого, результатом такого деления будет специальное значение
    Infinity (бесконечность) - реализация стандарта IEEE 754. */

    // Теперь измените код в классе Exception1 и включите блок try-catch следующим образом:

    public static class Exception2 {
        public void exceptionDemo2() {
            try{
                System.out.println( 2 / 0 );
            } catch ( ArithmeticException e ) {
                System.out.println("Attempted division by zero");
            }
        }
    }

    // Ответ: В консоли вывода вы получите "Attempted division by zero"

    /* Объяснение: Блок try используется для обертывания кода, который может вызвать
    исключение. Если исключение происходит, управление передается в соответствующий
    блок catch, где можно обрабатывать ошибку, не прерывая выполнение всей программы.
    Таким образом, программа корректно обрабатывает ошибку и выводит сообщение,
    вместо того чтобы завершиться с ошибкой.*/
}