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
        SinglePolynomialFactor factor1= new SinglePolynomialFactor(4,"x",2);
        SinglePolynomialFactor factor2= new SinglePolynomialFactor(4,"x",2);

        String factor= factor1.getSinglePolynomialFactor();
        String factor22= factor2.getSinglePolynomialFactor();

        PolynomialFactor factor3= new PolynomialFactor();
        factor3.addSinglePolynomialFactor(factor1,0);
        factor3.addSinglePolynomialFactor(factor2,1);

        System.out.println(String.valueOf(factor3.getPolynomialFactor()));



        System.out.println(factor);
        System.out.println(factor22);


    }
}
