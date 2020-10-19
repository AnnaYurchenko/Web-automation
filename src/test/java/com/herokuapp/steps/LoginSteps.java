package com.herokuapp.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.LoginPage.*;
import static com.herokuapp.pages.SecureAreaPage.pageTitle;

public class LoginSteps implements En {
    public LoginSteps() {

        When("I enter user credentials:", (DataTable table) -> {
            List<Map<String, String>> dataTable = table.asMaps();
            String username = dataTable.get(0).get("Username");
            String password = dataTable.get(0).get("Password");

            $(inputUsername).setValue(username);
            $(inputPassword).setValue(password);
        });

        Then("I click on the Login button", () -> {
            $(loginButton).click();
        });

        Then("I am on the login page", () -> {
            $(By.tagName("h2")).shouldHave(text("Login Page"));
        });

//        Then("I should see the Secure Area Title", () -> {
//            $(pageTitle).shouldHave(text("Secure Area"));
//        });
    }

}
