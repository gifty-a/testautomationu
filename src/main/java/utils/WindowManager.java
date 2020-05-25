package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver webDriver;
    private WebDriver.Navigation navigation;
    public WindowManager(WebDriver webDriver){
        this.webDriver = webDriver;
        navigation = webDriver.navigate();
    }
    public void goBack(){
        navigation.back();
    }
    public void goForward(){
        navigation.forward();
    }
    public void refreshPage(){
        navigation.refresh();
    }
    public void goTo(String url){
        navigation.to(url);
    }
    public void switchToTab(String tabTitle){
        var windows = webDriver.getWindowHandles();
        System.out.println(windows.size());
        System.out.println("Window handles:");
        windows.forEach(System.out::println);
        for (String window:windows){
            System.out.println("switching to window: " + window);
            webDriver.switchTo().window(window);
            System.out.println("Current window title:"+webDriver.getTitle());
            if (tabTitle.equals(webDriver.getTitle())){
                break;
            }
        }
    }
}
