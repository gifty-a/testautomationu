package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LongAndDeepDomPage {
    private WebDriver webDriver;
    private By table = By.id("large-table");
    public LongAndDeepDomPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void scrollToTable(){
        WebElement tableElement = webDriver.findElement(table);
        String scrollScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)webDriver).executeScript(scrollScript,tableElement);
    }
}
