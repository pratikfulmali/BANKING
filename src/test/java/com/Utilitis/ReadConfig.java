package com.Utilitis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    Properties prop;
    public ReadConfig(){
        File src=new File("C:\\Users\\ANUJ\\IdeaProjects\\OnlineBanking\\Configurations\\Config.properties");
        try {
            FileInputStream fis =new FileInputStream(src);
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
public String getUrl(){
        return prop.getProperty("BaseUlr");
}
    public String getUserName(){
        return prop.getProperty("Username");
    }
    public String getPassword(){
        return prop.getProperty("Password");
    }
    public String getBrowser(){
        return prop.getProperty("Browser");
    }
}
