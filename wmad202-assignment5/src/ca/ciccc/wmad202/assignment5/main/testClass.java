package ca.ciccc.wmad202.assignment5.main;

import ca.ciccc.wmad202.assignment5.question1.Student;
import ca.ciccc.wmad202.assignment5.question3.PolynomialFactor;
import ca.ciccc.wmad202.assignment5.question3.SinglePolynomialFactor;

import java.util.ArrayList;
import java.util.Arrays;

public class testClass {


    public static void testStudentExample(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(80, 78, 65, 34));

        Student student1= new Student("77889911", numbers,"Dave");
        Student student2= new Student("66553322","James");
        student2.addGrade(87);
        student2.addGrade(63);
        student2.addGrade(45);
        student2.addGrade(91);

        student1.getGPA();
        student2.getGPA();
        int highGPA= student1.compareGPA(student2);
        if(highGPA==1){
            System.out.println("Student 1 has high GPA");
        }
        else if(highGPA==0){
            System.out.println("Both students have same GPA.");
        }
        else{
            System.out.println("Student 2 has high GPA.");
        }

    }
    public static void testFactorExample(){
        SinglePolynomialFactor singleFactor1= new SinglePolynomialFactor(3,5);
        SinglePolynomialFactor singleFactor2= new SinglePolynomialFactor(5,4);
        SinglePolynomialFactor singleFactor3= new SinglePolynomialFactor(4,4);
        SinglePolynomialFactor singleFactor4= new SinglePolynomialFactor(3,5);

        System.out.println("Single factors equal or not: " + singleFactor1.checkSingleFactorEquality(singleFactor2));

        PolynomialFactor factor= new PolynomialFactor();
        PolynomialFactor factor2= new PolynomialFactor();

        factor.addSinglePolynomialFactor(singleFactor1,0);
        factor.addSinglePolynomialFactor(singleFactor2,1);

        factor2.addSinglePolynomialFactor(singleFactor3,0);
        factor2.addSinglePolynomialFactor(singleFactor4,1);

        System.out.println("Polynomial factors equal or not: " + factor.checkPolynomialEquationsEquality(factor2));

        System.out.println("Biggest exponent number is "+factor.getBiggestExponentNumber());
        factor.addPolynomialEquations(factor2);





    }
}
