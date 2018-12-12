import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class MailPage {

    WebDriver driver;

    public MailPage(WebDriver driver) {
        this.driver = driver;
    }

    // поместил вебелементы писем на странице с сообщениями
    public List<WebElement> listMessages() {
        return driver.findElements(By.xpath(".//tr[@jsaction='bjyjJe:NOSeAe;pInidd:NOSeAe;']"));


    }

    // прошелся по каждому сообщению кликнув на чекбокс выделенния
    public void clickToCheckbox() {
        List<WebElement> messages = listMessages();
        for (WebElement element : messages) {
            WebElement checkbox = element.findElement(By.xpath("//div[@class='oZ-jc T-Jo J-J5-Ji ']"));
            checkbox.click();

        }


    }

    // удалил ранее выделенные сообщения
    public void deleteMessages() {
        WebElement deleteicon = driver.findElement(By.xpath("//div[@class='asa']"));
        deleteicon.click();
    }



}