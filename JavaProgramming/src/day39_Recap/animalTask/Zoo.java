package day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Leo","British",'M',3,"Large","White",false,true,true);

        Dog dog = new Dog("Pablo","Bug",'M',3,"Large","Brown",false,true,true);

        Dolphin dolphin = new Dolphin("Semih","Black Sea",'M',3,"Small","Gray",false,true,true);

        Parrot parrot = new Parrot("Ali","Carrabian",'M',2,"Small","Reddish",true,true,true);

        Lion lion = new Lion("Arzu","Mountain",'F',4,"Large","Orange",true,false,false);

        Tiger tiger = new Tiger("Shiro","Asian",'M',5,"Large","Yellow",true,false,false);

        Eagle eagle = new Eagle("Semih","Besiktas",'M',10,"Large","Black",true,false,false);

        Bear bear = new Bear("Azra","Solar",'F',12,"Small","White",true,false,false);

        Python python = new Python("Oli","Brown",'F',2,"Medium","Brown",true,false,false);

        Crocodile crocodile = new Crocodile("Seckin","Nile",'M',44,"Extra Large","Yellow",true,false,false);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(dolphin);
        System.out.println(parrot);
        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println(bear);
        System.out.println(python);
        System.out.println(crocodile);


        cat.eat();
        dog.eat();
        dolphin.eat();
        parrot.eat();

        lion.hunt();
        tiger.hunt();
        eagle.hunt();
        crocodile.hunt();
        python.hunt();



    }
}
/*
	6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */