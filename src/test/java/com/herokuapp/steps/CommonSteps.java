package com.herokuapp.steps;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.herokuapp.pages.BasePage.basicURL;

/**
 * CommonSteps
 * Class implements the common step definitions for several feature files.
 */
public class CommonSteps implements En {

    public CommonSteps() {

        Given("I am on the {} page", (String page) -> {
            String partialUrl = null;
            if (page.equals("Hovers"))
                partialUrl = "/hovers";
            if (page.equals("Login"))
                partialUrl = "/login";
            if (page.equals("Users"))
                partialUrl = "/users";
            if (page.equals("Secure"))
                partialUrl = "/secure";
            open(basicURL + partialUrl);
        });
    }
}
