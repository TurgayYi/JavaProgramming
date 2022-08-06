package day39_Recap.studentTask;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }


    public void study() {
        System.out.println(getName() + " is studying for the final exams");
    }
}
