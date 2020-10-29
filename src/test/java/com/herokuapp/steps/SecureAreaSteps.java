package com.herokuapp.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.SecureAreaPage.*;

public class SecureAreaSteps implements En {

    public SecureAreaSteps() {

        When("I press the enabled Logout button", () -> {
            $(logoutButton).hover();
            $(logoutButton).is(enabled);
            $(logoutButton).click();
        });

        Then("I see success login message", () -> {
          //  $(successLogin).shouldHave(text("You logged into a secure area!"));
            $(By.id("flash")).shouldHave(text("You logged into a secure area!"));

        });

        Then("I see Secure page", () -> {
            $(By.cssSelector("h2")).shouldHave(text("Secure Area"));
        });

    }

}
