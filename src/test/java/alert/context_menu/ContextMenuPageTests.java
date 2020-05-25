package alert.context_menu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuPageTests extends BaseTests {
    @Test
    public void testTriggerContextMenuPageAlert(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.triggerContextMenuPageAlert();
        String alertMessage = contextMenuPage.readAlertText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(alertMessage,"You selected a context menu","oops! text don't match");
    }
}
