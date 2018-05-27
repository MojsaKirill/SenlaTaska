package com.kirill.tasks;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        TreeSet<String> words = new TreeSet<String>();
        words = mySplit(str);
        System.out.println("Кол-во слов: " + words.size());
        outputList(words);
    }

    private static TreeSet<String> mySplit (String str) {
        TreeSet<String> words = new TreeSet<String>();
        for (String word : str.split("[,\\s]+")) {
            words.add(word);
        }
        return words;
    }

    private static void outputList (TreeSet <String> words) {
        for (String word: words) {
            System.out.println(word);
        }
    }

}
