package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSlider(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        String sliderValue ="4";
        horizontalSliderPage.slideSlider("4");
        assertEquals(horizontalSliderPage.getSliderValue(),sliderValue);
    }
}
