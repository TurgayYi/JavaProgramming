package day42_Exceptions.utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

      //  System.out.println(AccessModifiers_Test4.name1);//default is not visible outside the package
        System.out.println(AccessModifiers_Test4.name2);//protected is only visible outside the package-sub-class

        AccessModifiers_Test4.method2();




    }

}
