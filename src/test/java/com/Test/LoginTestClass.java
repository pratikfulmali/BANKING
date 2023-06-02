package com.Test;

import com.PageObject.LoginPage;
import com.PageObject.MyCustomerPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestClass extends TestBase{

    @Test
    public void LoginTest(){
        driver.get(BaseUlr);
        driver.manage().window().maximize();

        LoginPage lpage=new LoginPage(driver);
        lpage.setUserName(Username);
        lpage.setPassWordName(Password);
        lpage.clickOnLoginButton();

        String ActualTitle=driver.getTitle();
        Assert.assertEquals(ActualTitle,"Guru99 Bank Manager HomePage");


//        MyCustomerPage cPage = new MyCustomerPage(driver);
//        cPage.ClickNewCustomer();
    }


}
