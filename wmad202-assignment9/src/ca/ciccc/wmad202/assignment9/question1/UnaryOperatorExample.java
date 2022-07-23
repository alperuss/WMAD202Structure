package ca.ciccc.wmad202.assignment9.question1;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void test(){
        UnaryOperator<Integer> op= x-> x * x;
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        for(Integer i: list1){
            int result= op.apply(i);
            list2.add(result);

        }
        System.out.println(list2);




    }
}
