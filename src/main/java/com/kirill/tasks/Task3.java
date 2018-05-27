package com.kirill.tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для проверки");
        String str = scanner.nextLine();
        if(isPalindrome(str)) System.out.println("Слово "+ str + " является палиндромом");
        else System.out.println("Слово "+ str + " не является палиндромом");
    }

    public static boolean isPalindrome(String str) {
        StringBuilder strBuilder = new StringBuilder(str.replaceAll("\\W", "")).reverse();
        return str.equalsIgnoreCase(strBuilder.toString()) ;
    }

}
