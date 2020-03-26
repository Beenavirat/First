package WebTest1;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelryPage jewelryPage = new JewelryPage();
    ProductComparision productComparison = new ProductComparision();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    Computers computers = new Computers();
    NewsPage newsPage = new NewsPage();


//User should able to register successfully
    @Test
    public void userShouldAbleToRegisterSuccessfully() {

        homePage.clickOnRegisterButton();
        registrationPage.verifyUserOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
//User should able to compare two different product successfully
    @Test
    public void userShouldAbleToCompareTwoDifferentProductSuccessfully() {
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
        jewelryPage.chooseProductsToCompare();
        productComparison.VerifyUserIsOnComparisionPage();
    }


    @Test
    public void nonRegisterUserShouldNotBeAbleToReferAProductToaFriend() {
        homePage.clickOnComputerCategory();
        productDetailPage.verifyUserOnComputerCatagoriesPage();
        productDetailPage.userClickOnNoteBook();
        productDetailPage.userClickOnAppleMac();
        productDetailPage.UserReferToFriend();
    }
    @Test
    public void userShouldBeAbleToSortProductHighToLowByPrice(){
        homePage.clickOnComputerCategory();
        computers.userClickOnNoteBook();
        computers.userSelectFromPositionPriceHighToLow();
    }
    @Test
    public void guestUserShouldBeAbleToAddNewComment() {
        homePage.clickOnViewNewsArchive();
        newsPage.userClickOnDetails();
        newsPage.verifysuccessmessageofcomment();

    }
    }