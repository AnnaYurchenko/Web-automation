package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public static final By successLogin = By.id("flash");
    public static final By logoutButton = By.linkText("logout");

}
