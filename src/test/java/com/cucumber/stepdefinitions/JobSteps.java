package com.cucumber.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobSteps {

	WebDriver driver;

@Given("^Go to jobserve$")
public void go_to_jobserve() throws Throwable {
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/java/com/cucumber/drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.jobserve.com/in/en/Job-Search/");
}

/*@Given("^Enter Keywords$")
public void enter_Keywords() throws Throwable {
	driver.findElement(By.xpath("//*[@id='txtKey']")).sendKeys();
}

@Given("^Enter Location$")
public void enter_Location() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}*/

@Given("^Enter \"([^\"]*)\"$")
public void enter(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id='txtKey']")).sendKeys(arg1);
}

@Given("^Enter location as \"([^\"]*)\"$")
public void enter_location_as(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id='txtLoc']")).sendKeys(arg1);
}

@Given("^Select \"([^\"]*)\"$")
public void select(String arg1) throws Throwable {
	new Select(driver.findElement(By.xpath("//*[@id='selAge']"))).selectByVisibleText(arg1);
}

@Given("^Select Job type$")
public void select_Job_type() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click on search$")
public void i_click_on_search() throws Throwable {
	driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
}

@Then("^Jobs shoud be displayed$")
public void jobs_shoud_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
}
