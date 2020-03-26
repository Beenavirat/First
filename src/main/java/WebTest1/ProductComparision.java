package WebTest1;

import org.openqa.selenium.By;

public class ProductComparision extends Utils {
    // comparison expected and actul
    String expected = "compare products";
    private By _PageTitle = By.xpath("//div [@class='page-title']");
    public void VerifyUserIsOnComparisionPage(){
        assertTextMessage("page not found",expected,_PageTitle);
    }
}



