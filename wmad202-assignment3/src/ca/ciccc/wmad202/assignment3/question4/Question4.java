package ca.ciccc.wmad202.assignment3.question4;
import java.util.Arrays;
public class Question4 {
    public static void repeatedIntegers() {


        int[] list = {1, 4, 5, 6, 1, 2, 4, 5, 6, 5};

        Arrays.sort(list);
        int element = repeatedElement(list);
        System.out.println(element + " has repeated most");
    }

        public static int repeatedElement(int[] list){
            int element = Integer.MIN_VALUE, max_count = 1, count = 1;
            for(int i=1; i<list.length; i++){
                if(list[i] == list[i-1])
                    count++;

                if(list[i] != list[i-1] || i==list.length-1){
                    if(count>max_count){
                        max_count = count;
                        element = list[i-1];
                    }
                    count =1;
                }
            }
            return element;
        }




    }
