package stepdefinitions;

import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ProductsStepDefinitions {
    ProductsPage productsPage=new ProductsPage();
    Actions actions=new Actions(Driver.getDriver());
    HomePage homePage=new HomePage();
    CartPage cartPage=new CartPage();



    @Then("Click on Products button")
    public void click_on_products_button() {
       productsPage.Products_Button.click();


    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("productsPageURL"));

    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() {
        Assert.assertTrue(productsPage.Products_list.isDisplayed());
    }

    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() throws InterruptedException {


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();

        Thread.sleep(2000);

        productsPage.Products_FirstProductButton.click();

    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        Assert.assertTrue(productsPage.Product_DetailContainer.isDisplayed());

    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {

        Assert.assertTrue(productsPage.Product_FirtProductAvailability.isDisplayed());
        Assert.assertTrue(productsPage.Product_FirtProductCondition.isDisplayed());
        Assert.assertTrue(productsPage.Product_FirtProductBrand.isDisplayed());
        Assert.assertTrue(productsPage.Product_FirtProductName.isDisplayed());
        Assert.assertTrue(productsPage.ProductFirtProductPrice.isDisplayed());
        Assert.assertTrue(productsPage.Product_FirtProductCategoryName.isDisplayed());


    }

    @Then("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() throws InterruptedException {
        productsPage.Product_SearchBox.sendKeys(ConfigReader.getProperty("productSearchName"));
        productsPage.Product_SearchBoxButton.click();

        Thread.sleep(3000);
        
    }


    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(productsPage.Products_list.isDisplayed());
        
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {

        Assert.assertTrue(productsPage.Product_ProductsSearched_Item1.isDisplayed());
        Assert.assertTrue(productsPage.Product_ProductsSearched_Item2.isDisplayed());
        Assert.assertTrue(productsPage.Product_ProductsSearched_Item3.isDisplayed());

    }

    @Then("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();

        actions.moveToElement(productsPage.Products_FirstProductButton).perform();
        Thread.sleep(2000);

        productsPage.Product_FirstProduct_AddtoCartButton.click();
        
    }

    @Then("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        productsPage.Product_ContinueShopingButton.click();
        
    }

    @Then("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        productsPage.Product_SecondProduct_AddtoCartButton.click();
    }

    @Then("Click View Cart button")
    public void clickViewCartButton() {

        productsPage.Product_ViewCartButton.click();
    }

    @Then("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() throws InterruptedException {


        actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(3000);
            productsPage.Product_ThirdProductViewProductButton.click();









    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        Assert.assertTrue(productsPage.Product_Information.isDisplayed());

    }

    @Then("Increase quantity to {int}")
    public void increaseQuantityTo(int arg0) {
        productsPage.Product_QuatityBox.clear();
        productsPage.Product_QuatityBox.sendKeys("4");

    }

    @Then("Click Add to cart button")
    public void clickAddToCartButton() {
        productsPage.Product_ProductInformation_AddtoCartButton.click();
    }

    @Then("Add products to cart")
    public void addProductsToCart() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        productsPage.Product_ThirdProductViewProductButton.click();
        productsPage.Product_ProductInformation_AddtoCartButton.click();
        productsPage.Product_ViewCartButton.click();



    }

    @Then("Add those products to cart")
    public void addThoseProductsToCart() {
        productsPage.Product_ProductsSearched_Item1_AddToCartButton.click();
        productsPage.Product_ContinueShopingButton.click();

        productsPage.Product_ProductsSearched_Item2_AddToCartButton.click();
        productsPage.Product_ContinueShopingButton.click();

        productsPage.Product_ProductsSearched_Item3_AddToCartButton.click();
        productsPage.Product_ContinueShopingButton.click();

    }

    @Then("Click Cart button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() {

        homePage.Homepage_CartButton.click();
        Assert.assertTrue(cartPage.Cart_Cart_Item1_VisibleItem.isDisplayed());
        Assert.assertTrue(cartPage.Cart_Cart_Item2_VisibleItem.isDisplayed());
        Assert.assertTrue(cartPage.Cart_Cart_Item3_VisibleItem.isDisplayed());


    }

    @Then("Click on View Product button")
    public void clickOnViewProductButton() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();

        Thread.sleep(2000);

        productsPage.Products_FirstProductButton.click();

    }

    @Then("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {

        Assert.assertTrue(productsPage.Product_WriteyourReviewVisible_Text.isDisplayed());
    }

    @Then("Enter name, email and review")
    public void enterNameEmailAndReview() {

        productsPage.Product_WriteyourReviewNameBox.sendKeys(ConfigReader.getProperty("userName"));
        productsPage.Product_WriteyourReviewMailBox.sendKeys(ConfigReader.getProperty("userNameMail"));
        productsPage.Product_WriteyourReviewReviewMessageBox.sendKeys(ConfigReader.getProperty("message"));

    }

    @Then("Click Submit button.")
    public void clickSubmitButton() {

        productsPage.Product_Review_SubmitButton.click();
    }

    @Then("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {

        Assert.assertTrue(productsPage.Product_Review_SuccesfullyText.isDisplayed());
    }
}
