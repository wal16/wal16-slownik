package com.ea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("kot", "cat");
        dictionary.put("pies", "dog");
        dictionary.put("dom", "house");
        dictionary.put("mąż", "husband");
        dictionary.put("żona", "wife");
        dictionary.put("dziecko", "child");
        System.out.println("Podaj wyraz po polsku");
        Scanner scanner = new Scanner(System.in);
        String polishWord = scanner.next();
        if (dictionary.containsKey(polishWord.toLowerCase())) {
            System.out.println(dictionary.get(polishWord.toLowerCase()));
        }  else {
                System.out.println("Nie znaleziono slowa w slowniku");
            }
        }
    }

