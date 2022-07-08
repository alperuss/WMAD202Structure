package ca.ciccc.wmad202.lecture.oop;

public class DemoStudentExample {
    /*
--A student can take some courses and receive grades for each course. We would like to see the transript of the student
--A transript has the list of courses the student has taken and all corresponding grades as well as the average
--A course is represented by a code.
 */


    public static void testStudentExample(){

        Course c1 = new Course(100);
        Course c2 = new Course(101);
        Course c3 = new Course(202);
        Course c4 = new Course(300);

        Student student1 = new Student("123");

        student1.registerCourse(c1);
        student1.registerCourse(c2);

        student1.setGradeForACourse(c1, 80);
        student1.setGradeForACourse(c2, 50);

        Student student2 = new Student("234");
        student2.registerCourse(c1);
        student2.registerCourse(c2);
        student2.registerCourse(c3);
        student2.registerCourse(c4);

        student2.setGradeForACourse(c1, 56);
        student2.setGradeForACourse(c2, 80);
        student2.setGradeForACourse(c3, 78);
        student2.setGradeForACourse(c4, 91);


        student1.getTranscript().printTranscript();
        student2.getTranscript().printTranscript();

    }
}
