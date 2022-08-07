package day37_Inheritance;


class A {

    public A(int a){
        System.out.println("A");
    }

}


class B extends A{

    public B(){
        //super();compiler calls implicitly
        super(9);
        System.out.println("B");
    }

}




public class ConstructorPractise {

    public static void main(String[] args) {


       B obj = new B();

    }



}
