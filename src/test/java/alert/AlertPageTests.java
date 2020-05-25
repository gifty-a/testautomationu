package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertPageTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlert();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        alertPage.getResultText();
        assertEquals(alertPage.getResultText(),"You successfuly clicked an alert","result text is incorrect");
    }
    @Test
    public void testReadTextFromAlert(){
        var alertPage = homePage.clickJavaScriptAlert();
        alertPage.triggerConfirmAlert();
        String alertText = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(alertText,"I am a JS Confirm", "result text is incorrect");
    }

    @Test
    public void testInputInAlert(){
        var alertPage = homePage.clickJavaScriptAlert();
        String input = new String("Lorem Ipsum");
        alertPage.triggerJsPrompt();
        alertPage.fill_promptTextbox(input);
        alertPage.alert_clickOK();
        assertEquals(alertPage.getResultText(),"You entered: "+input, "The value is incorrect");
    }
    //C:\Users\HP\Desktop\dummy
}
