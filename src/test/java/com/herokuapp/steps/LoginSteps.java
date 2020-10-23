package com.herokuapp.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.LoginPage.*;

public class LoginSteps implements En {
    public LoginSteps() {

        When("I enter user credentials:", (DataTable table) -> {
            List<Map<String, String>> dataTable = table.asMaps();
            String username = dataTable.get(0).get("Username");
            String password = dataTable.get(0).get("Password");

            $(inputUsername).setValue(username);
            $(inputPassword).setValue(password);
        });

        Then("I press the Login button", () -> {
            $(loginButton).click();
        });

        Then("I see Login page title", () -> {
            // $(By.tagName("h2")).shouldHave(text("Login Page"));
            $(loginPageTitle).shouldHave(text("Login Page"));
        });

        Then("I see error message", () -> {
            //  $(errorMessage).shouldHave(text("Your username is invalid!"));
            $(By.id("flash")).shouldHave(text("Your username is invalid!"));


        });

        Then("Login button exists", () -> {
            $(loginButton).exists();
            $(loginButton).is(enabled);
        });
    }

}
