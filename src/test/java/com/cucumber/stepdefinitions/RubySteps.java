package com.cucumber.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RubySteps {
	WebDriver driver;
	@Given("^I go to website$")
	public void i_go_to_website() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("http://practice.automationtesting.in/");
	}

	@Given("^I click on ruby img$")
	public void i_click_on_ruby_img() throws Throwable {
	   driver.findElement(By.xpath("//*[@id='text-22-sub_row_1-0-2-0-0']/div/ul/li/a[1]/img")).click();
	}

	@Given("^I click on Add to basket$")
	public void i_click_on_Add_to_basket() throws Throwable {
	  driver.findElement(By.xpath("//*[@id='product-160']/div[2]/form/button")).click();
	}

	@When("^I click on view basket$")
	public void i_click_on_view_basket() throws Throwable {
	   driver.findElement(By.xpath("//*[@id='content']/div[1]/a")).click();
	}

	@Then("^Ruby shoud be added to kart$")
	public void ruby_shoud_be_added_to_kart() throws Throwable {
	   
	}

	@When("^Click on remove button$")
	public void click_on_remove_button() throws Throwable {
	  driver.findElement(By.xpath("//a[@class='remove']")).click();
	}

	@Then("^Item shoud be removed$")
	public void item_shoud_be_removed() throws Throwable {
	    
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}

}
