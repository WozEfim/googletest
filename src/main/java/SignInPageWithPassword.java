import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SignInPageWithPassword {

    WebDriver wd;


    public SignInPageWithPassword(WebDriver driver) {
        this.wd = driver;
    }



    private By passwordField = By.cssSelector("input[type=password]");

    private By nextButtonPasswordPage = By.xpath("//div[@id='passwordNext']");

    public SignInPageWithPassword typePasswordField(String password){
        WebDriverWait wait = new WebDriverWait(wd, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type=password]")));
        wd.findElement(passwordField).sendKeys(password);
        return this;

    }

    public MailPage clickNextButtonWithPassword(){
        wd.findElement(nextButtonPasswordPage).click();
        return new MailPage(wd);
    }

    public MailPage lastSteptypeCredits(String password){
        this.typePasswordField(password);
        this.clickNextButtonWithPassword();
        return new MailPage(wd);
    }
}
