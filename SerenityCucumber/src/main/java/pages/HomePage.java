package pages;

import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import base.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

	Logger logger = LoggerFactory.getLogger(HomePage.class);
	
	public String loadresources(String argument) {
		
		InputStream file = HomePage.class.getClassLoader().getResourceAsStream("Test.properties");
		Properties prop = new Properties();
		
		try {
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String value = prop.getProperty(argument);
		
		return value;
	}

	public void openBaseUrl(String url) {

		url = loadresources("CD_URL");		
		getDriver().get(url);
		getDriver().manage().deleteAllCookies();

	}

	public void selectCarType() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		WebElementFacade pageTitle = find(By.xpath("//h2[contains(text(),'Vehicle Inventory')]"));
		WebElementFacade selectType = find(By.xpath("(//div[@class='v-select__slot']/div[2])[2]"));
		WebElementFacade carType = find(By.xpath("//div[contains(text(),'Ontario')]"));

		wait.until(ExpectedConditions.visibilityOf(pageTitle));
		selectType.click();
		carType.click();
	}

	public void selectCarModel(int model) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		WebElementFacade carModel = find(By.xpath("//span[contains(text(),'Make & Model')]"));
		WebElementFacade modelType = find(By.xpath(
				"//div[@class='v-expansion-panel transparent filter-panel']/button/span[contains(text(),'Ram')]"));
		WebElementFacade vechicleRam = find(By.xpath("(//div[@class='v-input--selection-controls__input'])[2]"));

		carModel.click();
		wait.until(ExpectedConditions.visibilityOf(modelType));
		modelType.click();
		vechicleRam.click();

	}

	public void sortByPrice() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		WebElementFacade priceSortButton = find(By.xpath("(//div[@class='v-select__slot']/div[2])[1]"));
		WebElementFacade priceSort = find(By.xpath("//div[contains(text(),'Price: Low to High')]"));

		wait.until(ExpectedConditions.visibilityOf(priceSortButton));
		priceSortButton.click();
		priceSort.click();
	}

	public void selectfavorites(int totalcars, int carModel) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		WebElementFacade firstCar = find(By.xpath("(//span[@class='v-btn__content']/span)[2]"));
		WebElementFacade secondCar = find(By.xpath("(//span[@class='v-btn__content']/span)[3]"));
		WebElementFacade thirdCar = find(By.xpath("(//span[@class='v-btn__content']/span)[4]"));

		wait.until(ExpectedConditions.visibilityOf(firstCar));
		firstCar.click();
		secondCar.click();
		thirdCar.click();

	}

	public void pickACar(int carType) {
		WebElementFacade firstCarFromList = find(By.xpath("(//div[@class='v-responsive__sizer'])[1]"));
		WebElementFacade secondCarFromList = find(By.xpath("(//div[@class='v-responsive__sizer'])[2]"));
		secondCarFromList.click();

	}

	public void carCheckOut() {
		WebElementFacade startPurchase = find(By.xpath("(//span[contains(text(),'Start Purchase')])[3]"));
		startPurchase.click();
	}

	public void calculateDeliveryAddress() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		WebElementFacade deliveryAddress = find(By.xpath("(//div[@class='col col-4'])[1]/div/div[2]"));
		WebElementFacade inputAddressEditBox = find(By.xpath("//input[@id='street_address']"));
		WebElementFacade addressList = find(By.xpath("//div[@class='pcaautocomplete pcatext']/div[2]/div"));
		WebElementFacade EstimatedDeliveryCost = find(By.xpath("//div[@class='estimate__cost px-10']/div/h2"));
		WebElementFacade deliverySave = find(By.xpath("(//span[contains(text(),'Save and Confirm')])[1]"));

		deliveryAddress.click();
		inputAddressEditBox.type("30 British Columbia Rd, Toronto ON");
		waitABit(5000);
		inputAddressEditBox.sendKeys(Keys.SPACE);
		addressList.click();
		wait.until(ExpectedConditions.visibilityOf(EstimatedDeliveryCost));
		String deliveryCost = EstimatedDeliveryCost.getText();
		logger.info("Total Delivery Cost: " + deliveryCost);
		deliverySave.click();
	}

	public void selectWarrenty(int months) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		WebElementFacade selectWarenty = find(By.xpath("(//div[@class='col col-4'])[2]/div/div[2]"));
		WebElementFacade selectMonthlyWarenty = find(
				By.xpath("(//div[@class='v-input--radio-group__input']/div[3]/div/div/div/div[1]/div/div/div"));
		WebElementFacade warrentySave = find(By.xpath("(//span[contains(text(),'Save and Confirm')])[2]"));

		selectWarenty.click();
		wait.until(ExpectedConditions.visibilityOf(selectMonthlyWarenty));
		selectMonthlyWarenty.click();
		warrentySave.click();
	}

	public void waitABit(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
