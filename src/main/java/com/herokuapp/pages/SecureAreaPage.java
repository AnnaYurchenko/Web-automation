package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public static final By pageTitle = By.tagName("h2");
    public static final By successLogin = By.className("class=\"flash success\"");
    public static final By logoutButton = By.xpath("//*[@id=\"content\"]/div/a/i");

}
