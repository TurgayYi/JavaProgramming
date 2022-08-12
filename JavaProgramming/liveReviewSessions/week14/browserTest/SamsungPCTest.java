package week14.browserTest;

public class SamsungPCTest {
    public static void main(String[] args) {


        TestCase testCase = new TestCase(new Browser("Chrome"),new OS("Mac"));

        System.out.println("Step1 ");
        testCase.navigateTo("https://www.demoblaze.com/");


        DemoBlazeTest demoBlazeTestSamsung = new DemoBlazeTest(new Browser("Chrome"),new OS("Mac"));

        System.out.println("Step3 ");
        demoBlazeTestSamsung.navigateTo("Laptops");
        System.out.println("Step2 ");
        demoBlazeTestSamsung.shopFor("Samsung PC");





    }

}
