package day18_NestedLoop.day20_Arrays;

public class Classmates {

    public static void main(String[] args) {

        String[] clasmates = {"Azra Yildirim", "Semih Yildirim", "Ecrin Yildirim", "Büşra Yildirim", "Batuhan Özdemir",
                            "Nisa Nur", "Melisa Özdemir","Mustafa Yildirim","Muhammed Ağa", "Cemile Man" };


        for (int i = 0; i < clasmates.length; i++) {
            String initials = ""+clasmates[i].charAt(0) + clasmates[i].charAt(clasmates[i].indexOf(' ') +1);
            System.out.println(initials);

        }



    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */