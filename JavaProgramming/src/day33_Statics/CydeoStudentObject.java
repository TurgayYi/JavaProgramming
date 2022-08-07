package day33_Statics;

public class CydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Ali",23,'M',233,'B',2334,5);

        System.out.println(student1);
        CydeoStudent.printProgLanguage();



    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */