package com.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MySteps {

    WebDriver driver;
    private ArrayList<Integer> list;

    @Given("an empty list")
    public void anEmptyList() {
        list = new ArrayList();
    }

    @When("I add a number $number")
    public void addNumber(int number) {
        list.add(list.size(), number);
        System.out.println("I've just added " + number + " to list");
    }

    @Then("size becomes $size and the list contains $number")
    public void sizeValidation(int size, int number) {
        assertEquals(size, list.size());
        assertTrue(list.contains(number));
        System.out.println("List contains: " + number);
    }

    @When("I remove $number number")
    public void remove(int number) {
        list.remove(list.size() - number);
        System.out.println("Removing item");
    }

    @Then("the list is empty")
    public void listIsEmpty() {
        assertTrue(list.isEmpty());
        System.out.println("Number was removed and current size is: " + list.size());
    }

    @Given("That i'm using $browser")
    public void getBrowser(String browser) {

        switch (browser) {

            case ("Firefox"):
                driver = new FirefoxDriver();
                break;

            case("Chrome"):
                System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
                driver = new ChromeDriver();
            break;

            default:
                System.out.println("TEST");
        }
        driver.manage().window().maximize();
    }

    @When("I'm navigating to $page")
    public void navigateToPage(String url) {
        driver.get(url);
    }

    @Then("I'm closing the browser")
    public void closeTheBrowser() {
        driver.close();
    }

}