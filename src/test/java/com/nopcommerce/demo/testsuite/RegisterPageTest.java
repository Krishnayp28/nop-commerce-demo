package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {

    HomePage homePage; // Declaring HomePage Object
    RegisterPage registerPage; // Declaring RegisterPage Object

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink(); // Clicking on register link
        registerPage.isRegisterTextDisplayed(); // Verifying register text is displayed or not
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homePage.clickOnRegisterLink(); // Clicking on register link
        registerPage.clickOnRegisterButton(); // Clicking on register button
        registerPage.isFirstNameRequiredTextDisplayed(); // Verifying first name error text
        registerPage.isLastNameRequiredTextDisplayed(); // Verifying last name error text
        registerPage.isEmailRequiredTextDisplayed(); // Verifying email error text
        registerPage.isPasswordRequiredTextDisplayed(); // Verifying password error text
        registerPage.isConfirmedPasswordRequiredTextDisplayed(); // Verifying confirm password error text
    }

    @Test(groups = "regression")
    public void VerifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnRegisterLink(); // Clicking on register link
        registerPage.selectFemaleRadioButton(); // Selecting female radio button
        registerPage.enterFirstNameInToFirstNameField("Sweeney"); // Entering first name
        registerPage.enterLastNameInToLastNameField("Todd"); // Entering last name
        registerPage.selectDayOfBirthFromDropDown("25"); // Selecting day of birth
        registerPage.selectMonthOfBirthFromDropDown("November"); // Selecting month of birth
        registerPage.selectYearOfBirthFromDropDown("1981"); // Selecting year of birth
        registerPage.enterEmailToEmailField("sweeneytodd121@gmail.com"); // Entering email
        registerPage.enterPasswordToPasswordField("Sweeney121"); // Entering password
        registerPage.enterPasswordToConfirmPasswordField("Sweeney121"); // Entering confirmed password
        registerPage.clickOnRegisterButton(); // Clicking on register button
        registerPage.isYourRegistrationCompleteTextDisplayed(); // Verifying registration complete text
        registerPage.clickOnContinueButton(); // Clicking on continue button
    }
}
