package com.pages.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import com.pages.base.BasePage;

public class NewCar extends BasePage {

	public NewCar(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[5]/section/footer")
	public WebElement tools;

	@FindBy(xpath = "//*[@id='root']/div[3]/div[2]/div[7]/section/div/div/div/a[1]/div[2]/div[2]")
	public WebElement OnRoadPrice;

	public void findOnRoadPrice() {
		HomePage hp = new HomePage(driver);
		hp.newCars();
		js.executeScript("window.scrollBy(0,3000)", "");
		// js.executeScript("arguments[0].scrollIntoView(true);", OnRoadPrice);
		// ExpectedVisibility(OnRoadPrice).click();
		OnRoadPrice.click();

	}

	@FindBy(xpath = "//*[@id=\"pqCarSelect\"]")
	public WebElement carname;

	@FindBy(xpath = "//*[@id=\"ui-id-1\"][1]")
	public WebElement carselect;

	@FindBy(xpath = "//*[@id=\"pqCitySelect\"]")
	public WebElement city;

	@FindBy(xpath = "/html/body/div[15]/div/div/div[1]")
	public WebElement cityDiv;

	@FindBy(xpath = "/html/body/div[15]/div/div/div[1]/input")
	public WebElement cityname;

	@FindBy(xpath = "//*[@id=\"ui-id-4\"]")
	public WebElement cityselect;

	@FindBy(xpath = "//*[@id=\"ctaClick\"]")
	public WebElement citysubmit;

	public void carDetails() {
		carname.sendKeys("merce");
		ExpectedVisibility(carselect).click();
		city.click();

		ExpectedVisibility(cityDiv);

		ExpectedVisibility(cityname).sendKeys("mumbai");
		ExpectedVisibility(cityselect).click();
//		ExpectedVisibility(District);
//		ExpectedVisibility(DistrictName).sendKeys("kurla");
//		ExpectedVisibility(DistrictSelect).click();
		citysubmit.click();

	}

}
