package com.nishome.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsExample {
	private WebDriver driver;
	
	@Given("I am in the login page of the Para Bank Application")
	public void i_am_in_the_login_page_of_the_Para_Bank_Application() {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");//D:\Drivers\chromedriver.exe
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com");
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
        driver.findElement(By.name("userName")).sendKeys("tutorial");
        driver.findElement(By.name("password")).sendKeys("tutorial");
        driver.findElement(By.name("userName")).submit();
	}

	@Then("I should be taken to the Overview page")
	public void i_should_be_taken_to_the_Overview_page() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='rightPanel']/div/div/h1")));

        //driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/h1")).isDisplayed();
        driver.findElement(By.linkText("SIGN-OFF")).click();

        driver.quit();
	}
}
