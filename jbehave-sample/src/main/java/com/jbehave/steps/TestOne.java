package com.jbehave.steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sobin on 13.09.2015.
 */
public class TestOne{
    @Test

    public void testOne() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gb_70")));
        element.click();
        driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
    }

}
