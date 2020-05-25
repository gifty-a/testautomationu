package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private String xpathFormat=".//a[contains(text(),'%s')";
    private By link1 = By.xpath(String.format(xpathFormat,"Example 1"));
    private WebDriver webDriver;
    public DynamicLoadingPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public DynamicLoadingExample1Page clickExample1(){
        webDriver.findElement(link1).click();
        return new DynamicLoadingExample1Page(webDriver);
    }
}
