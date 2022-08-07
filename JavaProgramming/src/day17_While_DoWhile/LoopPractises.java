package day17_While_DoWhile;

public class LoopPractises {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("------------------------------");

        int x = 1;
        while (x <= 10) {

            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        System.out.println("------------------------------");

        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        }while (k<=10);



    }
}