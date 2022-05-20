package level2;

public class HomeWorkApp {

    public static void main(String[] args) {

        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Результат выполнения задания 1:");
        int a = 10;
        int b = -10;
        System.out.println("a = " + a + ", b = " + b);
        boolean theCheckSumSign = checkSumSign(a, b);
        if (theCheckSumSign) {
            System.out.println("Cумма a и b лежит в пределах от 10 до 20 (включительно)");
        }
        else {
            System.out.println("Cумма a и b не лежит в пределах от 10 до 20 (включительно)");
        }
        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Результат выполнения задания 2:");
        checkSignStr(0);
        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Результат выполнения задания 3:");
        int c = 100;
        boolean theCheckSignBol = checkSignBol(c);
        if (theCheckSignBol) {
            System.out.println("Число с = " + c + " отрицательное");
        }
        else {
            System.out.println("Число с = " + c + " положительное");
        }
        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Результат выполнения задания 4:");
        printStrN("Hello", 2);
        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Результат выполнения задания 5:");
        int theYear = 2000;
        boolean theLeapYear = leapYear(theYear);
        if (theLeapYear) {
            System.out.println(theYear + " год високосный!");
        }
        else {
            System.out.println(theYear + " год не високосный!");
        }
        System.out.println();
    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.*/
    private static boolean checkSumSign(int a, int b) {
        int resSum = a + b;
        return (resSum >=10 && resSum <=20);
    }

    /*2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    private static void checkSignStr(int a) {
        if (a >= 0) {
            System.out.println("Число a = " +  a + " положительное");
        }
        else {
            System.out.println("Число a = " +  a + " отрицательное");
        }
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное.
    */
    private static boolean checkSignBol(int a) {
        return (a < 0);
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
    private static boolean leapYear(int year) {
        int rezDevision4 = year % 4;
        System.out.println("Какой год " + year + "?");
        System.out.println("Остаток от деления на 4 равно:"  + rezDevision4);
        int rezDevision100 = year % 100;
        System.out.println("Остаток от деления на 100 равно:"  + rezDevision100);
        int rezDevision400 = year % 400;
        System.out.println("Остаток от деления на 400 равно:"  + rezDevision400);
        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
        return ((rezDevision4 == 0) && (rezDevision100 !=0)) || (rezDevision400 == 0);
    }
}
