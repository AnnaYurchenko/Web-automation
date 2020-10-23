package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final By loginPageTitle = By.tagName("h2");
    public static final By inputUsername = By.id("username");
    public static final By inputPassword = By.id("password");
    public static final By loginButton = By.id("login");
    public static final By errorMessage = By.id("flash");

}
