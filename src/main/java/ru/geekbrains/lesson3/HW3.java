package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HW3 {
        //Задание 1.
        public static void main(String args[]) {
            invertArray();
            Array100();
            Array12();
            ArraySquare();
            ArrIntLen();
        }

        public static void invertArray() {
            System.out.println("Task1");
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        // Задание 2.
        public static void Array100() {
            System.out.println("Task2");
            int[] arr = new int[101];
            for (int i = 0; i <= 100; i++) {
                arr[i] = i;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }

        //Задание 3.
        public static void Array12() {
            System.out.println("Task3");
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = (i *= 2);
                } else {
                    arr[i] = i;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        // Задание 4.
        public static void ArraySquare() {
            System.out.println("Task4");
            int[][] square = new int[6][6];
            for (int i = 0; i < square.length; i++) {
                square[i][i] = 1;
                square[i][square[i].length - 1 - i] = 1;
            }
            System.out.println(Arrays.deepToString(square));
            for (int i = 0; i < square.length; i++)
                System.out.println(Arrays.toString(square[i]));
        }

        // Задание 5.
        public static void ArrIntLen() {
            System.out.println("Task5");
            int InitialValue = 3;
            int len = 5;
            int[] arr = new int[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = InitialValue;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

