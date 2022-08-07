package day34_GarbageCollection_AccesModihiers;

public class StaticMembers {

    static class class1{

    }

    public static  int num = 100;

    public static void method(){


    }

    static {

    }






}

class A{//outer class

    static class B{ // inner class- if the class is member of outer class, inner class can be static

        public static void method(){

        }

    }

}


class C{

    public static void main(String[] args) {

        A.B.method();

    }
}