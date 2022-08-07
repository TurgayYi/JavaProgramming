package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        //this(); constructors can not call itself
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){

        this();
        System.out.println("Constructor with int argument");
        //this() if you don't use constructor call at the first step it gives error

    }

    public ConstructorCalls(String str){
        this(10);
        //this(10); you can not call more than one constructor

        System.out.println("Constructor with String argument");

    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();//Default constructor

        System.out.println("--------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);//Default constructor, constructor with int argument

        System.out.println("--------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");//Default constructor, constructor with int argument, constructor with String argument

    }





}
