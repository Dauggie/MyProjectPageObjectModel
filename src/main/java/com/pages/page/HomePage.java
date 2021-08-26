package com.pages.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.pages.base.BasePage;

public class HomePage extends BasePage {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id='root']/div[2]/header/div/nav/ul/li[1]")
	public WebElement newcars;

	@FindBy(xpath = "//div[contains(text(),'Find New Cars')]")
	public WebElement Findnewcars;

	@FindBy(xpath = "//*[@id='tooltip-container']/div[2]/label[1]/span[2]")
	public WebElement lang;

	public NewCar newCars() {

		ExpectedVisibility(lang).click();

		new Actions(driver).moveToElement(newcars).perform();
		Findnewcars.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("Here");

		return new NewCar(driver);

	}

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/section/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/a/div")
	public WebElement popCar;

	@FindBy(xpath = "//div[contains(text(),'View All Popular Cars')]")
	public WebElement PopularCar;

	public PopularCar popularCars() {
		//js.executeScript("arguments[0].scrollIntoView(true);", popCar);
		 js.executeScript("window.scrollBy(0,550)", "");

		 ExpectedVisibility(PopularCar).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		return new PopularCar();
	}

	@FindBy(xpath = "//html/body/div[1]/div[3]/div[2]/div[2]/section/header/h2")
	public WebElement brnd;

	@FindBy(xpath = "//div[@aria-label='View More Brands']")
	public WebElement Brands;

	public Brands brands() {
		js.executeScript("arguments[0].scrollIntoView(true);", brnd);
		// js.executeScript("window.scrollBy(0,750)", "");
		Brands.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Brands();
	}

	@FindBy(xpath = "//html/body/div[1]/div[3]/div[2]/div[3]/section/header/h2")
	public WebElement Coc;

	@FindBy(xpath = "//a[normalize-space()='Luxury Cars']")
	public WebElement carOfChoice;

	public FindCarChoice findCarOfChoice() {
		js.executeScript("arguments[0].scrollIntoView(true);", Coc);
		// js.executeScript("window.scrollBy(0,1050)", "");
		carOfChoice.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new FindCarChoice();
	}

	@FindBy(xpath = "//html/body/div[1]/div[3]/div[4]/div[3]/section/header/h2")
	public WebElement footer;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div[3]/section/footer/a")
	public WebElement ViewUsedCars;

	public ViewUsedCars viewUsedCars() {
		js.executeScript("arguments[0].scrollIntoView(true);", footer);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedVisibility(ViewUsedCars).click();
		return new ViewUsedCars();
	}
}
