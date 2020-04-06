package forgotpassword;

import base.baseTests;
import org.testng.annotations.Test;
import pages.EmailsendPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends baseTests {

    @Test
    public void sentEmail(){
        ForgotPasswordPage forgotpass = homePage.clickForgotPass();
        forgotpass.setEmail("tau@gmail.com");

        EmailsendPage emailsendPage = forgotpass.clickretrieve();
        assertTrue(emailsendPage.getMessage()
                .contains("Your e-mail's been sent!"), "Alert text is incorrect");
    }
}
