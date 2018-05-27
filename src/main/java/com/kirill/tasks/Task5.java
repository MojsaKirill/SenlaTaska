package com.kirill.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<String>();
        String text, word;
        System.out.println("Введите текс");
        text=scanner.nextLine();
        System.out.println("Введите слово для поиска");
        word = scanner.nextLine();
        words = mySplit(text);
        System.out.println("Слово " + word + " встречалось в тексте " + countWord(words, word) + " раз(а)");
    }

    private static List<String> mySplit (String str) {
        List<String> words = new ArrayList<String>();
        for (String word : str.split("[,;:.!?\\s]+"))
        {
            words.add(word);
        }
        return words;
    }

    private static int countWord (List<String> words, String word) {
        int k = 0;
            for (String x: words) {
                if (x.equalsIgnoreCase(word)) {
                    k++;
                }
            }
        return k;
    }

}
