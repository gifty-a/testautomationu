package frame.frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesPageTests extends BaseTests {
    @Test
    public void testFrameLogic(){
        var framepage = homePage.clickFrames();
        var nestedHomePage = framepage.clickNestedFramesLink();
        String leftFrameText;
        leftFrameText = nestedHomePage.getFrameText(nestedHomePage.getTopFrameName(), nestedHomePage.getLeftFrameName());
        String rightFrameText;
        rightFrameText = nestedHomePage.getFrameText(nestedHomePage.getBottomFrameName());
        assertEquals(leftFrameText,"LEFT","oops! wrong text");
        assertEquals(rightFrameText,"BOTTOM", "oops! wrong text");

    }
}
