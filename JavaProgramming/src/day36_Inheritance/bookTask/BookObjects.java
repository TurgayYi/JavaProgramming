package day36_Inheritance.bookTask;

public class BookObjects {

    public static void main(String[] args) {

        EBook eBook = new EBook();
        eBook.setInfo("Titanic","Novel","Ali",20,"Large",450);
        System.out.println(eBook);
        eBook.readBook();



        AudioBook audioBook = new AudioBook();
        audioBook.setInfo("White Fang","Adventure","Jack London",34,"long","klabnd");
        System.out.println(audioBook);
        audioBook.listen();




    }
}
