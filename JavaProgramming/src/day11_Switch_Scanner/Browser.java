package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName = "chrome";
        String result = "";

        if(browserName =="chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge" ){
            if(browserName=="chrome"){
                result = "chrome Browser is selected";
            }else if(browserName == "firefox"){
                result = "firefox";
            }else if(browserName == "opera"){
                result = "opera Browser is selected";
            }else if(browserName == "firefox"){
                result = "firefox Browser is selected";
            }else if(browserName == "safari"){
                result = "firefox";
            }else {
                result = "edge Browser is selected";
            }


        }else{
            result = "Invalid Browser Name";
        }

        System.out.println(result);


    }

}
/*
	1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
 */