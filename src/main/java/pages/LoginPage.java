package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginBtn = By.cssSelector("#login button");
    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void setUsernameField(String username){
        webDriver.findElement(usernameField).sendKeys(username);
    }
    public void setPasswordField(String password){
        webDriver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginbtn(){
        webDriver.findElement(loginBtn).click();
        return new SecureAreaPage(webDriver);
    }
}
