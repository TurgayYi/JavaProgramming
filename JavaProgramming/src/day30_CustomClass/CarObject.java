package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Mercedes","E200","Black",2013,45000);

        Car car2 = new Car();
        car2.setInfo("Nissan", "Qashqai","White",2015,18000);

        Car car3 = new Car();
        car3.setInfo("Toyota","Camry","Grey",2022,35000);


        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);

        car1.drive();
        car2.start();
        car3.stop();

        //Car[] cars = {car1, car2, car3};
       // System.out.println(Arrays.toString(cars));
        //[Car{brand='Mercedes', model='E200', color='Black', year=2013, price= $45000.0}, Car{brand='Nissan', model='Qashqai', color='White', year=2015, price= $18000.0}, Car{brand='Toyota', model='Camry', color='Grey', year=2022, price= $35000.0}]

        ArrayList<Car>cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3));

        for( Car each : cars){
            System.out.println(each.brand + " : " + each.price);
        }

        System.out.println("-------------------------------------");

        /*
        Mercedes 2000-2020
        Nissan  2009 2020
         */

        cars.removeIf(p->p.brand.equals("Mercedes") && p.year >= 2000 && p.year <= 2020);
        cars.removeIf(p->p.brand.equals("Nissan") && p.year >= 2009 && p.year <= 2020);

        System.out.println(cars);


    }

}
