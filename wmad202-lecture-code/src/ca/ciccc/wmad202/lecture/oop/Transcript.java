package ca.ciccc.wmad202.lecture.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Transcript {

    private HashMap<Course, Integer> courses;

    public Transcript(){
        this.courses = new HashMap<>();
    }

    public Transcript(HashMap<Course, Integer> courses){
        this.courses = courses;
    }


    public void addCourse(Course course, Integer grade){
        this.courses.put(course, grade);
    }

    public float getGPA(){

        int totalGrades = 0;

        for(Course c: this.courses.keySet()){
            int grade = this.courses.get(c);
            totalGrades = totalGrades + grade;
        }

        if(this.courses.keySet().size()>0){
            return (float) (((1.0)*totalGrades)/this.courses.keySet().size());
        } else {
            return 0;
        }
    }


    public void printTranscript(){

        System.out.println("===========Transcript==========");
        for(Course c: this.courses.keySet()){
            System.out.println(c.getCode() + ":  "+this.courses.get(c));
        }

        System.out.println("GPA is: "+ this.getGPA());

    }

}
