package day24_CustomMethod_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {
        nameOfMonth(30);
    }


    public static void nameOfMonth(int number){

        String name = "";

        if(number< 1 || number>12){
            System.out.println("Invalid");
            return; // exits nameOfMonth method
        }

            switch (number){
                case 1 : name= "Jan";
                    break;
                case 2 : name= "Feb";
                    break;
                case 3 : name= "Mar";
                    break;
                case 4 : name= "Apr";
                    break;
                case 5 : name= "May";
                    break;
                case 6 : name= "Jun";
                    break;
                case 7 : name= "Jul";
                    break;
                case 8 : name= "Aug";
                    break;
                case 9 : name= "Sep";
                    break;
                case 10 : name= "Oct";
                    break;
                case 11 : name= "Nov";
                    break;
                default:name = "Dec";


            }

            System.out.println("name of the month = " + name);

        }


}
