package com.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;

	public WebDriverWait wait;

	public BasePage(WebDriver driver) {

		this.driver = driver;
		wait = new WebDriverWait(driver, 10);

		PageFactory.initElements(driver, this);
	}

	public WebElement ExpectedVisibility(WebElement ele) {
		WebElement webwait = wait.until(ExpectedConditions.visibilityOf(ele));
		return webwait;
	}

}
