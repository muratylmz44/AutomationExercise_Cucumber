package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountCreatedPage {


    public AccountCreatedPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement ContinueAccountCreatedButton;

}
