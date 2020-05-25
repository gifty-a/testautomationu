package base;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.io.IO;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.EventReporter;
import utils.WindowManager;

import java.awt.desktop.OpenURIEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.google.common.io.Files;

public class BaseTests {
    //private WebDriver webdriver;
    private EventFiringWebDriver eventFiringWebDriver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
      System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
      eventFiringWebDriver = new EventFiringWebDriver(new ChromeDriver());
      eventFiringWebDriver.register(new EventReporter());
        goHome();
        setCookie();
       // homePage = new HomePage(webdriver);
        //homePage = new HomePage(eventFiringWebDriver);
    }

    @BeforeMethod
    public void goHome(){
        eventFiringWebDriver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(eventFiringWebDriver);
    }
    @AfterClass
    public WindowManager getWindowManager(){
        return new WindowManager(eventFiringWebDriver);
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.setHeadless(true);
        return chromeOptions;
    }
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("chocolate chip","abc").domain("the-internet.herokuapp.com").build();
        eventFiringWebDriver.manage().addCookie(cookie);
    }

    @AfterMethod
    public void screenShotFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
        var camera = (TakesScreenshot)eventFiringWebDriver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot, new File("resources/screenshots/"+result.getName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }}

    }
   /* public void endTest(){
        webdriver.quit();
    }*/
}
