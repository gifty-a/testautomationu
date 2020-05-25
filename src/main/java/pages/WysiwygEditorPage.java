package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver webDriver;
    private String editorID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentationButton = By.cssSelector("#mceu_12 button");
    public WysiwygEditorPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void clearEditorContent(){
        switchToEditor();
        webDriver.findElement(textArea).clear();
        switchToMainDom();
    }
    public void inputTextInTextArea(String input){
        switchToEditor();
        webDriver.findElement(textArea).sendKeys(input);
        switchToMainDom();
    }
    private void switchToEditor(){
        webDriver.switchTo().frame(editorID);
    }
    public void decreaseIndentation(){
        webDriver.findElement(decreaseIndentationButton).click();
    }
    public String getTextFromEditor(){
        switchToEditor();
        String text = webDriver.findElement(textArea).getText();
        switchToMainDom();
        return text;
    }
    private void switchToMainDom(){
        webDriver.switchTo().parentFrame();
    }

}
