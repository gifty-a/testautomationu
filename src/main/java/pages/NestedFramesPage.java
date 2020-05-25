package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver webDriver;
    private String topFrameName = "frame-top";
    private String leftFrameName ="frame-left";
    private String bottomFrameName ="frame-bottom";
    //private By frame = By.name("frame-left");
    public NestedFramesPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public String getBottomFrameName() {
        return bottomFrameName;
    }
    public String getTopFrameName() {
        return topFrameName;
    }

    public String getLeftFrameName() {
        return leftFrameName;
    }
    private void switchToFrame(String name){
        webDriver.switchTo().frame(name);
    }
    private void returnToMainDOM(){
        webDriver.switchTo().parentFrame();
    }
    public String getFrameText(String parentFrame, String targetFrame){
        switchToFrame(parentFrame);
        switchToFrame(targetFrame);
        String frameText = webDriver.findElement(By.tagName("body")).getText();
        returnToMainDOM();
        returnToMainDOM();
        return frameText;
    }
    public String getFrameText(String targetFrame){
        switchToFrame(targetFrame);
        String frameText = webDriver.findElement(By.tagName("body")).getText();
        returnToMainDOM();
        returnToMainDOM();
        return frameText;
    }
    /*public String getLeftFrameText(){
        switchToFrame(leftFrameName);
        String frameText = webDriver.findElement(By.tagName("body")).getText();
        returnToMainDOM();
        return frameText;
    }
    public String getLeftFrameText(){
        switchToFrame(leftFrameName);
        String frameText = webDriver.findElement(By.tagName("body")).getText();
        returnToMainDOM();
        return frameText;
    }*/
}
