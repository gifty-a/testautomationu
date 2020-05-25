package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ContextMenuPage {
    private WebDriver webDriver;
    private By box = By.id("hot-spot");
    //private WebElement rectBoxDashedBorders = webDriver.findElement(By.id("hot-spot"));
    //private Actions action = new Actions(webDriver);
    public ContextMenuPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void triggerContextMenuPageAlert(){
        Actions actions = new Actions(webDriver);
        actions.contextClick(webDriver.findElement(box)).perform();
    }

    public String readAlertText(){
        return webDriver.switchTo().alert().getText();
    }

    public void alert_clickToAccept(){
        webDriver.switchTo().alert().accept();
    }
}
