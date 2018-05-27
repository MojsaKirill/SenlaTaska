package com.kirill.tasks;

import java.util.Scanner;

public class Task10 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr= inputArr(arr);
        combinations(arr);
    }

    private static int [] inputArr (int [] arr) {
        System.out.println("Введите 3 числа");
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void combinations(int[] arr) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    System.out.println(arr[x]+ "" + arr[y]+ "" +arr[z]);
                }
            }
        }
    }

}
