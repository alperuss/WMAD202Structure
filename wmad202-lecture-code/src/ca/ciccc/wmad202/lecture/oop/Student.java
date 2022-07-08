package ca.ciccc.wmad202.lecture.oop;

public class Student {

    //Private properties --> Encapsulation
    //Student Has-A ...

    private String studentID;
    private Transcript transcript;

    public Student(String studentID){
        this.studentID = studentID;
        this.transcript = new Transcript();
    }

    public void registerCourse(Course c){
        this.transcript.addCourse(c, -1);
    }

    public Transcript getTranscript(){
        return this.transcript;
    }

    public void setGradeForACourse(Course c, int grade){
        this.transcript.addCourse(c, grade);
    }
}
