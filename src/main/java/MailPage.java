import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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
            WebElement checkbox = element.findElement(By.xpath(".//div[@dir='ltr' and @role='checkbox']"));
            ////div[@class='oZ-jc T-Jo J-J5-Ji '] - checkbox xpath v1
            //.//div[@dir='ltr' and @role='checkbox']
            checkbox.click();

        }


    }

    // удалил ранее выделенные сообщения
    public void deleteMessages() {
        WebElement deleteicon = driver.findElement(By.xpath("//div[@class='asa']"));
        deleteicon.click();
    }

    public void verifyNewMessages(){
        List<WebElement> newmessages = listMessages();
        while (newmessages.size() != 0){
            retryingFindClick();
            //clickToCheckbox();
            deleteMessages();
        }
    }

    public boolean retryingFindClick() {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
                driver.findElement(By.xpath(".//div[@dir='ltr' and @role='checkbox']")).click();
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
    }



}