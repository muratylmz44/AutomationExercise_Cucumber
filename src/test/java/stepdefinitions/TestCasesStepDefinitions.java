package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TestCasesPage;

public class TestCasesStepDefinitions {

    TestCasesPage testCasesPage=new TestCasesPage();

    @Then("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        testCasesPage.TestCases_Button.click();



        
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(testCasesPage.TestCases_TestCasesVisibleText.isDisplayed());
    }
}
