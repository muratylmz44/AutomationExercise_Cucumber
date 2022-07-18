package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountCreatedPage;

public class AccountCreatedStepDefinitions {
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();

    Faker faker=new Faker();




    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertTrue( accountCreatedPage.accountCreatedText.isDisplayed());
    }

    @When("Click Continue button")
    public void clickContinueButton()
    {
        accountCreatedPage.ContinueAccountCreatedButton.click();
    }

    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        Assert.assertTrue( accountCreatedPage.accountCreatedText.isDisplayed());
        accountCreatedPage.ContinueAccountCreatedButton.click();

    }
}




