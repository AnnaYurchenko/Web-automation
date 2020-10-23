package com.herokuapp.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class UserSteps implements En {

    public UserSteps() {

        When("I see error", () -> {
            $(By.tagName("h1")).shouldHave(text("Not Found"));
        });
    }

}
