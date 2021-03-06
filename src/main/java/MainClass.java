import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class MainClass {
    static WebDriver driver;


    public static void main(String[] args) {
        //for MacOs geckodriver
        //System.setProperty("webdriver.chrome.driver", "/Users/efim/chromedr/chromedriver");

        //for Win10 geckodriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qa\\chromedriver\\chromedriver.exe");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        driver.get(url);


        SignInPage signinpage = new SignInPage(driver);
        SignInPageWithPassword signInPageWithPassword = signinpage.typeCredits("woz.efim");
        MailPage mailpage  = signInPageWithPassword.lastSteptypeCredits("R3t866mu302");


        if (mailpage.isMailExists()) {
            mailpage.clickToCheckbox();
            mailpage.deleteMessages();
            mailpage.verifyNewMessages();


        }
    }
}
