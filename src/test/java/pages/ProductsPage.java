package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {


    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }



@FindBy(xpath = "//a[@href='/products']")
    public WebElement Products_Button;

@FindBy(xpath = "//div[@class='features_items']")
    public WebElement Products_list;

@FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    public WebElement Products_FirstProductButton;

@FindBy(xpath = "(//div[@class='col-sm-9 padding-right'])[1]")
    public WebElement Product_DetailContainer;

@FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    public WebElement Product_FirtProductName;

    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    public WebElement Product_FirtProductCategoryName;

    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    public WebElement ProductFirtProductPrice;

    @FindBy(xpath = "(//p[b][1])")
    public WebElement Product_FirtProductAvailability;

    @FindBy(xpath = "(//p[b][2])")
    public WebElement Product_FirtProductCondition;

    @FindBy(xpath = "(//p[b][3])")
    public WebElement Product_FirtProductBrand;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement Product_SearchBox;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement Product_SearchBoxButton;

    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    public WebElement Product_SearchedProductlist;

    @FindBy(xpath = "(//a[@data-product-id=1])[1]")
    public WebElement Product_FirstProduct_AddtoCartButton;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    public WebElement Product_SecondProduct_AddtoCartButton;

    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    public WebElement Product_ContinueShopingButton;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    public WebElement Product_ViewCartButton;

    @FindBy(xpath = "(//a[contains(text(),'View Product')])[3]")
    public WebElement Product_ThirdProductViewProductButton;

    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement Product_Information;

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement Product_QuatityBox;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    public WebElement Product_ProductInformation_AddtoCartButton;

    @FindBy(xpath = "(//div[@class='productinfo text-center'])[1]")
    public WebElement Product_ProductsSearched_Item1;

    @FindBy(xpath = "(//div[@class='productinfo text-center'])[2]")
    public WebElement Product_ProductsSearched_Item2;

    @FindBy(xpath = "(//div[@class='productinfo text-center'])[3]")
    public WebElement Product_ProductsSearched_Item3;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    public WebElement Product_ProductsSearched_Item1_AddToCartButton;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    public WebElement Product_ProductsSearched_Item2_AddToCartButton;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[5]")
    public WebElement Product_ProductsSearched_Item3_AddToCartButton;

    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    public WebElement Product_WriteyourReviewVisible_Text;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement Product_WriteyourReviewNameBox;

    @FindBy(xpath = "//textarea[@id='review']")
    public WebElement Product_WriteyourReviewReviewMessageBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement Product_WriteyourReviewMailBox;

    @FindBy(xpath = "//button[@id='button-review']")
    public WebElement Product_Review_SubmitButton;

    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    public WebElement Product_Review_SuccesfullyText;











}
