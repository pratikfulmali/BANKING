package com.Test;

import com.PageObject.LoginPage;
import com.PageObject.MyCustomerPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCustomerPageTestClass extends TestBase{
    MyCustomerPage mcp =new MyCustomerPage(driver);
    @Test(priority = 1)
    public void LoginTest() throws InterruptedException {
        driver.get(BaseUlr);
        driver.manage().window().maximize();

        LoginPage lpage = new LoginPage(driver);
        lpage.setUserName(Username);
        lpage.setPassWordName(Password);
        lpage.clickOnLoginButton();

    }
    @Test(priority = 2)
    public void creatNewCustomer(){
        MyCustomerPage mcp =new MyCustomerPage(driver);

        mcp.ClickNewCustomer();
        mcp.setCustomerName(CustomerName);
        mcp.SelectGender();
        mcp.SetDateOfBirth(CustomerDOB);
        mcp.SetCustomerAddress(CustomerAddress);
        mcp.SetCity(CustomerCity);
        mcp.SetState(CustomerState);
        mcp.SetPinNo(CustomerPIN);
        mcp.SetMoNo(CustomerMob);
        mcp.SetEmail(CustomerEMail);
        mcp.SetPassword(CustomerPassword);
        mcp.SubmitButton();

      //  logger.error("Customer Already Exists");

        String ActualTitle=driver.getTitle();
        Assert.assertEquals(ActualTitle,"Guru99 Bank Customer Registration Page");

        logger.info("New Customer is Created");

    }
    @Test(priority = 3)
    public void verifyCustomerCreation(){
        MyCustomerPage mcp =new MyCustomerPage(driver);
        Assert.assertEquals(mcp.GetResistorMessage(),"Customer Registered Successfully!!!");

    }
    }
