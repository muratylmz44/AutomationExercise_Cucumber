package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.AccountCreatedPage;
import pages.AccountFillPage;
import pages.HomePage;
import pages.SignupLoginPages;
import utilities.ConfigReader;
import utilities.Driver;

public class SignupLoginStepDefinitions {

    SignupLoginPages signupLoginPages=new SignupLoginPages();
    AccountFillPage accountFillPage=new AccountFillPage();
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();
    HomePage homePage=new HomePage();
    Faker faker =new Faker();





    @When("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();
    }


    @Then("Navigate to url")
    public void navigateToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("HomePageURL"));

    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", actualTitle);

    }

    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        signupLoginPages.SignupLoginButton.click();
    }

    @And("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(signupLoginPages.NewUserSignupText.isDisplayed());
    }

    @When("Enter name and email address")
    public void enterNameAndEmailAddress() {
        signupLoginPages.SignupNameBox.sendKeys(faker.name().firstName());
        signupLoginPages.SignupMailBox.sendKeys(faker.internet().emailAddress());

    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        signupLoginPages.SignupButton.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(signupLoginPages.EnterAccountText.isDisplayed());
    }

    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(signupLoginPages.LoginAccountText.isDisplayed());


    }

    @Then("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        signupLoginPages.LoginMailBox.sendKeys(ConfigReader.getProperty("userNameMail"));
        signupLoginPages.LoginPasswordBox.sendKeys(ConfigReader.getProperty("userPassword"));
    }

    @Then("Click login button")
    public void clickLoginButton() {
        signupLoginPages.LoginButton.click();
    }

    @Then("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        signupLoginPages.LoginMailBox.sendKeys(ConfigReader.getProperty("WrongUser"));
        signupLoginPages.LoginPasswordBox.sendKeys(ConfigReader.getProperty("userPassword"));
        signupLoginPages.LoginButton.click();


    }


    @Then("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(signupLoginPages.LoginWrongUserText.isDisplayed());
    }

    @Then("Click Logout button")
    public void clickLogoutButton() {
        signupLoginPages.LogoutBottun.click();
        
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(signupLoginPages.LoginAccountText.isDisplayed());
    }

    @Then("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        signupLoginPages.SignupNameBox.sendKeys(ConfigReader.getProperty("userName"));
        signupLoginPages.SignupMailBox.sendKeys(ConfigReader.getProperty("userNameMail"));
        signupLoginPages.SignupButton.click();
        
    }


    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {

        Assert.assertTrue(signupLoginPages.ExistingMailText.isDisplayed());
    }

    @Then("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() throws InterruptedException {

        signupLoginPages.SignupNameBox.sendKeys(faker.name().name());
        signupLoginPages.SignupMailBox.sendKeys(faker.internet().emailAddress());
        signupLoginPages.SignupButton.click();

        accountFillPage.GenderRadioButton.click();
        accountFillPage.NameBox.sendKeys(faker.name().firstName());
        accountFillPage.PasswordBox.sendKeys(faker.internet().password());
        Select selectday = new Select(accountFillPage.DaysDropDown);
        selectday.selectByIndex(faker.number().numberBetween(1, 28));
        Select selectmount = new Select(accountFillPage.MonthsDropDown);
        selectmount.selectByIndex(faker.number().numberBetween(1, 12));
        Select selectyear = new Select(accountFillPage.YearsDropDown);
        selectyear.selectByIndex(faker.random().nextInt(18, 65));
        accountFillPage.NewsLetterClickBox.click();
        accountFillPage.SpecialNewsClickBox.click();
        accountFillPage.FirstNameBox.sendKeys(faker.name().firstName());
        accountFillPage.LastNameBox.sendKeys(faker.name().lastName());
        accountFillPage.CompanyNameBox.sendKeys(faker.company().name());
        accountFillPage.AddressBox.sendKeys(faker.address().streetAddress());
        Select selectcountry = new Select(accountFillPage.CountryDropDown);
        selectcountry.selectByIndex(1);
        accountFillPage.StateBox.sendKeys(faker.address().state());
        accountFillPage.CityBox.sendKeys(faker.address().city());
        accountFillPage.ZipcodeBox.sendKeys(faker.address().zipCode());
        accountFillPage.MobilNumberBox.sendKeys(faker.phoneNumber().cellPhone());
        accountFillPage.CreatAccountButton.click();
        Thread.sleep(3000);


    }



    @Then("Fill email, password and click Login button")
    public void fillEmailPasswordAndClickLoginButton() {

        signupLoginPages.LoginMailBox.sendKeys(ConfigReader.getProperty("userNameMail2"));
        signupLoginPages.LoginPasswordBox.sendKeys(ConfigReader.getProperty("userPassword"));
        signupLoginPages.LoginButton.click();
    }

    @Then("Click Signup  Login button and submit login details")
    public void clickSignupLoginButtonAndSubmitLoginDetails() {
        homePage.HomePage_SingupLoginButton.click();
        signupLoginPages.LoginMailBox.sendKeys(ConfigReader.getProperty("userNameMail"));
        signupLoginPages.LoginPasswordBox.sendKeys(ConfigReader.getProperty("userPassword"));
        signupLoginPages.LoginButton.click();


    }
}

