package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    WebDriver driver;

    @FindBy(className ="login")
    WebElement sigInElement;

    public WelcomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToLogin()
    {
        sigInElement.click();
    }
}
