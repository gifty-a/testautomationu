package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver webDriver;
    private By nestedFrames = By.linkText("Nested Frames");
    public FramesPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public NestedFramesPage clickNestedFramesLink(){
        webDriver.findElement(nestedFrames).click();
        return new NestedFramesPage(webDriver);
    }

}
