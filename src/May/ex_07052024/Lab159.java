package May.ex_07052024;

public class Lab159 {
    public static void main(String[] args) {
        //Web Automation
        openDataBase();
        openBrowser();
        testLoginPage1();
        testLoginPage("Page2");
        closeBrowser();

        openBrowser();
        testLoginPage("Page3");
        closeBrowser();

        openBrowser();
        testLoginPage("Page4");
        closeBrowser();

        openBrowser();
        testLoginPage("Page5");
        closeBrowser();
    }

    static void openDataBase() {
        System.out.println("Connecting DataBase");
    }
    static  void openBrowser(){
        System.out.println("Opening Chrome Browser");
    }
    static  void closeBrowser(){
        System.out.println("Closing Chrome Browser");
    }
    static void testLoginPage1(){
        System.out.println("Testing Page 1 Opened");
    }
    static void testLoginPage( String Page){
        System.out.println("Testing -> "+Page);
    }
}
