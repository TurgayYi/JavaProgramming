package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

    initials("Ali","Veli");

        System.out.println("------------------------");

    domainOfEmail("woodenspoon@hotmail.com");

        System.out.println("-------------------------");

    String[] emails = {"josh@gmail.com", "jim@yahoo.com", "Elminur@cydeo.com","Gulsen@gmail.com"};

        for (String email : emails) {

            domainOfEmail(email);
        }

        System.out.println("-------------------");

        nameOfMonth(2);

        System.out.println("---------------------");

        nameOfDay(5);

        System.out.println("----------------------");

        numOfDaysAMonth(3,2022);




    }
    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initials = " + initials);
    }

    //	2. Create a method that can display the domain of the email

    public static void domainOfEmail(String email){

        String domain = email.substring(email.indexOf('@')+1,email.indexOf(".com"));

        System.out.println("domain = " + domain);

    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number){

        String name = "";

        if(number>=1 && number<=12){

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

        }else{
            System.out.println("Invalid");

        }

    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){

        String name = "";
        if(number>=1 && number<=7){
            name= (number==1)? "Monday" :(number==2)?  "Tuesday":(number==3)? "Wednesday":(number==4)?
                    "Thursday":(number==5)? "Friday":(number==6)? "Saturday" : "Sunday" ;


        }else{
            System.out.println("Invalid");

        }
        System.out.println("name of the day = " + name);

    }

    //	5. Create a method that can print how many days a month has


   public static void numOfDaysAMonth(int number, int year){
        if(number>=1 && number<=12){
            if(number==1 || number==3 || number==5 || number==7 || number==8 || number==10 || number==12 ){
                System.out.println(31);
            }else if(number==4 || number==6 || number==9 || number==11){
                System.out.println(30);
            }else{
                if(year%4==0){
                    System.out.println(29);
                }else{
                    System.out.println(28);
                }

            }


        }else{
            System.out.println("Invalid");
        }

   }






}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

 */