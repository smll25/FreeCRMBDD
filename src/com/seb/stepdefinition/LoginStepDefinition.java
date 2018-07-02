package com.seb.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com");
	}

	@When("^Title of Login Page is Free CRM$")
	public void title_of_Login_Page_is_Free_CRM(){
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password(){
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);

	}

	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page(){
		String homePageTitle = driver.getTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals("CRMPRO", homePageTitle);
	}

}
