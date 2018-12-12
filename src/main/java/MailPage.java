import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage {

    WebDriver driver;

    public MailPage(WebDriver driver) {
        this.driver = driver;
    }


    private By checkAllButton = By.xpath("//span[@class='T-Jo J-J5-Ji']");
    private By deleteButton = By.xpath("//div[@class='asa']");

    public void  clickCheckAllButton() {
        driver.findElement(checkAllButton).click();

    }

    public void clickDeleteButton() {
        driver.findElement(deleteButton).click();

    }


}
