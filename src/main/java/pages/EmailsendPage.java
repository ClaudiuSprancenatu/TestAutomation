package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailsendPage {
    private WebDriver driver;
    private By emailsent = By.id("content");

    public EmailsendPage(WebDriver driver){
        this.driver = driver;
    }
    public String getMessage(){
        return driver.findElement(emailsent).getText();
    }
}
