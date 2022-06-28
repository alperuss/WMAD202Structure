package ca.ciccc.wmad202.assignment5.question1;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentID;
    private ArrayList<Integer> grades;
    private String name;

    public Student(String studentID, ArrayList<Integer> grades, String name) {
        this.studentID = studentID;
        this.grades = grades;
        this.name = name;

    }
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.grades = new ArrayList<>();


    }
    public void addGrade(Integer newGrade){

            this.grades.add(newGrade);

    }
    public float getGPA(){
        int totalGrades = 0;

        for(int i = 0; i<this.grades.size();i++){
            int grade = this.grades.get(i);
            totalGrades = totalGrades + grade;
        }

        if(this.grades.size()>0){
            return (float) (((1.0)*totalGrades)/this.grades.size());
        } else {
            return 0;
        }
    }
    public void getStudentInfo(){
        System.out.println("Student Id is :" + this.studentID);
        System.out.println("Student Name is : "+ this.name);
        System.out.println("Grades are : "+ this.grades);
        System.out.println("GPA : "+ getGPA());
    }
    public int compareGPA(Student student2){
        if(this.getGPA()> student2.getGPA()){
            return 1;
        }
        else if(this.getGPA()== student2.getGPA()){
            return 0;
        }
        else{
            return -1;
        }
    }
}
