package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

    String sentence = "Today is a good day to learn Java";

    String[] words = sentence.split(" ");
    String[] reversedSentence = new String[words.length];

        for (int i = words.length - 1, j = 0; i >= 0; i--, j++) {

            reversedSentence[j] = words[i];

            System.out.print(reversedSentence[j] + " ");
        }




    }
}
/*
warmup task:
	1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */