package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver webDriver;
    private By startButton = By.cssSelector("#start button");
    private By loader = By.id("loading");
    private By resultText = By.cssSelector("#finish h4");
    public DynamicLoadingExample1Page(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void clickStartButton(){
        webDriver.findElement(startButton).click();
       // WebDriverWait wait = new WebDriverWait(webDriver,10);
       // wait.until(ExpectedConditions.invisibilityOf(webDriver.findElement(loader)));
        FluentWait wait = new FluentWait(webDriver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(webDriver.findElement(loader)));
    }
    public String getResultText(){
        return webDriver.findElement(resultText).getText();
    }
}
