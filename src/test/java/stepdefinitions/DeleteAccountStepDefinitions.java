package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeleteAccountPage;

public class DeleteAccountStepDefinitions {

    DeleteAccountPage deleteAccountPage=new DeleteAccountPage();
    Faker faker=new Faker();



    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(deleteAccountPage.DeleteAccountButton.isDisplayed());
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
        deleteAccountPage.DeleteAccountButton.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue buttons")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButtons() {
        Assert.assertTrue(deleteAccountPage.DeleteAccountText.isDisplayed());
    }


    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        Assert.assertTrue(deleteAccountPage.DeleteAccountText.isDisplayed());
    }

    @Then("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        Assert.assertTrue(deleteAccountPage.DeleteAccountButton.isDisplayed());
    }

    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        Assert.assertTrue(deleteAccountPage.DeleteAccountText.isDisplayed());
    }
}

