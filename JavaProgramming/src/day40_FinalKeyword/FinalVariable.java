package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;

    final static String name;

    static {
        name = "EU 9";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }




    public static void main(String[] args) {


         final double pi = 3.14;
         // pi = 4.4; final variables can not be reassigned


        final String name;
        name = "Java";

        //name = "Wooden Spoon";
        System.out.println(name);

        System.out.println("---------------------------");

        FinalVariable obj = new FinalVariable("May 01");
        //obj.birthDay = "Jan1";


        System.out.println("----------------------");

        //FinalVariable.name = "Python";you can never reassign final variables(no matter static or instance)
        System.out.println(FinalVariable.name);


    }

}
