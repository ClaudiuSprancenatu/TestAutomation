package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By Slider = By.cssSelector(".sliderContainer input");
    private By SliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(String value){
        while(!getMoveSlider().equals(value)){
            driver.findElement(Slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getMoveSlider(){
        return driver.findElement(SliderValue).getText();
    }

}
