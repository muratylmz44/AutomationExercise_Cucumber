package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestCasesPage {

    public TestCasesPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//a[normalize-space()='Test Cases']")
    public WebElement TestCases_Button;

    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    public WebElement TestCases_TestCasesVisibleText;


}
