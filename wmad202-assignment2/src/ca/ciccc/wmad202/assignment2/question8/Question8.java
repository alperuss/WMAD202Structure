package ca.ciccc.wmad202.assignment2.question8;

import java.util.Scanner;

public class Question8 {
    public void MonteCarlo(){
        Scanner key=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n=key.nextInt();
        double x,y;
        int k=0;
        for(int i=1; i<=n; i++){
            x=Math.random();
            y=Math.random();
            if(x*x+y*y<=1) k++;
        }
        double p=4.*k/n;
        System.out.println(p);
    }
}
