// Генерация собственных исключений
public class Task5 {
    /* Шаг 1. Когда определяется условие ошибки, то мы выбрасываем
исключение с определенным именем. Сообщение может быть связано с
исключением. Откомпилируйте этот класс, создайте его экземпляр и
выполните метод getDetails() с нулем в качестве значения параметра. */

    public static class ThrowsDemo {
        public void getDetails(String key) {
            if (key == null) {
                /* Возникает, когда программа пытается использовать ссылку на объект,
                имеющую нулевое значение */
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        }
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo1 = new ThrowsDemo();
        throwsDemo1.getDetails(null);
        /* ThrowsDemo throwsDemo2 = new ThrowsDemo();
        try {
            throwsDemo2.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } */

    }

    /* Ответ: вы можете получить следующий вывод:
    Exception in thread "main" java.lang.NullPointerException: null key in getDetails */

    /* Объяснение: в коде при вводе key == null мы выбрасываем ошибку NullPointerException
    с сообщением на указание, что именно пошло не так */

    /* Шаг 2. Добавьте блок try-catch таким образом, чтобы перехватить
    исключение и рассмотреть его внутри метода.
    Подумайте, является ли этот способ подходящим, чтобы иметь дело с этим исключением?
    Объясните поведение программы. */

    /* Объяснение: В блоке catch мы перехватываем NullPointerException
    и выводим сообщение об ошибке с помощью System.out.println("Caught exception: " + e.getMessage());.
    Этот метод getMessage() возвращает текст сообщения, которое мы указали при выбросе исключения */

    /* В данном случае выбрасывание NullPointerException может указывать на логическую ошибку в коде.
    Если метод не должен принимать null в качестве аргумента, возможно, более подходящим решением было бы
    предотвратить вызов метода с null заранее */

    // Пример видоизмененной программы ThrowsDemo
    public static class ThrowsDemoNew {
        public void printMessage(String key) {
            String message = getDetailsNew(key);
            System.out.println(message);
        }
        public String getDetailsNew(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for" + key;
        }
    }

}
