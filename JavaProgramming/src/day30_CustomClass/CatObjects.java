package day30_CustomClass;

public class CatObjects {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setInfo("Leo","British Short",3,"Extra Large",'M',false);


        Cat cat2 = new Cat();
        cat2.setInfo("Sütlaç","Persian",4,"Large",'M', false);

        cat1.eat();

        System.out.println(cat1);
        System.out.println(cat2);


    }
}
