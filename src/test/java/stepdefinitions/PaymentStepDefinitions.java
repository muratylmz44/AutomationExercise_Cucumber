package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.PaymentPage;

public class PaymentStepDefinitions {

    PaymentPage paymentPage=new PaymentPage();
    Faker faker=new Faker();



    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        paymentPage.Payment_NameOnCard_Box.sendKeys(faker.name().fullName());
        paymentPage.Payment_CardNumber_Box.sendKeys(faker.number().digit());
        paymentPage.Payment_CVC_Box.sendKeys(faker.number().digit());
        paymentPage.Payment_MM_Box.sendKeys(faker.number().digit());
        paymentPage.Payment_YYYY_Box.sendKeys(faker.number().digit());



    }

    @Then("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        paymentPage.Payment_PayAndConfirmOrder_Button.click();
    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {

        Assert.assertTrue(paymentPage.Payment_OrderPlacedSuccessText.isDisplayed());
    }
}
