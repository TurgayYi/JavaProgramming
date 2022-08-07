package day21_ForEachLoop;

public class Items {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int i = 0;
        for (String item : items) {

            System.out.println(item + " ~ $" + prices[i] + " ~ #" + itemIDs[i]);
            i++;

        }



    }

}
/*
       Print the report of each shopping item
            name - price - #ID
 */