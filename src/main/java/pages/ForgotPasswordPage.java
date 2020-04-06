package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieve = By.cssSelector("#forgot_password button");

    public ForgotPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    public void setEmail (String email){
            driver.findElement(emailField).sendKeys(email);

    }

    public EmailsendPage clickretrieve(){
        driver.findElement(retrieve).click();
        return new EmailsendPage(driver);
    }
}
