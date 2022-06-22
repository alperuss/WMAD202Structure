package ca.ciccc.wmad202.assignment4.question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Question6 {
    public static void test(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,6,7));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-1,0,23,4));
        HashSet<Integer> result1 = combines(list1,list2,list3);
        

        System.out.println("Combines lists are : ");
        System.out.println(result1);
        


    }

    private static HashSet<Integer> combines(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3) {
        HashSet<Integer> numbers = new HashSet<>();
        for (Integer i: list1){
            numbers.add(i);
        }
        for (Integer i: list2){
            numbers.add(i);
        }
        for (Integer i: list3){
            numbers.add(i);
        }
        return numbers;
    }
}
