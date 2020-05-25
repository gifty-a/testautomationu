package alert.file_upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploaderPageTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var fileUploaderPage = homePage.clickFileUpload();
        fileUploaderPage.uploadFile("C:\\Users\\HP\\Desktop\\dummy");
        assertEquals(fileUploaderPage.getTextFieldText(),"C:\\"+"\\Users\\HP\\Desktop\\dummy","oops something happened");
    }
}
