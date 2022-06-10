package ca.ciccc.wmad202.lecture.basics;

import java.util.Scanner;

public class JavaBasics {

    final static int CLUB_AGE = 19;
    public static void isPersonAllowedToTheClub(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if(age>CLUB_AGE){
            System.out.println("You can enter the club");
        } else {
            System.out.println("Wait! You cannot enter the club");
        }
    }

    //and &&
    //or ||
    //Not !
    public static void evaluate(int grade){
        if (grade>=80){
            System.out.printf("You got a great grade %d\n", grade);
        } else if(grade>=60 && grade<80){
            System.out.printf("You got a good grade %d\n", grade);
        } else if(grade>=50 && grade<60){
            System.out.printf("You got a passing grade %d\n", grade);
        } else{
            System.out.printf("You failed %d\n", grade);
        }
    }

    //while
    public static float calculateAverage(){

        System.out.println("Please enter a number [0 to stop]: ");
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int total=0;
        int number = input.nextInt();
        while(number!=0){
            counter++; //counter = counter +1
            total = total + number;
            System.out.println("Please enter a number [0 to stop]: ");
            number = input.nextInt();
        }

        if(counter>0){
            float average = (float)total / counter;
            System.out.printf("The average is %f \n", average);
            return average;
        } else{
            System.out.println("The user has not entered any number!");
            return -1;
        }
    }

    public static void workingWithDivision(){
        int num1 = 13;
        int num2 = 3;
        float num3 = 6.354F;
        float num4 = 32409090909333293047.20349402934012938412039481209348190241203948129031F;

        System.out.println(num1/num2);  //4
        System.out.println((float)num1/num2); //4.3333335
        System.out.println(num1/num3); //2.1666667
        System.out.println(num3/num4); //0.8450704225352114
        System.out.println(num1/(int)num3); //2
    }

    public static char findMinimumCharacterInString(String word){
        char minimum =word.charAt(0);

        //for letter in word
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)<=minimum){
                minimum = word.charAt(i);
            }
        }

        return minimum;
    }

    public static boolean isPrime(int number){

        for(int i=2; i<number; i++){
            if(number%i==0){
                System.out.println("The number is Not prime: "+number);
                return false;
            }
        }

        System.out.println("The number is prime: "+number);
        return true;
    }

    public static int add1(){
        int num1 = 30;
        int num2 = 40;
        int result = num1+num2;

        return result;
    }

    public static int add2(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        int result = num1+num2;

        return result;
    }

    public static int add3(int num1, int num2){
        int result = num1+num2;
        return result;
    }



}
