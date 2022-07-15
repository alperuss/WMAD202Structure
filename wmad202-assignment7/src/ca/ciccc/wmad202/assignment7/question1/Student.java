package ca.ciccc.wmad202.assignment7.question1;

public class Student implements IHasProperty {
    private Integer studentID;
    private String studentName;
    private Float score;

    public Student(Integer studentID, String studentName, Float score){
        this.studentID = studentID;
        this.studentName = studentName;
        this.score = score;
    }

    @Override
    public boolean HasProperty() {
        return this.score>2.3;
    }
}
