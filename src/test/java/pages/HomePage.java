package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement HomePage_SubscriptionVisibilText;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement HomePage_SubscriptionMailBox;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    public WebElement HomePage_SuccessfullySubscribed_VisibleText;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement HomePage_SubscriptionMailButton;

    @FindBy(xpath = "//a[normalize-space()='Cart']")
    public WebElement Homepage_CartButton;

    @FindBy(xpath = "(//a[normalize-space()='Home'])[1]")
    public WebElement Homepage_HomepageButton;

    @FindBy(xpath = "//div[@id='accordian']")
    public WebElement Homepage_CategoriesSideBar;

    @FindBy(xpath = "//div[@class='brands_products']")
    public WebElement HomePage_BrandsProducts_Sidebar;

    @FindBy(xpath = "//a[normalize-space()='Women']")
    public WebElement Homepage_Category_Women_Button;

    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    public WebElement HomePage_Women_Dress_Button;

    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    public WebElement Homepage_Women_DressProductsVisible_Text;

    @FindBy(xpath = "//a[normalize-space()='Men']")
    public WebElement HomePage_Category_Men_Button;

    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    public WebElement HomePage_Men_Tshirts_Button;

    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    public WebElement Homepage_Men_TshirtsProductsVisible_Text;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement HomePage_BrandProducts_Polo_Button;

    @FindBy(xpath = "//div[@class='features_items']")
    public WebElement HomePage_CategoryAndBrand_Products_VisibleItem;

    @FindBy(xpath = "//a[@href='/brand_products/Madame']")
    public WebElement HomePage_BrandProducts_MadameButton;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement HomePage_SingupLoginButton;

    @FindBy(xpath = "//div[@class='recommended_items']")
    public WebElement HomePage_RecommendedItemsVisibleItem;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[69]")
    public WebElement HomePage_RecommendedItem_AddToCartButton;

    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    public WebElement HomePage_ScrollUp_Button;

    @FindBy(xpath = "(//h2[contains(text(),'Full-Fledged practice website for Automation Engin')])[1]")
    public WebElement HomePage_HomePageUpCenterVisible_Text;








}
