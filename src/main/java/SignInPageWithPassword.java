import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPageWithPassword {

    WebDriver driver;


    public SignInPageWithPassword(WebDriver driver) {
        this.driver = driver;
    }


    private By passwordField = By.cssSelector("input[type=password]");

    private By nextButtonPasswordPage = By.xpath("//div[@id='passwordNext']");

    public void typePasswordField(String password) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type=password]")));
        driver.findElement(passwordField).sendKeys(password);


    }

    public MailPage clickNextButtonWithPassword() {
        driver.findElement(nextButtonPasswordPage).click();
        return new MailPage(driver);
    }

    public MailPage lastSteptypeCredits(String password) {
        this.typePasswordField(password);
        this.clickNextButtonWithPassword();
        return new MailPage(driver);
    }
}
