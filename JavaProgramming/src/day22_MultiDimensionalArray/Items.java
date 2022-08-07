package day22_MultiDimensionalArray;

public class Items {

    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        for (String[] item : items) {//1

            for (String each : item) {

                System.out.print(each + "\t");

            }
            System.out.println();
        }

        System.out.println("---------------------------");


        for (String[] item : items) {//2

            for (int i = item.length - 1; i >= 0; i--) {

                System.out.print(item[i] + "\t");


            }
            System.out.println();

        }

        System.out.println("------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {

            for (String s : items[i]) {

                System.out.print(s + "\t");

            }
            System.out.println();
        }



    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */