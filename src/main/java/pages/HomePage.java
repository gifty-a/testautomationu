package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class HomePage {
    //private By formAuthenticationLink = By.linkText("Form Authentication");
    WebDriver webdriver;
    public HomePage(WebDriver webdriver){
        this.webdriver = webdriver;
    }
    public LoginPage clikFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(webdriver);
    }
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(webdriver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(webdriver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(webdriver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(webdriver);
    }
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(webdriver);
    }
    public AlertsPage clickJavaScriptAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(webdriver);
    }

    public FileUploaderPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploaderPage(webdriver);
    }
    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(webdriver);
    }
    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(webdriver);
    }
    public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(webdriver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(webdriver);
    }
    public LongAndDeepDomPage clickLongAndDeepDomPage(){
        clickLink("Large & Deep DOM");
        return new LongAndDeepDomPage(webdriver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(webdriver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(webdriver);
    }
    private void clickLink(String linkText){
        webdriver.findElement(By.linkText(linkText)).click();
    }

}
