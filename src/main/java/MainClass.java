import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MainClass {
    static WebDriver wd;



    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/efim/chromedr/geckodriver");

        wd = new FirefoxDriver();
        wd.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");



        SignInPage signinpage = new SignInPage(wd);
        signinpage.typeCredits("woz.efim");


        SignInPageWithPassword signinpagewithpassword = new SignInPageWithPassword(wd);
        signinpagewithpassword.lastSteptypeCredits("R3t866mu302");













    }
}
