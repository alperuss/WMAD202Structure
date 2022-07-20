package ca.ciccc.wmad202.assignment8.question4;

import java.util.Arrays;

public class ArrayChanger {
    static class Solution {
        public static int[] solution(int[] A, int K) {

            //Rotate the given array by n times toward right
            for(int i = 0; i < K; i++){

                //Stores the last element of array
                int last = A[A.length-1];

                for(int j = A.length-1; j > 0; j--){
                    //Shift element of array by one
                    A[j] = A[j-1];
                }
                //Last element of array will be added to the start of array.
                A[0] = last;

            }

            return A;
        }
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 4;

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(Solution.solution(A,K)));
    }
}
