package com.herokuapp.steps;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.SecureAreaPage.pageTitle;

public class SecureAreaSteps implements En {

    SecureAreaSteps() {
        Then("I should see the Secure Area Title", () -> {
            $(pageTitle).shouldHave(text("Secure Area"));
        });
    }

}
