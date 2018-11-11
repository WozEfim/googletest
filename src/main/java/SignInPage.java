import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignInPage {


    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private By inputEmailField = By.xpath(".//*[@id='identifierId']");

    private By nextButton = By.xpath("//div[@id='identifierNext']");

    public SignInPage typeEmail(String email){
        driver.findElement(inputEmailField).sendKeys(email);
        return this;
    }

    public SignInPageWithPassword clickNextButton(){
        driver.findElement(nextButton).click();
        return new SignInPageWithPassword(driver);
    }

   public SignInPageWithPassword typeCredits(String email){
        this.typeEmail(email);
        this.clickNextButton();
        return new SignInPageWithPassword(driver);
    }





}
