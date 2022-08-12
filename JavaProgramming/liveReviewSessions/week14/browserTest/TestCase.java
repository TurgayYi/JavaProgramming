package week14.browserTest;

public class TestCase {

    Browser browser;
    OS operatingSystem;

    public TestCase() {
    }

    public TestCase(Browser browser, OS operatingSystem) {
        this.browser = browser;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return "TestCase{" +
                "browser=" + browser.getBrowserType() +
                ", operatingSystem=" + operatingSystem.getOS() +
                '}';


    }

    public void navigateTo(String url){
        System.out.println("Opening " + url + " with " + browser.getBrowserType() + " in the "+ operatingSystem.getOS() );
    }



}
