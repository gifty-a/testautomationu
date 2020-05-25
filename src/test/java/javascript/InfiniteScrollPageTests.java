package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class InfiniteScrollPageTests extends BaseTests {
    @Test
    public void testInfiteScrollPageScroll(){
        homePage.clickInfiniteScroll().scrollToParagraph(3);
    }
}
