package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class baseTests {
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup(){
        //System.setProperty("webdriver.chrome.driver","resources.chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        goHome();
        //System.out.println(driver.getTitle());
        homePage = new HomePage(driver);

    }

    @AfterMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
        //driver.quit();
    }


}
