package day18_NestedLoop.day20_Arrays;

public class FindIndex {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        boolean isIpad = false;
        int indexOfGloves = 0;
        for (int i = 0; i < items.length; i++) {

            if(items[i].equals("Gloves")){
                indexOfGloves = i;
            }

            if(items[i].equalsIgnoreCase("iPad")){
                isIpad=true;
            }

            String report = items[i] + " - " + prices[i] + " - #" + itemIDs[i];
            System.out.println(report);

        }
        System.out.println("The items list contains iPad : " + isIpad);
        System.out.println("indexOfGloves = " + indexOfGloves);

    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */
