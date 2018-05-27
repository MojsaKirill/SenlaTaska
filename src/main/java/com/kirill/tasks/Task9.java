package com.kirill.tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Введите длину последовательности");
        n = scanner.nextInt();
        if (n >= 0) {
            int sum=0;
            System.out.print("Все четные числа из последовательности: ");
            for (int i = 0; i < n; i++) {
                if (i%2==0) {
                    sum+=i;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("Сумма четных чисел из последовательости " + sum);
        }
        else System.out.println("Длина последовательности должна быть больше 0");
    }
}
