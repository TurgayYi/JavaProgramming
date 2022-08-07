package day24_CustomMethod_Return;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";
        String word2 = "python";

        int frequencyOfJava = frequencyOfWord(sentence,word);
        int frequencyOfPython = frequencyOfWord(sentence,word2);

        System.out.println("frequencyOfJava = " + frequencyOfJava);
        System.out.println("frequencyOfPython = " + frequencyOfPython);

    }

    public static int frequencyOfWord(String sentence, String word){

        int frequency = 0;
        String[] words = sentence.split(" ");

        for (String each : words) {

            if(each.equalsIgnoreCase(word)){
                frequency++;
            }

        }


        return frequency;
    }

}
/*

	1.  create a method named frequencyOfWord that passes two parameters:
	string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */