package ca.ciccc.wmad202.assignment3.question8;

import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {

    public static void main(){
        System.out.println("Please enter a number between 40 and 100: ");
        Scanner input = new Scanner(System.in);
        int topLimit = input.nextInt();
        while(!(topLimit <100) && !(topLimit >40)){
            topLimit = input.nextInt();
        }
        System.out.println("Please enter a divide number : ");
        int number = input.nextInt();

        ArrayList<Integer> numbers = divisibleList(topLimit,number);
        System.out.println(numbers);



    }

    public static ArrayList<Integer> divisibleList(int topLimit, int number){
        ArrayList<Integer> list = new ArrayList<>();
            for(int i = 2;i<topLimit;i++){
                if (i%number==0){
                    list.add(i);
                }
            }
            return list;

    }
    public static ArrayList<Integer> makeList() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number <= 100 && number >= 40) {
            list.add(number);
            number = input.nextInt();
        }
        return list;

    }
}
