package week15;

public class MultiCatchException2 {

    public static void main(String[] args) {

        String word = "Java";
        word = null;

        try {
            System.out.println(word.substring(20));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("e.getClass().getSimpleName() " + e.getClass().getSimpleName());
        }catch (NullPointerException n){
            System.out.println("n.getClass().getSimpleName() "+n.getClass().getSimpleName());
        }catch (Throwable t){
            System.out.println("t.getClass().getSimpleName() "+t.getClass().getSimpleName());
        }

        System.out.println("some code here");


    }

}
