package day31_Constructors;

public class Carpet {

        public double width, length, unitPrice;
        public boolean isPersian;


        public Carpet(double width, double length, double unitPrice, boolean isPersian) {
                this.width = width;
                this.length = length;
                this.unitPrice = unitPrice;
                this.isPersian = isPersian;
        }

        public double calCost(){
                if(isPersian){
                        return 200 + (unitPrice * width*length);
                }else{
                        return (unitPrice * width*length);
                }
        }

        public String toString() {
                return "Carpet{" +
                        "Width=" + width +
                        ", Length=" + length +
                        ", Unit Price= $" + unitPrice +
                        ", Is Persian=" + isPersian +
                        ", Total Cost = $" + calCost() +
                        '}';


        }


}
/*
5. Carpet Task:
	5.1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

		Add a constructor to set all the instances

                instance methods:

                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of
                        the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */