package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz",23,'M',1,"Java Developer",234000);

        Tester tester = new Tester("Olga",25,'F',2,"SDET",1110000);

        Teacher teacher = new Teacher("Daniel",32,'M',3,"Math Teacher",1000000);

        Student student = new Student("Semih",11,'M',34,"Science");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);

        System.out.println("------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("------------------------");

        developer.work();
        tester.work();
        teacher.work();




    }


}
