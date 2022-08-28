package day44_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Japan","Corolla",1999,20999,"White");
        Honda honda = new Honda("Japan","Civic",2000,34555,"Gray");
        BMW bmw = new BMW("Germany","X5",2022,23456777,"Blue");
        Audi audi = new Audi("Germany", "Q7",2012,32000,"Black");
        Mercedes mercedes = new Mercedes("Germany","MyBach",2022,255555555,"Black");
        Tesla tesla = new Tesla("US","Model3",2021,329999,"Purple");
        Nio nio = new Nio("China","THY",1988,11,"Pink");

        tesla.autoPark();




    }
}
