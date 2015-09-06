package com.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.ArrayList;

public class MySteps {
    private ArrayList<Integer> list;


    @Given("an empty list")
    public void anEmptyList(){
        list = new ArrayList<Integer>();
    }

    @When("I add a number $number")
    public void addNumber(int number) {
        list.add(number);
    }

    @Then("size becomes $size and the list contains $number")
    public void sizeValidation(int size, int number) {
        Assert.assertEquals(size, list.size());
        Assert.assertTrue(list.contains(number));
    }

    @When("I remove number $number")
    public void remove(int number) {
        list.remove(number);
    }

    @Then("the list is empty")
    public void listIsEmpty() {
        Assert.assertTrue(list.isEmpty());
    }
}