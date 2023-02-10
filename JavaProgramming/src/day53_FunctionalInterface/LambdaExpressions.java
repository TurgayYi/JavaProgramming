package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        //2. Create a function that takes a String and returns the reversed value of the given argument

        MyThirdFunctionalInterface <String> stringReverse = s ->{

            String reverse = new StringBuilder(s).toString();

            return reverse;

        };

        String result = stringReverse.method("Wooden Spoon");

        System.out.println(result);

        //1. Create a function that takes one integer and returns the cube of the given argument
        MyThirdFunctionalInterface<Integer> cube = i -> {
            Integer c = i*i*i;
            return c;

        };

        int cubeOfNum = cube.method(4);
        System.out.println(cubeOfNum);



    }
}
