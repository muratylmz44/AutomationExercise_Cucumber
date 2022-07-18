package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage {


    public PaymentPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement Payment_NameOnCard_Box;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement Payment_CardNumber_Box;

    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    public WebElement Payment_CVC_Box;

    @FindBy(xpath = "//input[@placeholder='MM']")
    public WebElement Payment_MM_Box;

    @FindBy(xpath = "//input[@placeholder='YYYY']")
    public WebElement Payment_YYYY_Box;

    @FindBy(xpath = "(//button[normalize-space()='Pay and Confirm Order'])[1]")
    public WebElement Payment_PayAndConfirmOrder_Button;

    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    public WebElement Payment_OrderPlacedSuccessText;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public WebElement Payment_Continue_Button;






}
