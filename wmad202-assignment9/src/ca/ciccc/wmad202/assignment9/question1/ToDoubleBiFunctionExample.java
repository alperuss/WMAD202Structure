package ca.ciccc.wmad202.assignment9.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {
    public static void test() {
        ToDoubleBiFunction<ArrayList<Integer>, ArrayList<Integer>> biDouble =
                (list1,list2)->{
            for(int i:list1){
                if(list2.contains(i)){
                    list2.remove(Integer.valueOf(i));
                }
            }

                    return list1.get(Integer.valueOf(0));
                };

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2,3,4,5,6));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(2,3,4,5,6));
        System.out.println("First index of list1:(As a double)  "+biDouble.applyAsDouble(l1, l2));
    }
}
