package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver webDriver;
    private By textField = By.id("content");
    public EmailSentPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public String getResponseText(){
        return webDriver.findElement(textField).getText();
    }
}
