package week14.browserTest;

public class Tests {

    public static void main(String[] args) {

        TestCase testCaseOne = new TestCase();
        Browser browser = new Browser();
        browser.setBrowserType("Chrome");

        OS os = new OS();
        os.setOS("Windows");

        testCaseOne.browser = browser;
        testCaseOne.operatingSystem = os;

        System.out.println(testCaseOne);


        TestCase testCase2 = new TestCase(new Browser("Chrome"),new OS("Windows"));
        System.out.println(testCase2);



    }


}
