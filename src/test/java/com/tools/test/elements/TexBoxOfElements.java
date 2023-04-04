package com.tools.test.elements;

import com.tools.pages.ElementsPage;
import com.tools.test.TestBase;
import com.tools.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TexBoxOfElements extends TestBase {
    /*

       1) Bu siteye gidin. ->  http://demoqa.com/text-box

       2) Full Name kısmına "Automation" girin.

       3) Email kısmına "Testing@gmail.com" girin.

       4) Current Address kısmına "Testing Current Address" girin.

       5) Permanent Address kısmına "Testing Permanent Address" girin.

       6) Submit butonuna tıklayınız.

       7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

       8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

    */
    ElementsPage ep = new ElementsPage();

    @Test
    public void test1() throws InterruptedException {
        driver.get(ConfigurationReader.get("url"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");

        ep.texbox();
        jse.executeScript("window.scrollBy(0,500)");

       WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
//        System.out.println(ep.automationText.getText().contains("Automation"));
//        System.out.println(ep.emailText.getText().contains("Testing"));
        Assert.assertTrue(ep.automationText.getText().contains("Automation"));
        Assert.assertTrue(ep.emailText.getText().contains("Testing"));


    }

}
