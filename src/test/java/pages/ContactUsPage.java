package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {


public ContactUsPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}






@FindBy(xpath = "//a[normalize-space()='Contact us']")
    public WebElement ContactUs_Button;

@FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement ContactUs_GetinTouchVisibleText;

@FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement ContactUs_NameBox;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement ContactUs_MailBox;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement ContactUs_SubjectBox;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement ContactUs_MessageBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement ContactUs_UploadFileButton;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement ContactUs_SubmitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")

    public WebElement ContactUs_SubmittedSuccessfullyVisibleText;

    @FindBy(xpath = "//span[normalize-space()='Home']")
    public WebElement ContactUs_HomePageButton;





}
