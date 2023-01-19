package day52_MapFunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;

        printEach= (s) -> {
            for (char c : s.toCharArray()) {
                System.out.println(c);
            }
        };

        printEach.test("Wooden spoon");


        MySecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);

        cube.test(5);




    }

}
