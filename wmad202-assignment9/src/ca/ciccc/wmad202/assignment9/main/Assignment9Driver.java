package ca.ciccc.wmad202.assignment9.main;

import ca.ciccc.wmad202.assignment9.question2.ListCombiner;
import ca.ciccc.wmad202.assignment9.question1.SupplierExample;
import ca.ciccc.wmad202.assignment9.question1.ToDoubleBiFunctionExample;
import ca.ciccc.wmad202.assignment9.question1.UnaryOperatorExample;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment9Driver {
    public static void run(){
        ToDoubleBiFunctionExample.test();
        SupplierExample.test();
        UnaryOperatorExample.test();


        ListCombiner<ArrayList<Integer>,ArrayList<Integer>> listCombiner=
                (list1,list2)-> {
                    ArrayList<Integer> list3 = new ArrayList<>();
                    for (Integer i : list1) {
                        list3.add(i);
                    }

                    for (Integer i : list2) {
                        list3.add(i);
                    }

                    return list3;
                };

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2,3,4,5,6));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(7, 8,9,10,11,12));
        System.out.println(listCombiner.combiner(l1, l2));
    }
}
