package com.kirill.tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        System.out.println("Введите число");
        while (true) {
            x = scanner.nextDouble();
            if (x%1==0) {
                break;
            }
            else System.out.println("Введите целое число!");
        }
        if(isEven(x)) System.out.println("Число " + (int)x + " является четным и составным");
        else {
            System.out.print("Число " + (int)x + " нечетное");
            if(isPrime(x)) System.out.println(", но простое");
            else System.out.println(" и составное");
        }
    }

    private static boolean isEven (double y) {
        if (y%2 == 0) {
            return true;
        }
        return false;
    }

    private static boolean isPrime (double y) {
        int sqrty = (int)Math.sqrt(y) + 1;
        for (int i = 3; i <= sqrty; i++) {
            if (y%i==0) {
                return false;
            }
        }
        return true;
    }

}
