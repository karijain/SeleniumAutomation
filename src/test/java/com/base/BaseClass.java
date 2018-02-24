package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    protected WebDriver driver;

    @BeforeClass
    public void open()
    {
        System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void close()
    {
        driver.quit();
    }
}
