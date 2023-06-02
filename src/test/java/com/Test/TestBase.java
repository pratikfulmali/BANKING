package com.Test;

import com.Utilitis.ReadConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase {
    ReadConfig rc = new ReadConfig();

    public String BaseUlr=rc.getUrl();

    public String Username=rc.getUserName();

    public String Password=rc.getPassword();

    public static WebDriver driver;

    public static  Logger logger;

    String BrowserName=rc.getBrowser();


    // New Customer

    public  String CustomerName="Sharukh";
    public String CustomerDOB="02-09-1965";
    public  String CustomerAddress="Mannat BandStand Bndra" ;
    public String CustomerCity="Mumbai" ;
    public String CustomerState="Maharashtra";
    public String CustomerPIN="400050";
    public String CustomerMob="9123456789";
    public String CustomerEMail="SharukhKhan7868@YRF.com";
    public String CustomerPassword="SalmanKhan";



  @BeforeClass
  public void BrowserLaunch(){
      logger = LogManager.getLogger(TestBase.class);
      if (BrowserName.equals("chrome")){
          System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUJ\\IdeaProjects\\OnlineBanking\\Drivers\\chromedriver.exe");
          driver = new ChromeDriver();
          logger.info("lOGIN PAGE SUCESFULLY");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
      }




  }
  @AfterClass
  public void TearDown(){
//      driver.quit();
  }
}
