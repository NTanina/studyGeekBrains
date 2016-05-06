/**
 * Created by N.Tanina on 06.05.2016 (GeekBrains.ru, Java 1 course, lesson 1)
 */
public class J1L1 {

    public static void main(String[] args) {

        // Задание №2. Объявление и инициализация переменных примитивных типов данных
        byte a=15;
        short b = 30124;
        int c = 1000000;
        long d = 37000L;
        float e = 123.0f;
        double f = 452.75d;

        boolean g = true;

        char h  = 'A';

        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " +  d + ", e = " + e + ", f = " + f + ", h = " + h);

        takeFormule(4, 7, 15, 1);

        isLeapYear(1804);
        isLeapYear(1900);
        isLeapYear(2013);
        isLeapYear(2000);

        System.out.println(takeFormule(4, 7, 15, 1));
        System.out.println(takeFormule(4, 17, 15, 0));
        System.out.println(takeFormule(4, 7, 15, 6));

        System.out.println(checkSum(8,4));
        System.out.println(checkSum(25,4));
    }

    // Задание №3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a,b,c,d – входные параметры этого метода.
    public static float takeFormule(int a, int b, int c, int d) {
        if (d == 0)
        {
            return 0;
        }
        else
        {
            return a * (b + ((float)c/d));
        }
    }

    // Задание №4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20,
    // если да – вернуть true, в противном случае – false.
    public static boolean checkSum (int a, int b) {
        int summ = a + b;

        if ((summ > 10) & (summ < 20))
            return true;
        else
            return false;
    }

    // Задание №5. * Написать метод, который определяет является ли год високосным.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapYear(int dataYear) {
        if (((dataYear % 4 == 0) && (dataYear % 100 != 0)) || ((dataYear % 4 == 0) && (dataYear % 100 == 0) && (dataYear % 400 == 0)))
        {
            System.out.println(dataYear + " год - високосный.");
        }
        else
        {
            System.out.println(dataYear + " год не является вискокосным.");
        }
    }
}
