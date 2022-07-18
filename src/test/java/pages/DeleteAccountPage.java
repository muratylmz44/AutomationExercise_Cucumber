package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteAccountPage {

    public DeleteAccountPage(){

        PageFactory.initElements(Driver.getDriver(),this);



    }

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement DeleteAccountButton;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement DeleteAccountText;



}
