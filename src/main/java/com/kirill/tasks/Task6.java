package com.kirill.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1, l2, l3;
        System.out.println("Введите длины отрезков");
        l1 = scanner.nextDouble();
        l2 = scanner.nextDouble();
        l3 = scanner.nextDouble();
        if(isTriangle(l1, l2, l3)) System.out.println("Их этих отрезков можно создать прямоугольный трегольник");
        else System.out.println("Из этих отрезков нельзя создать прямоугольный треугольник");
    }

    private static boolean isTriangle (double l1, double l2, double l3) {
        if (theoremPythagorean(l1, l2, l3)) {
            return true;
        }
        else if (theoremPythagorean(l2, l1, l3)) {

            return true;
        }
        else if (theoremPythagorean(l3, l1, l2)) {
            return true;
        }
        return false;
    }

    private static boolean theoremPythagorean (double l1, double l2, double l3) {
        if (Math.pow(l1, 2) == Math.pow(l2, 2) + Math.pow(l3, 2)) {
            return true;
        }
        return false;
    }

}
