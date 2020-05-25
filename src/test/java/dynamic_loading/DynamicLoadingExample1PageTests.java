package dynamic_loading;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingExample1PageTests extends BaseTests {
    @Test
    public void testWait(){
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        var dynamicLoadingExample1Page = dynamicLoadingPage.clickExample1();
        dynamicLoadingExample1Page.clickStartButton();
        assertEquals(dynamicLoadingExample1Page.getResultText(),"Hello World","Loaded text");
    }
}


//implicit wait
//explicit wait
//fluent wait