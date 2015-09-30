package com.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MySteps {
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

}