package com.dbs.trade.pages;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dbs.trade.base.BasePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

	Logger logger = LoggerFactory.getLogger(HomePage.class);
	
	public void loginApplication() {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		
		InputStream file = HomePage.class.getClassLoader().getResourceAsStream("Test.Properties");
		
		Properties prop = new Properties();
		
		try {
			prop.load(file);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		String url = prop.getProperty("DBS_URL");
		String userName = prop.getProperty("USERNAME");
		String passWord = prop.getProperty("PASSWORD");
		String welcomeText = prop.getProperty("WELCOMETEXT");
		
		WebElementFacade userID = find(By.xpath("//input[@name='uname']"));
		WebElementFacade password = find(By.xpath("//input[@name='pass']"));
		WebElementFacade signIn = find(By.xpath("//input[@type='submit']"));
		WebElementFacade welComeMessage = find(By.xpath("//div[contains(text(),'DBS')]"));
		
		getDriver().get(url);
		userID.sendKeys(userName);
		password.sendKeys(passWord);
		signIn.click();
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(welComeMessage));
		String welComeText = welComeMessage.getText();
		Assert.assertTrue(welComeText, true);
	}
	
	public void totalNumberofStocks() {
		String typeOrder = Serenity.sessionVariableCalled("Operation").toString();
		
		switch(typeOrder){
		case "BUY":
			break;
		case "SELL":
			break;
		}
		
	}
	
	public void enterValues(String orderType, String quantity) {
		
		int total = Integer.parseInt(quantity);
	
	}

	public void ClickAButton(String btnName) {
		WebElementFacade alertsTab = find(By.xpath("//button[@type='button' and text()='Alerts']"));
		WebElementFacade alertsMessage = find(By.xpath("//div[@role='tabpanel' and text()='Alerts']"));
		alertsTab.shouldBeVisible();
		alertsTab.click();
//		Assert.assertTrue(alertsMessage.getText().toString(),true);
		
	}
	
	public void clickATab(String tabName) {
		
		WebElementFacade buyTab = find(By.xpath("//button[@type='button' and text()='Buy']"));
		WebElementFacade sellTab = find(By.xpath("//button[@type='button' and text()='Sell']"));
		WebElementFacade buyMessage = find(By.xpath("//div[@role='tabpanel' and text()='Buy']"));
		WebElementFacade sellMessage = find(By.xpath("//div[@role='tabpanel' and text()='Sell']"));
		
		if(tabName.equalsIgnoreCase("Buy")) {
			buyTab.click();
			Assert.assertTrue(buyMessage.getText().toString(), true);
		} else if (tabName.equalsIgnoreCase("Sell")) {
			buyTab.click();
			Assert.assertTrue(sellMessage.getText().toString(), true);
		}
	}

	public void enterAlertPrice(String price) {
		
		
	}

	public void validateNewAlert() {
	
		
	}

	public void dbsDefaultPrice() {
	
		
	}

	public void availabilityOfTab() {
	
		
	}

	public void validateCommentsInSocialTab() {
		
		
	}

}
