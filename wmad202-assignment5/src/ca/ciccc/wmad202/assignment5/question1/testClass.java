package ca.ciccc.wmad202.assignment5.question1;

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
}
