package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//automating in the browser using javascript = Allen Richardson
public class InfiniteScrollPage {
    private WebDriver webDriver;
    By textBlocks = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void scrollToParagraph(int index){
        String jsScript = "window.scrollTo(0, document.body.scrollHeight";
        var javascriptExecutor = (JavascriptExecutor)webDriver;
        while (getNumberOfParagraphsPresent()<index){
            javascriptExecutor.executeScript(jsScript);
        }
    }
    private int getNumberOfParagraphsPresent(){
        return  webDriver.findElements(textBlocks).size();
    }
}
