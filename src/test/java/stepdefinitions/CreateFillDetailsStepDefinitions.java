package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.AccountFillPage;
import utilities.ConfigReader;

public class CreateFillDetailsStepDefinitions {

    AccountFillPage accountFillPage = new AccountFillPage();
    Faker faker = new Faker();




    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth(){


        accountFillPage.GenderRadioButton.click();
        accountFillPage.NameBox.sendKeys(faker.name().firstName());
        accountFillPage.PasswordBox.sendKeys(faker.internet().password());
        Select selectday = new Select(accountFillPage.DaysDropDown);
        selectday.selectByIndex(faker.number().numberBetween(1, 28));
        Select selectmount = new Select(accountFillPage.MonthsDropDown);
        selectmount.selectByIndex(faker.number().numberBetween(1, 12));
        Select selectyear = new Select(accountFillPage.YearsDropDown);
        selectyear.selectByIndex(faker.random().nextInt(18, 65));


    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter()
    {
        accountFillPage.NewsLetterClickBox.click();
    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners()
    {
        accountFillPage.SpecialNewsClickBox.click();
    }


    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

        accountFillPage.FirstNameBox.sendKeys(faker.name().firstName());
        accountFillPage.LastNameBox.sendKeys(faker.name().lastName());
        accountFillPage.CompanyNameBox.sendKeys(faker.company().name());
        accountFillPage.AddressBox.sendKeys(ConfigReader.getProperty("adress"));
        Select selectcountry = new Select(accountFillPage.CountryDropDown);
        selectcountry.selectByIndex(1);
        accountFillPage.StateBox.sendKeys(faker.address().state());
        accountFillPage.CityBox.sendKeys(faker.address().city());
        accountFillPage.ZipcodeBox.sendKeys(faker.address().zipCode());
        accountFillPage.MobilNumberBox.sendKeys(faker.phoneNumber().cellPhone());



    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton()
    {
        accountFillPage.CreatAccountButton.click();
    }


}