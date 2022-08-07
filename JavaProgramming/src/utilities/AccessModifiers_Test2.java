package utilities;

import day34_GarbageCollection_AccesModihiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData);// default Access modifier is not visible outside the package
      //  System.out.println(AccessModifiers.privateData);// private Access modifier is not visible outside the package(even class)


        AccessModifiers.method1();

        //AccessModifiers.method2();// default Access modifier is not visible outside the package

        //AccessModifiers.method3();// private Access modifier is not visible outside the package(even class)


    }


}
