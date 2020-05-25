package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver webDriver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By jsConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By jsPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");
    public AlertsPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void triggerAlert(){
        webDriver.findElement(triggerAlertButton).click();
    }
    public void triggerConfirmAlert(){
        webDriver.findElement(jsConfirmButton).click();
    }
    public void triggerJsPrompt(){
        webDriver.findElement(jsPromptButton).click();
    }
    public void alert_clickToAccept(){
        webDriver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        webDriver.switchTo().alert().dismiss();
    }
    public void fill_promptTextbox(String input){
        webDriver.switchTo().alert().sendKeys(input);
    }
    public void alert_clickOK(){
        webDriver.switchTo().alert().accept();
    }
    public String alert_getText(){
        return webDriver.switchTo().alert().getText();
    }
    public String getResultText(){
        return webDriver.findElement(resultText).getText();
    }
}
