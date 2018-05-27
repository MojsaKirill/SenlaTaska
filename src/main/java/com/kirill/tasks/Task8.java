package com.kirill.tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Введите длину последовательности(n) 0 < n < 101");
        n = scanner.nextInt();
        if (n >= 0 && n < 101) {
            for (int i = 0; i <= n; i++) {
                if (isPalindrom(i)) System.out.println("Число " + i + " является палиндромом");
            }
        }
        else System.out.println("Неверная длина последовательности");
    }

    public static boolean isPalindrom (int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x)).reverse();
        if (Integer.toString(x).equalsIgnoreCase(str.toString())) {
            return true;
        }
        else return false;
    }

}
