package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayOfBirth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirth;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequiredText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequiredText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedText;
    @CacheLookup
    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    WebElement continueButton;


    public void isRegisterTextDisplayed() {
        Reporter.log("Is Register Text Displayed :" +registerText.toString());
        verifyThatElementIsDisplayed(registerText);
        CustomListeners.test.log(Status.PASS,"Is Register Text Displayed"+ registerText);
    }

    public void clickOnRegisterButton() {
        Reporter.log("click On Register Button :" + registerButton.toString());
        clickOnElement(registerButton);
        CustomListeners .test.log(Status.PASS,"click On Register Button" +registerButton);
    }


    public void isFirstNameRequiredTextDisplayed() {
        Reporter.log("Is First Name  Text Displayed :" +firstNameRequiredText.toString());
        verifyThatElementIsDisplayed(firstNameRequiredText);
        CustomListeners.test.log(Status.PASS, "Is First Name  Text Displayed ");
    }


    public void isLastNameRequiredTextDisplayed() {
        Reporter.log("Is LastName Required Text Displayed:" +lastNameRequiredText.toString());
        verifyThatElementIsDisplayed(lastNameRequiredText);
        CustomListeners.test.log(Status.PASS,"Is LastName Required Text Displayed");
    }


    public void isEmailRequiredTextDisplayed() {
        Reporter.log("Is Email Required Text Displayed :" +emailRequiredText.toString());
        verifyThatElementIsDisplayed(emailRequiredText);
        CustomListeners.test.log(Status.PASS,"Is Email Required Text Displayed");
    }

    public void isPasswordRequiredTextDisplayed() {
        Reporter.log(" Is Password Required Text Displayed :" +passwordRequiredText.toString());
        verifyThatElementIsDisplayed(passwordRequiredText);
        CustomListeners.test.log(Status.PASS,"Is Password Required Text Displayed");
    }


    public void isConfirmedPasswordRequiredTextDisplayed() {
        Reporter.log("|Is Confirmed Password Required Text Displayed :" +confirmPasswordRequiredText.toString());
        verifyThatElementIsDisplayed(confirmPasswordRequiredText);
        CustomListeners.test.log(Status.PASS,"Is Confirmed Password Required Text Displayed");
    }

    public void selectFemaleRadioButton() {
        Reporter.log(" select Female Radio Button :" +femaleRadioButton.toString());
        clickOnElement(femaleRadioButton);
        CustomListeners.test.log(Status.PASS,"select Female Radio Button");
    }

    public void enterFirstNameInToFirstNameField(String fName) {
        Reporter.log("enter FirstName In To FirstNameField :" +firstName.toString());
        sendTextToElement(firstName, fName);
        CustomListeners.test.log(Status.PASS,"enter FirstName In To FirstNameField ");
    }

    public void enterLastNameInToLastNameField(String lName) {
        Reporter.log("enter lastName In To FirstNameField  :" +lastName.toString());
        sendTextToElement(lastName, lName);
        CustomListeners.test.log(Status.PASS,"enter LastName In To FirstNameField ");
    }

    public void enterEmailToEmailField(String emailValue) {
        Reporter.log("enter Email To EmailField :" +email.toString());
        sendTextToElement(email, emailValue);
        CustomListeners.test.log(Status.PASS,"enter Email To EmailField");
    }

    public void enterPasswordToPasswordField(String passwordValue) {
        Reporter.log("enter Password To  PasswordField :" +password.toString());
        sendTextToElement(password, passwordValue);
        CustomListeners.test.log(Status.PASS,"enter Password To  PasswordField");
    }


    public void enterPasswordToConfirmPasswordField(String confirmPasswordValue) {
        Reporter.log("enter Password To Confirm PasswordField:" +confirmPassword.toString());
        sendTextToElement(confirmPassword, confirmPasswordValue);
        CustomListeners.test.log(Status.PASS,"enter Password To Confirm PasswordField");

    }


    public void selectDayOfBirthFromDropDown(String day) {
        Reporter.log("select Day Of Birth From DropDown :" +dayOfBirth.toString());
        clickOnElement(dayOfBirth);
        selectByVisibleTextFromDropDown(dayOfBirth, day);
        CustomListeners.test.log(Status.PASS,"select Day Of Birth From DropDown");
    }


    public void selectMonthOfBirthFromDropDown(String month) {
        Reporter.log("select Month Of Birth From DropDown :" +monthOfBirth.toString());
        clickOnElement(monthOfBirth);
        selectByVisibleTextFromDropDown(monthOfBirth, month);
        CustomListeners.test.log(Status.PASS,"select Month Of Birth From DropDown");
    }


    public void selectYearOfBirthFromDropDown(String year) {
        Reporter.log("select Year Of Birth From DropDown :" +yearOfBirth.toString());
        clickOnElement(yearOfBirth);
        selectByVisibleTextFromDropDown(yearOfBirth, year);
        CustomListeners.test.log(Status.PASS,"select Year Of Birth From DropDown");
    }


    public void isYourRegistrationCompleteTextDisplayed() {
        Reporter.log("Is Your Registration Complete Text Displayed" +registrationCompletedText.toString());
        verifyThatElementIsDisplayed(registrationCompletedText);
        CustomListeners.test.log(Status.PASS,"Is Your Registration Complete Text Displayed");
    }


    public void clickOnContinueButton() {
        Reporter.log("click On Continue Button :" +continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"click On Continue Button");
    }
}
