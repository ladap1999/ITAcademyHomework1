package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        // task7();
        // task8();
        // task9();
        // task10();
        // task11();
        // task12();
        // task13();
        // task14();
        // task15();
        // task16();
        // task17();
        // task18();
         task19();
    }

    /*Напишите программу, которая вычисляет ваш вес на
    Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.*/
    public static void task1() {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите вес на Земле: ");
        double earthWeight = n.nextDouble();

        double moonWeight = earthWeight * 0.16;

        System.out.println("Вес на Луне = " + moonWeight);
    }

    /*Напишите метод, который будет увеличивать каждый элемент массива на 10%.*/
    public static void task2() {
        int[] arrayOfNumbers = new int[10];
        float[] rezArray = new float[10];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = (int) (Math.random() * 10);
            System.out.println(arrayOfNumbers[i]);
        }

        rezArray = increaseArray(arrayOfNumbers, rezArray);

        for (float element : rezArray) {
            System.out.println(element);
        }
    }

    public static float[] increaseArray(int[] arrayOfNumbers, float[] rezArray) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            rezArray[i] = (float) (arrayOfNumbers[i] * 1.1);
        }
        return rezArray;
    }

    /*Напишите метод, который будет проверять является ли число палиндромом
    (одинаково читающееся в обоих направлениях).*/
    public static void task3() {
        System.out.println("Введите слово:");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        char[] simbols = a.toCharArray();

        for (int i = 0, j = simbols.length - 1; i < simbols.length / 2; i++, j--) {
            if (simbols[i] != simbols[j]) {
                System.out.println("Введенное слово не палиндром!");
                break;
            }

            if (i == simbols.length / 2 - 1)
                System.out.println("Введенное слово палиндром!");
        }
    }

    /*Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)*/
    public static void task4() {
        int[] arrayOfNumbers = new int[100];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i + 1;
            if (arrayOfNumbers[i] % 2 == 0)
                System.out.println(arrayOfNumbers[i]);
        }
    }

    /*Вывести на экран все нечетные цифры от 1 до 15 (используйте остаток от деления)*/
    public static void task5() {
        int[] arrayOfNumber = new int[15];

        for (int i = 0; i < arrayOfNumber.length; i++) {
            arrayOfNumber[i] = i + 1;
            if (arrayOfNumber[i] % 2 != 0)
                System.out.println(arrayOfNumber[i]);
        }
    }

    /*Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for)*/
    public static void task6() {
        int[] arrayNumbers = new int[100];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i + 1;
        }
        for (int i = 1; i < arrayNumbers.length; i += 2) {
            System.out.println(arrayNumbers[i]);
        }
    }

    /*Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)*/
    public static void task7() {
        int sum = 0;

        for (int i = 20; i <= 200; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /*Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому
    числу (используя цикл и оператор if else)*/
    public static void task8() {
        String[] nameOfMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < 12; i++) {
            System.out.println(i + 1 + ") " + nameOfMonth[i]);
        }
    }

    /*Объявить 2 переменных целого типа.
     Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй,
     а второй - в первой.*/
    public static void task9() {
        int a = 13;
        int b = 11;
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println(" a = " + a + "," + " b = " + b);
    }

    /*Напишите программу с тремя переменными целого типа, первым двум присвойте значения,
    а третьей переменной присвойте их сумму.
    Выведете значение третей переменной на экран.*/
    public static void task10() {
        int a = 11;
        int b = 3;
        int sum = a + b;
        System.out.println("Сумма = " + sum);
    }

    /*Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.*/
    public static void task11() {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        if (a > b && a > c)
            System.out.println("The variable a is the largest");
        if (b > a && b > c)
            System.out.println("The variable b is the largest");
        if (c > a && c > b)
            System.out.println("The variable c is the largest");
    }

    /*Напишите программу, в которой используются две переменные логического типа (boolean),
    присвойте им значения и выведете для каждой переменной на экран строку "истина",
    если переменная имеет значение true и "ложь", если переменная имеет значение false.*/
    public static void task12() {
        boolean b1 = true;
        boolean b2 = false;

        if (b1)
            System.out.println("истина");
        else
            System.out.println("ложь");

        if (b2)
            System.out.println("истина");
        else
            System.out.println("ложь");
    }

    /*Напишите программу, где двум строковым переменным присваиваются значения,
     третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
     Затем напечатайте значение третьей строковой переменной.*/
    public static void task13() {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        String rez = s1 + s2;
        System.out.println(rez);
    }

    /*Создайте программу с двумя переменными целого типа, присвойте им значения,
    если первая переменная больше второй, то увеличьте её значение на 3,
    иначе увеличьте значение второй переменной на 8.
    В конце программы выведите значения обоих чисел на экран.*/
    public static void task14() {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();

        if (a == b) {
            System.out.println("a = b, try again");
        } else if (a > b) {
            a += 3;
        } else {
            b += 8;
        }
        System.out.println("Result:  a = " + a + ", b = " + b);
    }

    /*Выведете на экран все числа от 1 до 100 с помощью цикла
    (можно все три варианта в одной программе):for, while, do while*/
    public static void task15() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 100) {
            System.out.println(j);
            j++;
        }

        int q = 1;
        do {
            System.out.println(q);
            q++;
        } while (q <= 100);
    }

    /*Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
    Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
    Минимум, максимум и шаг указываются пользователем (можно захардкодить).*/
    public static void task16() {
        Scanner n = new Scanner(System.in);
        int min = n.nextInt();
        int max = n.nextInt();
        int step = n.nextInt();

        for (int i = min; i <= max; i += step) {
            System.out.println(i);
        }
    }

    /*Все элементы массива поделить на значение наибольшего элемента этого массива.*/
    public static void task17() {
        Scanner n = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = n.nextInt();
        }

        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement)
                maxElement = array[i];
        }

        double[] rezArray = new double[5];
        for (int i = 0; i < rezArray.length; i++) {
            rezArray[i] = (double) array[i] / maxElement;
            System.out.println("New array element: " + rezArray[i]);
        }
    }

    /*Напишите метод переводящий рубли в доллары по заданному курсу.
     В качестве аргументов укажите кол-во рублей и курс.*/
    public static void task18() {
        Scanner n = new Scanner(System.in);
        int amountsOfMoney = n.nextInt();
        double sumOfMoney = currencyExchange(amountsOfMoney, 2.56);

        System.out.println("сумма = " + sumOfMoney);
    }

    public static double currencyExchange(int amountOfMoney, double rates) {
        return amountOfMoney / rates;
    }

    /*Напишите программу, которая будет считать количество часов,
     минут и секунд в n-ном количестве суток.*/
    public static void task19() {
        Scanner n = new Scanner(System.in);
        int amountOfDays = n.nextInt();
        countOfHourMinSec(amountOfDays);
    }

    public static void countOfHourMinSec(int days) {
        int amountOfHour = days * 24;
        int amountOfMinutes = days * 24 * 60;
        int amountOfSeconds = days * 24 * 60 * 60;
        System.out.println("In " + days + " day(s) " + amountOfHour + "h.");
        System.out.println("In " + days + " day(s) " + amountOfMinutes + "min.");
        System.out.println("In " + days + " day(s) " + amountOfSeconds + "sec.");
    }
}


