package week12;

public class LocalvsInstance {

    public int a; // a is instance variable

    public void showDifference(){
        int a = 5; // a is local variable
        System.out.println(a);
    }

    public void showDifference(int number){
        int a = number;
        System.out.println(a);
    }

    public static void main(String[] args) {

        LocalvsInstance obj = new LocalvsInstance();

        System.out.println("-----coming from the method : local---------");
        obj.showDifference();

        System.out.println("-----coming from instance variable---------");
        System.out.println(obj.a);

        obj.a = 1;
        System.out.println(obj.a);



    }




}
