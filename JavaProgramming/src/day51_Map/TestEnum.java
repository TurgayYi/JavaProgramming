package day51_Map;

public class TestEnum {

    public static void main(String[] args) {


        Browser browser = Browser.SAFARI;

        switch (browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case CHROME:
                System.out.println("Chrome is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Opera is selected");


        }


        System.out.println("--------------------------------");

        Season season = Season.SUMMER;
        Season season1 = Season.WINTER;





    }


}
