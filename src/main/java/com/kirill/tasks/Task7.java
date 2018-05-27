package com.kirill.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scanner.nextInt();
        if (n > 0) {
            int[] arr = new int[n];
            arr = arrFilling(arr);
            outputArr(arr);
            minAndMax(arr);
        }
        else System.out.println("Массив не может состоять из " + n + " элемента(ов)");
    }

    private static int[] arrFilling (int[] arr) {
        Random rand = new Random();
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(90)+10;
        }
        return arr;
    }

    private static void outputArr (int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void minAndMax (int[] arr) {
        arr = bubbleSort(arr);
        System.out.println("Минимальный элемент: " + arr[0]);
        System.out.println("Максимальный элемент: " + arr[arr.length-1]);
    }

    private static int [] bubbleSort(int[] arr) {

        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
