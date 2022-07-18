package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefinitions {

    HomePage homePage=new HomePage();
    ProductsPage productsPage=new ProductsPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions=new Actions(Driver.getDriver());


    @Then("Scroll down to footer")
    public void scroll_down_to_footer() throws InterruptedException {



        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

            Thread.sleep(3000);






    }


    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        Assert.assertTrue(homePage.HomePage_SubscriptionVisibilText.isDisplayed());

    }

    @Then("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton()  {
        homePage.HomePage_SubscriptionMailBox.sendKeys(ConfigReader.getProperty("userNameMail"));
        homePage.HomePage_SubscriptionMailButton.click();


    }

    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertTrue(homePage.HomePage_SuccessfullySubscribed_VisibleText.isDisplayed());


    }

    @Then("Click Cart button")
    public void clickCartButton() {

        homePage.Homepage_CartButton.click();
    }

    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {

        Assert.assertTrue(homePage.Homepage_CategoriesSideBar.isDisplayed());
    }

    @Then("Click on Women category")
    public void clickOnWomenCategory() {

        homePage.Homepage_Category_Women_Button.click();
    }

    @Then("Click on any category link under Women category, for example Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        homePage.HomePage_Women_Dress_Button.click();


    }

    @Then("Verify that category page is displayed and confirm text WOMEN  TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {

        Assert.assertTrue(homePage.Homepage_Women_DressProductsVisible_Text.isDisplayed());
    }

    @Then("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {

        homePage.HomePage_Category_Men_Button.click();
        homePage.HomePage_Men_Tshirts_Button.click();
    }

    @Then("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertTrue(homePage.Homepage_Men_TshirtsProductsVisible_Text.isDisplayed());
    }

    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        Assert.assertTrue(homePage.HomePage_BrandsProducts_Sidebar.isDisplayed());
    }

    @Then("Click on any brand name")
    public void clickOnAnyBrandName() {
        homePage.HomePage_BrandProducts_Polo_Button.click();
    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {

        Assert.assertTrue(homePage.HomePage_CategoryAndBrand_Products_VisibleItem.isDisplayed());
    }

    @Then("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {

        homePage.HomePage_BrandProducts_MadameButton.click();
    }

    @Then("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertTrue(homePage.HomePage_CategoryAndBrand_Products_VisibleItem.isDisplayed());
    }

    @Then("Again, go to Cart page")
    public void againGoToCartPage() {
        homePage.Homepage_CartButton.click();
    }

    @Then("Scroll to bottom of page")
    public void scrollToBottomOfPage()  {


        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


    }

    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {

        Assert.assertTrue(homePage.HomePage_RecommendedItemsVisibleItem.isDisplayed());
    }

    @Then("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        homePage.HomePage_RecommendedItem_AddToCartButton.click();




    }

    @Then("Click on View Cart button")
    public void clickOnViewCartButton() {
        productsPage.Product_ViewCartButton.click();
    }

    @Then("Scroll down page to bottom")
    public void scrollDownPageToBottom()  {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");



    }

    @Then("Verify SUBSCRIPTION is visible")
    public void verifySUBSCRIPTIONIsVisible() {

        Assert.assertTrue(homePage.HomePage_SubscriptionVisibilText.isDisplayed());
    }

    @Then("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward()  {
        homePage.HomePage_ScrollUp_Button.click();


    }

    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {

        Assert.assertTrue(homePage.HomePage_HomePageUpCenterVisible_Text.isDisplayed());


    }

    @Then("Scroll up page to top")
    public void scrollUpPageToTop() throws InterruptedException {

        js.executeScript("window.scrollBy(0,-8050)");

        Thread.sleep(3000);
    }
}
