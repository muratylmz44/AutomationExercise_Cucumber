package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupLoginPages {

public SignupLoginPages(){

    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
  public   WebElement SignupLoginButton;

@FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement SignupNameBox ;

@FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement SignupMailBox;

@FindBy(xpath = "//button[text()='Signup']")
    public WebElement SignupButton;

@FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement NewUserSignupText;

    @FindBy(xpath = "//b[contains (text(),'Enter Account Information')]")
    public WebElement EnterAccountText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement LoginMailBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement LoginPasswordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement LoginButton;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement LoginAccountText;

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    public WebElement LoginWrongUserText;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement LogoutBottun;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement ExistingMailText;



}
