package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccesfulLogin(){
       LoginPage loginPage = homePage.clikFormAuthentication();
       loginPage.setUsernameField("tomsmith");
       loginPage.setPasswordField("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginbtn();
       assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"the text is incorrect");
    }
}
