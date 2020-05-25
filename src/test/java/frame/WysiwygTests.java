package frame;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WysiwygTests extends BaseTests {
    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearEditorContent();
        String text1 = "Hola!";
        String text2 = "World";
        editorPage.inputTextInTextArea(text1);
        editorPage.decreaseIndentation();
        editorPage.inputTextInTextArea(text2);
         assertEquals(editorPage.getTextFromEditor(),text1+text2,"oops wrong message");
    }
}
