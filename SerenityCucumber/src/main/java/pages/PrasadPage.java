package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class PrasadPage extends BasePage {
	
	@FindBy(xpath = "//input[@value='Start now']")
    private WebElement StartNowButton;
	
	@FindBy(xpath = "//label[@id='label-wales']")
    private WebElement CountryLiveIn;
	
	@FindBy(xpath = "//input[@id='next-button']")
	 private WebElement CountryLiveInNextButton;
	 
	 @FindBy(xpath = "//label[@id='label-yes']")
	private WebElement GpPracticeYesButton;
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement GPPracticeNextButton;
	 
	 @FindBy(xpath = "//label[@id='label-wales']")
	 private WebElement DentalPracticeCountry;
	 
	 @FindBy(xpath = "//input[@class='button']")
	 private WebElement DentalPracticeCountryNextButton;
	 
	 
	 @FindBy(xpath = "//input[@name='dateOfBirth.day']")
	 private WebElement DateOfBirthDay;
	 
	 @FindBy(xpath = "//input[@name='dateOfBirth.month']")
	 private WebElement DateOfBirthMonth;
	 
	 @FindBy(xpath = "//input[@name='dateOfBirth.year']")
	 private WebElement DateOfBirthYear;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement DateOfBirthNextButton;
	 
	 
	 @FindBy(xpath = "//label[@id='label-no']")
	 private WebElement DoYouLiveWithPartnerYesButton;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement DoYouLiveWithPartneNextButton;
	 
	 
	 @FindBy(xpath = "//label[@id='label-no']")
	 private WebElement ClaimBenifits;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement ClaimBenifitsNextButton;
	 
	
	 
	 @FindBy(xpath = "//label[@id='label-no']")
	 private WebElement AreYoupregnant;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement AreYoupregnantNextButton;
	 
	 
	 @FindBy(xpath = "//label[@id='label-no']")
	 private WebElement ArmedForces;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement  ArmedForcesNextButton;
	 
	 @FindBy(xpath = "//label[@id='label-yes']")
	 private WebElement DoYouHaveDiabetes;
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement DoYouHaveDiabetesNext;    
	 
	 
	 @FindBy(xpath = "//label[@id='label-no']")
	 private WebElement DoYouHaveGlaucoma;
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement DoYouHaveGlaucomaNext;
	 
	 
	 @FindBy(xpath = "//label[@id='label-yes']")
	 private WebElement LivePermanentlyInCareHome;
	 
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement LivePermanentlyInCareHomeNext;
	 
	 
	 @FindBy(xpath = "//label[@id='label-yes']")
	 private WebElement Savings;
	 
	 @FindBy(xpath = "//input[@id='next-button']")
	 private WebElement SavingsNextButton;
	 
	 
//	 @FindBy(xpath = "//h1[@id='result-heading']")	 
	 @FindBy(xpath = "//h2[@class='heading-large']/span")
	 private WebElement ElegibilityResultFirstHalf;
	 
	 @FindBy(xpath = "//h2[@class='heading-large']")
	 private WebElement ElegibilityResultSecondHalf;
	 
	 
	 public PrasadPage() {
		 PageFactory.initElements(getDriver(), this);
			
		}
	 
	
	 public void naviagte() {
		 try {
			    getDriver().get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
			    System.out.println("URL launched Successfully");
				Thread.sleep(1000);
			  } catch (Exception e) {
				e.printStackTrace();
				System.out.println("URL launched Fails:"+e);
			}
	 }
	 
	 public void validateDocumentTitle() {
		 
		 if(getDriver().getTitle().equalsIgnoreCase("Check what help you could get to pay for NHS costs - NHSBSA")) {
			 
			 System.out.println("NHS page titile matched");
		 }
		 
		 else {
			 
			 System.out.println("NHS page titile matched");
			 
		 }	
			
		}
	 
	 
	 
	 public void VerifyWalesElegibilityUser() {
		 
		 WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		 
		 
		 StartNowButton.click();
		 
		 
		 CountryLiveIn.click();
		 CountryLiveInNextButton.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(GpPracticeYesButton));
		 GpPracticeYesButton.click();
		 GPPracticeNextButton.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(DentalPracticeCountry));
		 DentalPracticeCountry.click();
		 DentalPracticeCountryNextButton.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(DateOfBirthDay));
		 DateOfBirthDay.sendKeys("25");
		 DateOfBirthMonth.sendKeys("12");
		 
		 DateOfBirthYear.sendKeys("1990");
		 DateOfBirthNextButton.click();
		 
		 
		wait.until(ExpectedConditions.visibilityOf(DoYouLiveWithPartnerYesButton));
		DoYouLiveWithPartnerYesButton.click();
		 DoYouLiveWithPartneNextButton.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(ClaimBenifits));
		 ClaimBenifits.click();
		 ClaimBenifitsNextButton.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(AreYoupregnant));
		 AreYoupregnant.click();
		 AreYoupregnantNextButton.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(ArmedForces));
		 ArmedForces.click();
		 ArmedForcesNextButton.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(DoYouHaveDiabetes));
		 DoYouHaveDiabetes.click();
		 DoYouHaveDiabetesNext.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(DoYouHaveGlaucoma));
		 DoYouHaveGlaucoma.click();
		 DoYouHaveDiabetesNext.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(LivePermanentlyInCareHome));
		 LivePermanentlyInCareHome.click();
		 LivePermanentlyInCareHomeNext.click();
		 
		 wait.until(ExpectedConditions.visibilityOf(Savings));
		 Savings.click();
		 SavingsNextButton.click();
		  	 
	}
	 
	 public void VerifyNhsElegibilityResult() {
		 
		 String secondText = ElegibilityResultSecondHalf.getText();
		 String str1 = secondText.replace("\n", " ");
		 System.out.println("Final Text: " + str1);
		 if(str1.equalsIgnoreCase("Based on what you've told us You can apply for help with NHS costs")) {
			 
//			 System.out.println(str1);
			 System.out.println("User Apllicable for Nhs Free Cost");	
			 
		 }
		 else {
			 System.out.println("User Not Apllicable for Nhs Free Cost");		 
		 }	 
		 	
	}
	 
	 
	 public void close() {
		 
		 getDriver().quit();
		
	}

}
