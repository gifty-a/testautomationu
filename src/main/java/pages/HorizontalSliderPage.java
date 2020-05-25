package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver webDriver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By textView = By.id("range");
    public HorizontalSliderPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void slideSlider(String value){
        do{
            webDriver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }while (!getSliderValue().equals(value));
    }

    public String getSliderValue(){
        return webDriver.findElement(textView).getText();
    }
}
