//package com.dbs.trade.steps;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.dbs.trade.libs.tradelibs;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import net.thucydides.core.annotations.Steps;
//
//public class tradestepsSonali {
//	ChromeDriver driver = new ChromeDriver();
//	@Given ("^ user navigates to the website {DBSURL} $")
//	 public void user_navigates_to_the_website (String DBSURL) {
//		
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(DBSURL);
//	}
//	
//	@And("^User enters UserName and Password$")
//	public void user_enters_UserName_and_Password(String Username, String Password) throws Throwable {
//		driver.findElement(By.id("UserName")).sendKeys(Username); 	 
//	    driver.findElement(By.id("pwd")).sendKeys(Password);
//	    driver.findElement(By.id("Submit")).click();
//		}
//	
//	@Then("^user should see {String} text on landing page$")
//	public void user_should_see_text_on_landing_page() throws Throwable {
//		WebElement ele=driver.findElement(By.xpath(".//[@text()='DBS']"));
//			if(ele.getText()=="DBS") {
//				System.out.println("User is on landing page");
//			}else {
//				System.out.println("Login Unsuccessful");
//			}
//	}
//
//	@When("^User LogOut from the Application$")
//	public void user_LogOut_from_the_Application() throws Throwable {
//		driver.findElement (By.xpath(".//*[@id='logout']")).click();
//	}
//	
//	@Then("^User Validate the {String} tab$")
//	public void userValidatethetab(String tabName) throws Throwable {
//		List<WebElement> list= driver.findElements (By.xpath(".//[@type='button']"));
//		for (int i=0;i<=list.size();i++) {
//			if(list.get(i).getText()=="Social") {
//				System.out.println("Social Tab available");
//			}else if (list.get(i).getText()=="Alert") {
//				System.out.println("Alert Tab available");
//			}else if (list.get(i).getText()=="Buy") {
//				System.out.println("Buy Tab available");
//			}else if (list.get(i).getText()=="Sell") {
//				System.out.println("Sell Tab available");
//			}else{
//				System.out.println("Invalid input");
//			}
//		}
//	}
//	
//	
//}
