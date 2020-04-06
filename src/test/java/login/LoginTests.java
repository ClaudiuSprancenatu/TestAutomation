package login;

import base.baseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends baseTests{


    @Test
    public void testSuccessfulLogin() {
       // HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                .contains( "You logged into a secure area!"),
                "Alert text is incorrect");

        // uite problema > driver e null
    }
}
