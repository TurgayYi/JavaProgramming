package day31_Constructors;

public class ItemObjects {

    public static void main(String[] args) {

        Item item = new Item("Lamba",12.34,83);

        System.out.println(item);



    }
}
/*
4. Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()



 */