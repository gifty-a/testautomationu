package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver webDriver;
    private By emailInputField = By.id("email");
    private By retrievePasswordBtn = By.cssSelector("#form_submit");
    public ForgotPasswordPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void setEmailAddress(String email){
       // emailInputField.findElement(this.webDriver).sendKeys(email);
        webDriver.findElement(emailInputField).sendKeys(email);
    }
    public EmailSentPage clickRetrievePasswordBtn(){
        webDriver.findElement(retrievePasswordBtn).click();
        return new EmailSentPage(webDriver);
    }
}
