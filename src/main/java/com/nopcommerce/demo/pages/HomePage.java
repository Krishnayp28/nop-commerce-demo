package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computersMenu;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronicsMenu;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement apparelMenu;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement digitalDownloadsMenu;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement booksMenu;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement jewelry;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftCardsMenu;
    @CacheLookup
    @FindBy(xpath = "img[alt='nopCommerce demo store']")
    WebElement logo;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;


    public void isLogoutLinkDisplayed() {
        verifyThatElementIsDisplayed(logoutLink);
    }

    public void clickingOnTheLogoutLink() {
        clickOnElement(logoutLink);
    }

    public void clickingOnLoginLinkFromTheHomePage() {
        clickOnElement(loginLink);
    }

    public void isLoginLinkDisplayed() {
        WebElement link = driver.findElement(By.xpath("//a[@class='ico-login']"));
        boolean isEnabled = link.isEnabled();
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnComputersMenu() {
        clickOnElement(computersMenu);
    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink);
    }
}
