package com.tests.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.tests.utils.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	public Actions action;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	public WebDriver driver;
	public Properties Config = new Properties();
	public FileInputStream fis;
	public ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\carwale.xlsx");
	
	@BeforeMethod
	public void start() {
		System.out.println(this.getClass().getName());
	}

	public void setUp() {

		try {
			fis = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			Config.load(fis);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(Config.getProperty("Baseurl"));
		action = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		wait.pollingEvery(Duration.ofSeconds(3));
		js = (JavascriptExecutor) driver;

	}

	@AfterMethod
	public void tearDown() {
		try {
			
		driver.quit();
		}catch (Throwable t) {
			t.printStackTrace();
		}

	}
}
