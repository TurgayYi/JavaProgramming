package day17_While_DoWhile;

public class FrequencyOfWorld_While {
    public static void main(String[] args) {

        String str = "Java Java  Python Python";

        int frequency = 0;
        
        while(str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequency++;
        }
        System.out.println("frequency = " + frequency);


        System.out.println("------------------------------------");
        
        String sentence = "cat cat cat cat dog cat cat dog dog cat cat CAT CAT".toLowerCase();
        
        int frequencyCat = 0;
        
        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");//if we use replace instead of replacefirst, it would replace all cat  at once. But we want to delete one by one.
            frequencyCat++;
        }

        System.out.println("frequencyCat = " + frequencyCat);

        System.out.println("-----------------------------");

        String s = "java java java python python";
         int countJava = 0;
         int countPython =0;

         while (s.contains("java") || s.contains("python")){
             if(s.contains("java")){
                 s = s.replaceFirst("java","");
                 countJava++;
             }if(s.contains("python")){
                 s = s.replaceFirst("python","");
                 countPython ++;
             }


         }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);



    }

}
