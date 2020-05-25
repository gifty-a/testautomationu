package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    private By fileUploadInput = By.id("file-upload");
    private By fileUploadButton = By.id("file-submit");
    private By resultText = By.id("uploaded-files");
    private WebDriver webDriver;
    public FileUploaderPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void uploadFile(String absolutePath){
        webDriver.findElement(fileUploadInput).sendKeys(absolutePath);
        clickFileUploadButton();
    }
    private void clickFileUploadButton(){
        webDriver.findElement(fileUploadButton).click();
    }
    public String getTextFieldText(){
        return webDriver.findElement(resultText).getText();
    }
}
