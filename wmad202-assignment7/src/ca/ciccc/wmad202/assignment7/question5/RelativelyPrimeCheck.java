package ca.ciccc.wmad202.assignment7.question5;

import java.util.List;
import java.util.function.UnaryOperator;

public class RelativelyPrimeCheck{
    public static <T> int findFirst(List<T> list, int begin, int end, UnaryOperator<T> p){
        for (int i = begin; i <= end; i++){
            for(int j = i+1; j <= end;j++){
                if(gcd(list.get(i),list.get(j))==1){
                    return (int) p.apply(list.get(i));
                }
            }
        }
        return 0;

    }
    public static <T> int gcd(T a,T b){
        int count=0;
        for (int i=2; i<=(int)a; i++) { // we start from 2, because we can't divide on 0, and every number divisible on 1
            if ((int)a % i == 0 && (int)b % i==0) {
                count++; //count them
            }
        }
        if (count == 0) { // if there is no divisible numbers
            return 1;
        } else {
            return 0;
        }
    }
}
