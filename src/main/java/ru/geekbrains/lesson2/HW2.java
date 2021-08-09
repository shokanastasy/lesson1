package ru.geekbrains.lesson2;

public class HW2 {
    public static void main(String[] args) {
        boolean result = isSumBtw10And20(4, 10);
        System.out.println(result);
        PositiveOrNegative();
        boolean result2 = PosOrNegNumber(6);
        System.out.println(result2);
        StringAndNumber();
    }

    // Задание 1.
    public static boolean isSumBtw10And20(int a, int b) {
        System.out.println("Task1");
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 2.
    public static void PositiveOrNegative() {
        System.out.println("Task2");
        int a = 67;
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        if (a < 0) {
            System.out.println("Число отрицательное");
        }
    }

    // Задание 3.
    public static boolean PosOrNegNumber(int i) {
        System.out.println("Task3");
        if (i < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 4.
    public static void StringAndNumber() {
        System.out.println("Task4");
        for (int j = 0; j < 10; j++) {
            System.out.print("Строка");
        }
    }
}
