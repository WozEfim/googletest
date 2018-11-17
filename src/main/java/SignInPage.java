import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignInPage {


    WebDriver wd;


    public SignInPage(WebDriver driver) {
        this.wd = driver;
    }

    private By inputEmailField = By.xpath(".//*[@id='identifierId']");

    private By nextButton = By.xpath("//div[@id='identifierNext']");

    public SignInPage typeEmail(String email){
        wd.findElement(inputEmailField).sendKeys(email);
        return this;
    }

    public SignInPageWithPassword clickNextButton(){
        wd.findElement(nextButton).click();
        return new SignInPageWithPassword(wd);
    }

   public SignInPageWithPassword typeCredits(String email){
        this.typeEmail(email);
        this.clickNextButton();
        return new SignInPageWithPassword(wd);
    }





}
