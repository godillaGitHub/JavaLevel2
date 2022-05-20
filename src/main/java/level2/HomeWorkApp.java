package level2;

public class HomeWorkApp {

    public static void main(String[] args) {
        checkSumSign(10,-10);
        checkSignStr(0);
        checkSignBol(100);
        printStrN("Hello", 2);
        leapYear(2020);
    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.*/
    private static void checkSumSign(int a, int b) {
        int resSum = a + b;
        boolean theLimit = (resSum >=10 && resSum <=20);
        System.out.println(theLimit);
    }

    /*2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    private static void checkSignStr(int a) {
        if (a >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное.
    */
    private static void checkSignBol(int a) {
        System.out.println(a > 0);
    }

    /*4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку,
    указанное количество раз;
    */
    private static void printStrN(String strPrint, int n) {
        for (int i = 1; i <= n; i ++) System.out.println(strPrint);
    }

    /*5. Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    */
    private static void leapYear(int year) {
        boolean theLeapYear = ((year % 4) == 0 || (year % 100) != 0 || (year % 400) == 0);
        System.out.println(theLeapYear);
    }
}
