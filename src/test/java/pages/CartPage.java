package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {

    public CartPage (){

        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy(xpath = "//tr[@id='product-1']")
    public WebElement Cart_FirstProduct_AddedToCartVisible;

    @FindBy(xpath = "//tr[@id='product-2']")
    public WebElement Cart_SecondProduct_AddedToCartVisible;

    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    public WebElement Cart_FirstProduct_Price;

    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    public WebElement Cart_SecondProduct_Price;

    @FindBy(xpath = "(//button[@class='disabled'][normalize-space()='1'])[1]")
    public WebElement Cart_FirstProduct_Quantity;

    @FindBy(xpath = "(//button[@class='disabled'][normalize-space()='1'])[2]")
    public WebElement Cart_SecondProduct_Quantity;

    @FindBy(xpath = "(//p[@class='cart_total_price'][normalize-space()='Rs. 500'])[1]")
    public WebElement Cart_FirstProduct_TotalPrice;

    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")
    public WebElement Cart_SecondProduct_TotalPrice;

    @FindBy(xpath = "(//i[@class='fa fa-times'])[1]")
    public WebElement Cart_ProductDeleteButton;

    @FindBy(xpath = "//li[@class='active']")
    public WebElement Cart_ShopingCardText;

    @FindBy(xpath = "(//button[normalize-space()='4'])[1]")
    public WebElement Cart_ThirdProduct_Quantity;

    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    public WebElement Cart_ProccedToCheckoutButton;

    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    public WebElement Cart_RegisterLoginButton;

    @FindBy(xpath = "(//li[@class='address_address1 address_address2'])[2]")
    public WebElement Cart_DeliveryAdressText;

    @FindBy(xpath = "(//li[@class='address_address1 address_address2'])[5]")
    public WebElement Cart_BillingAdressText;

    @FindBy(xpath = "//div[@id='cart_info']")
    public WebElement Cart_ReviewYourOrderInfoText;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement Cart_CommentBox;

    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    public WebElement Cart_PlaceOrderButton;

    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    public WebElement Cart_CartIsEmptyText;

    @FindBy(xpath = "//tr[@id='product-20']")
    public WebElement Cart_Cart_Item1_VisibleItem;

    @FindBy(xpath = "//tr[@id='product-38']")
    public WebElement Cart_Cart_Item2_VisibleItem;

    @FindBy(xpath = "//tr[@id='product-40']")
    public WebElement Cart_Cart_Item3_VisibleItem;

    @FindBy(xpath = "(//tr[@id='product-1'])[1]")
    public WebElement Cart_Recommended_Visible_Item;

    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    public WebElement Cart_DownloadInvoice_Button;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public WebElement Cart_ContinueOrderPlaced_Button;












}
