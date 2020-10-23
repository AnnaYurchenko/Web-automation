package com.herokuapp.steps;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.SecureAreaPage.*;

public class SecureAreaSteps implements En {

    SecureAreaSteps() {

        When("I see success login message", () -> {
            $(successLogin).shouldHave(text("You logged into a secure area!"));
        });

        When("I press the enabled Logout button", () -> {
            $(logoutButton).hover();
            $(logoutButton).is(enabled);
            $(logoutButton).click();
        });
    }

}
