package ca.ciccc.wmad202.assignment3.question7;

import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {

    public static void main(){

        ArrayList<Integer> list = makeList();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a find in list: ");
        int num = input.nextInt();
        int a = linearSearch(list,num);

    }

    public static ArrayList<Integer> makeList() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        int number = input.nextInt();
        while (number < 100) {   // Stops when write greater than 100 and makes list
            list.add(number);
            number = input.nextInt();
        }
        return list;

    }
    public static int linearSearch(ArrayList<Integer> arrayList, int key){
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i) == key){
                System.out.println("The list exists the number");
                return arrayList.get(i);

            }
        }
        System.out.println("The list does not exist the number");
        return -1;
    }

}
