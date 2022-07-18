package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactUsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ContactUsStepDefinitions {

ContactUsPage contactUsPage =new ContactUsPage();
Faker faker=new Faker();



    @Then("Click on Contact Us button")
    public void click_on_contact_us_button() {
        contactUsPage.ContactUs_Button.click();

    }


    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        Assert.assertTrue(contactUsPage.ContactUs_GetinTouchVisibleText.isDisplayed());

    }

    @Then("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
      contactUsPage.ContactUs_NameBox.sendKeys(ConfigReader.getProperty("userName"));
      contactUsPage.ContactUs_MailBox.sendKeys(ConfigReader.getProperty("userNameMail"));
        contactUsPage.ContactUs_SubjectBox.sendKeys(ConfigReader.getProperty("subject"));
        contactUsPage.ContactUs_MessageBox.sendKeys(ConfigReader.getProperty("message"));



    }

    @Then("Upload file")
    public void uploadFile() throws InterruptedException {
    contactUsPage.ContactUs_UploadFileButton.sendKeys("C:\\Users\\pc1\\Desktop\\Testnederland.jpg");
        Assert.assertTrue("Testnederland.jpg",contactUsPage.ContactUs_UploadFileButton.isDisplayed());




    Thread.sleep(4000);

    }

    @Then("Click Submit button")
    public void clickSubmitButton() {
        contactUsPage.ContactUs_SubmitButton.click();


    }

    @Then("Click OK button")
    public void clickOKButton() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(contactUsPage.ContactUs_SubmittedSuccessfullyVisibleText.isDisplayed());

    }

    @Then("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactUsPage.ContactUs_HomePageButton.click();
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", actualTitle);

    }
}
