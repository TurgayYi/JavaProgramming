package day39_Recap.studentTask;

public class StudentObjects {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("Ali Can",32,'M',23,"SDET",
                'B',"MIT");

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Ahmet Tas",21,'M',1,
                "Computer Science",'A',"BU");

        CydeoStudent cydeoStudent = new CydeoStudent("Azra Sırıkcan",13,'F',10,"Animation",
                'A',123,4,"Java");


        System.out.println(graduateStudent);
        graduateStudent.eat();

        System.out.println(cydeoStudent);
        cydeoStudent.sleep();


    }





}
