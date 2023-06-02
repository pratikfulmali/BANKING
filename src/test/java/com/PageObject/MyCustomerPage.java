package com.PageObject;

import com.Test.LoginTestClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCustomerPage{
    WebDriver driver;
    public MyCustomerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (linkText = "New Customer")
    WebElement NewCustomer ;

    @FindBy(name = "name")
    WebElement CustomerNameField ;

    @FindBy(xpath = "//input[@value='m']")
    WebElement SelectGender ;
    @FindBy(name = "dob")
    WebElement DateOfBirth ;
                                                            //Select DOB
    @FindBy(name = "addr")
    WebElement AddressField ;

    @FindBy(name = "city")
    WebElement CityField ;

    @FindBy(name = "state")
    WebElement StateField ;

    @FindBy(name = "pinno")
    WebElement PinNoField ;

    @FindBy(name = "telephoneno")
    WebElement MoNoField ;

    @FindBy(name = "emailid")
    WebElement EmailField ;

    @FindBy(name = "password")
    WebElement PasswordField ;

    @FindBy(name = "sub")
    WebElement SubmitButton ;

    @FindBy(xpath = "//p[contains(text(),'Customer Registered Successfully!!!')]")
    WebElement RegisterMessage ;

    public void ClickNewCustomer(){
        NewCustomer.click();
    }

    public  void setCustomerName(String cName){
        CustomerNameField.sendKeys(cName);
    }


    public void SelectGender(){
        SelectGender.click();
    }
    public void SetDateOfBirth(String cDOB){DateOfBirth.sendKeys(cDOB);}             //DOB

    public void SetCustomerAddress(String cAddr){
        AddressField.sendKeys(cAddr);
    }

    public void SetCity(String cCity){
        CityField.sendKeys(cCity);
    }
     public void SetState(String cState){
        StateField.sendKeys(cState);
     }

    public void SetPinNo(String cPin){
        PinNoField.sendKeys(cPin);
    }

    public void SetMoNo(String cMob){
        MoNoField.sendKeys(cMob);
    }

    public String RandomString(){

       return RandomStringUtils.randomAlphabetic(8);
    }
    public void SetEmail(String cEmail){
        EmailField.sendKeys(RandomString()+"@gmail.com");
    }


    public void SetPassword(String cPass){
        PasswordField.sendKeys(cPass);
    }

    public void SubmitButton(){
        SubmitButton.click();
    }

    public String GetResistorMessage(){
        return RegisterMessage.getText();
    }
}
