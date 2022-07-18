package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountFillPage {


    public AccountFillPage(){


        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@id='id_gender1']")

    public WebElement GenderRadioButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement NameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordBox;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement DaysDropDown;

    @FindBy(xpath = "//select[@id='months']")

    public WebElement MonthsDropDown;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement YearsDropDown;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement NewsLetterClickBox;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement SpecialNewsClickBox;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement FirstNameBox;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement LastNameBox;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement CompanyNameBox;

    @FindBy (xpath = "//input[@id='address1']")
    public WebElement AddressBox;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement CountryDropDown;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement StateBox;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement CityBox;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement ZipcodeBox;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement MobilNumberBox;

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    public WebElement CreatAccountButton;









}
