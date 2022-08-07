package day36_Inheritance.employeeTask;



public class EmployeeObjects {

    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.setInfo("Azra",'F',13,601,"Senior Develper",230000);
        System.out.println(developer);
        developer.coding();
        developer.work();

        Tester tester = new Tester();
        tester.setInfo("Semih", 'M', 11,123,"SDET",123456);
        System.out.println(tester);
        tester.creatingTicket();
        tester.testing();


        Teacher teacher = new Teacher();
        teacher.setInfo("Busra",'F',16,233,"Bos",0.23);
        System.out.println(teacher);
        teacher.work();
        teacher.teaching();


        Driver driver = new Driver();
        driver.setInfo("Musti",'M',15,33,"Bus Driver",540000);
        System.out.println(driver);
        driver.drive();
        driver.work();



    }


}
/*
	2.7 Create a class named Employee Objects and and test of the sub class' objects
 */