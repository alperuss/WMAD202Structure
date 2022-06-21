package ca.ciccc.wmad202.assignment4.question2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    public static void test() {
        HashMap<String,ArrayList<String>> listOfHashMap= createHashMap();
        System.out.println(listOfHashMap);

    }
    public static HashMap<String,ArrayList<String>> createHashMap() {
        Scanner input = new Scanner(System.in);
        HashMap<String, ArrayList<String>> wordMap = new HashMap<>();
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Please enter a word: ");
        String word = input.nextLine();
        while (!word.equalsIgnoreCase("exit")) {
            words.add(word);
            wordMap.put(String.valueOf(word.charAt(0)),words);
            System.out.println("Please enter a word: ");
            word = input.nextLine();
        }



        return wordMap;
    }


}


