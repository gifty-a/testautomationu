package forgot_password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordPageTest extends BaseTests {
    @Test
    public void TestForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmailAddress("akonnorgifty@gmail.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordBtn();
        assertTrue(emailSentPage.getResponseText().contains("Your e-mail's been sent!"),"the text is incorrect");
    }
}
