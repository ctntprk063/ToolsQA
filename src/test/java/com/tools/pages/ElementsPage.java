package com.tools.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {

    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement elementsBtn;

    @FindBy(xpath = "//span[text()='Text Box']")
    public WebElement texBoxBtn;

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(css = "[placeholder='name@example.com']")
    public WebElement userEmail;

    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(xpath = "//p[text()='Automation']")
    public WebElement automationText;

    @FindBy(xpath= "//p[text()='Email:']")
    public WebElement emailText;

    public void texbox()  {

        elementsBtn.click();
        texBoxBtn.click();
        userName.sendKeys("Automation");
        userEmail.sendKeys("Testing@gmail.com");
        currentAddress.sendKeys("Testing Current Address");
        permanentAddress.sendKeys("Testing Permanent Address");
       // submitBtn.click();
    }




}
