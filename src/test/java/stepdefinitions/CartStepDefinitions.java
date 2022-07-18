package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CartPage;
import pages.HomePage;
import utilities.ConfigReader;

import java.nio.file.Files;
import java.nio.file.Paths;

public class CartStepDefinitions {
    CartPage cartPage=new CartPage();
    HomePage homePage=new HomePage();





    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        Assert.assertTrue(cartPage.Cart_FirstProduct_AddedToCartVisible.isDisplayed());
        Assert.assertTrue(cartPage.Cart_SecondProduct_AddedToCartVisible.isDisplayed());

    }


    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue(cartPage.Cart_FirstProduct_Price.isDisplayed());
        Assert.assertTrue(cartPage.Cart_FirstProduct_Quantity.isDisplayed());
        Assert.assertTrue(cartPage.Cart_FirstProduct_TotalPrice.isDisplayed());
        Assert.assertTrue(cartPage.Cart_SecondProduct_Price.isDisplayed());
        Assert.assertTrue(cartPage.Cart_SecondProduct_Quantity.isDisplayed());
        Assert.assertTrue(cartPage.Cart_SecondProduct_TotalPrice.isDisplayed());
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {


        Assert.assertTrue(cartPage.Cart_ThirdProduct_Quantity.isDisplayed());
    }

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {

        Assert.assertTrue(cartPage.Cart_ShopingCardText.isDisplayed());
    }

    @Then("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        cartPage.Cart_ProccedToCheckoutButton.click();
    }

    @Then("Click Register Login button")
    public void clickRegisterLoginButton() {

        cartPage.Cart_RegisterLoginButton.click();
    }

    @Then("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
        cartPage.Cart_ProccedToCheckoutButton.click();
    }

    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {

        Assert.assertTrue(cartPage.Cart_DeliveryAdressText.isDisplayed());
        Assert.assertTrue(cartPage.Cart_BillingAdressText.isDisplayed());
        Assert.assertTrue(cartPage.Cart_ReviewYourOrderInfoText.isDisplayed());


    }

    @Then("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {

        cartPage.Cart_CommentBox.sendKeys(ConfigReader.getProperty("message"));
        cartPage.Cart_PlaceOrderButton.click();
    }

    @Then("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() throws InterruptedException {

        cartPage.Cart_ProductDeleteButton.click();

        Thread.sleep(2000);
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {

        Assert.assertTrue(cartPage.Cart_CartIsEmptyText.isDisplayed());
    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {

        Assert.assertTrue(cartPage.Cart_Cart_Item1_VisibleItem.isDisplayed());
        Assert.assertTrue(cartPage.Cart_Cart_Item2_VisibleItem.isDisplayed());
        Assert.assertTrue(cartPage.Cart_Cart_Item3_VisibleItem.isDisplayed());
    }

    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {

        Assert.assertTrue(cartPage.Cart_Recommended_Visible_Item.isDisplayed());
    }

    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {

        Assert.assertEquals(cartPage.Cart_DeliveryAdressText.getText(), ConfigReader.getProperty("adress"));


    }

    @Then("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertEquals(cartPage.Cart_BillingAdressText.getText(), ConfigReader.getProperty("adress"));
    }

    @Then("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() throws InterruptedException {
        cartPage.Cart_DownloadInvoice_Button.click();
        Thread.sleep(2000);

        Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\pc1\\Downloads\\invoice.txt")));
    }

    @Then("Click Continue button.")
    public void clickContinueButtonn() {

        cartPage.Cart_ContinueOrderPlaced_Button.click();
    }
}




