package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class LongAndDeepDomPageTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.clickLongAndDeepDomPage().scrollToTable();
    }
}
