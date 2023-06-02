package com.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;   // Chrome
  public LoginPage (WebDriver driver){ //Firefox
   //   this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "uid")
    WebElement usernamefield ;

    @FindBy(name="password")
    WebElement passwordfield;

    @FindBy(name = "btnLogin")
    WebElement loginbutton;

    public  void setUserName(String uName){
        usernamefield.sendKeys(uName);
    }

    public  void setPassWordName(String passWord){
        passwordfield.sendKeys(passWord);
    }

    public  void clickOnLoginButton(){
        loginbutton.click();
    }

}
