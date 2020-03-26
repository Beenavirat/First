package WebTest1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    BrowserSelector browserSelector=new BrowserSelector();


    @BeforeTest
    public void openBrowser() {
        browserSelector.setUpBrowser();
    }
    @AfterTest
    public void closeBrowser(){
        browserSelector.closeBrowser();
    }

}
