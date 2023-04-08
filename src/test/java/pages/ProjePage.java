package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProjePage {

    public ProjePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='w-icon-account']")
    public WebElement ilkLoginLinki;


    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;


    @FindBy(xpath = "//input[@id='password']")
     public WebElement passwordBox;

    @FindBy(xpath ="//button[@name='login']" )
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement signOutLogin;



    @FindBy(xpath ="//a[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//span[@class='wcfmfa fa-user-circle']")
    public WebElement customersButtonu;

    @FindBy(xpath = "//table/thead/tr/th[6]")
    public WebElement getCustomersButtonu;

    @FindBy(xpath = "//span[text()='PDF']")
    public WebElement pdfButton;

    @FindBy(xpath = "//embed[type='application/x-google-chrome-pdf'])[2]")
    public WebElement PdfPage;



    @FindBy(xpath = "//span[text()='Excel']")
    public WebElement excelButton;

    @FindBy(xpath = "//span[text()='CSV']")
    public WebElement csvButton;

    @FindBy(xpath = "//span[text()='Add New']")
    public WebElement addNewButton;


    @FindBy(xpath = "//input[@id='user_name']")
    public WebElement userNameCustomer;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailCustomer;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

}
