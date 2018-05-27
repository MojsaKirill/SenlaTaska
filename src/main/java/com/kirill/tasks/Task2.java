package com.kirill.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        System.out.println("Введите число");
        while (true) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            if (x%1==0 && y%1==0) {
                break;
            }
            else System.out.println("Введите целые числа!");
        }
        double mygcd = gcd(x, y);
        double mylcm = lcm(x, y);
        System.out.println("Нод(" + (int)x + ',' + (int)y + "): " +(int)mygcd);
        System.out.println("Нок(" + (int)x + ',' + (int)y + "): " +(int)mylcm);
        System.out.println("Разность :" + (int)(mylcm-mygcd) + ". Cумма :" + (int)(mygcd+mylcm));

    }

    private static double gcd(double a, double b) { //алгоритм Евклида
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static double lcm(double a,double b){
        return a / gcd(a,b) * b;
    }

}
