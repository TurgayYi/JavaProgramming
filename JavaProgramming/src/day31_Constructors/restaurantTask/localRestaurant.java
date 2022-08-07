package day31_Constructors.restaurantTask;

import java.util.concurrent.Callable;

public class localRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Semih Turan","Istanbul",5);

        Server server1 = new Server("Ahmet", 233,34,true);
        Server server2 = new Server("Hasan", 123,30,false);
        Server server3 = new Server("Ayse", 2334,36,false);
        Server server4 = new Server("Elif", 1233,44,true);

        Server[] servers = {server1,server2,server3,server4};

        Chef chef1 = new Chef("Azra",12,45,true);
        Chef chef2 = new Chef("Elif",142,40,true);
        Chef chef3 = new Chef("Zeynep",412,35,false);
        Chef chef4 = new Chef("Cemile",1332,25,false);

        Chef[] chefs ={chef1,chef2,chef3,chef4};

        restaurant1.hireChef(chefs);
        restaurant1.hireServer(servers);
        restaurant1.terminateChef(12);
        restaurant1.terminateServer(123);
        System.out.println(restaurant1);











    }



}

/*
		6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	             Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */