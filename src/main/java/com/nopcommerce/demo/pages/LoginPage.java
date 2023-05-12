package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public void enterEmailInToEmailField(String emailValue) {
        sendTextToElement(email, emailValue);
    }

    public void enterPasswordInToPasswordField(String passwordValue) {
        sendTextToElement(password, passwordValue);
    }

    public void clickOnTheLoginButton() {
        clickOnElement(loginButton);
    }

    public void isWelcomeTextDisplayed() {
        verifyThatElementIsDisplayed(welcomeText);
    }

    public void isErrorMessageDisplayed() {
        verifyThatElementIsDisplayed(errorMessage);
    }
}
