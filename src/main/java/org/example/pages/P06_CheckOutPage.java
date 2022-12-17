package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;


public class P06_CheckOutPage {
    WebDriver driver;
    public P06_CheckOutPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
//    @FindBy(id = "termsofservice")
    final private By termsOfService= RelativeLocator.with(By.id("termsofservice"));
//    @FindBy(id = "checkout")
    final private By checkout=RelativeLocator.with(By.id("checkout"));
    final private By country=RelativeLocator.with(By.xpath("//select[@data-trigger='country-select']"));
    final private By state=RelativeLocator.with(By.xpath("//select[@data-trigger='state-select']"));
    final private By address1=RelativeLocator.with(By.id("BillingNewAddress_Address1"));
    final private By address2=RelativeLocator.with(By.id("BillingNewAddress_Address2"));
    final private By zipCode=RelativeLocator.with(By.id("BillingNewAddress_ZipPostalCode"));
    final private By phoneNumber=RelativeLocator.with(By.id("BillingNewAddress_PhoneNumber"));
    final private By faxNumber=RelativeLocator.with(By.id("BillingNewAddress_FaxNumber"));
    final private By continueButton=RelativeLocator.with(By.xpath("//button[@name='save']"));
    
    public void ClickCheckoutButton(){driver.findElement(checkout).click();}
    public void checkTermsOfService(){driver.findElement(termsOfService).click();}
}
