package day42_Exceptions;

import day04_Variables.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element as break");

        //throw new InterruptedException(); //throw keyword with checked exceptions
        //System.out.println("Hello world"); after throw keyword the code will be unreachable
       // throw new Rectangle(5,7);


    }

}
