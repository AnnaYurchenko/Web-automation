package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage extends BasePage{

    public UserPage(WebDriver driver) {
        super(driver);
    }

    public static final By notFoundText = By.xpath("/html/body/h1");

}
