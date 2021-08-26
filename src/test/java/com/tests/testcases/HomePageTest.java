package com.tests.testcases;

import org.testng.annotations.Test;

import com.pages.page.Brands;
import com.pages.page.FindCarChoice;
import com.pages.page.HomePage;
import com.pages.page.NewCar;
import com.pages.page.PopularCar;
import com.pages.page.ViewUsedCars;
import com.tests.base.BaseTest;

public class HomePageTest extends BaseTest {

	@Test 
	public NewCarTest newCarsTest() {
		try {

			setUp();
			HomePage hp = new HomePage(driver);
			NewCar nc = hp.newCars();

		} catch (Throwable t) {
			t.printStackTrace();
		}
		return new NewCarTest();
	}

	@Test
	public void popularCarsTest() {
		setUp();
		HomePage hp = new HomePage(driver);
		PopularCar pc = hp.popularCars();
	}

	@Test
	public void brandsTest() {
		setUp();
		HomePage hp = new HomePage(driver);
		Brands bn = hp.brands();
	}

	@Test
	public void findCarOfChoiceTest() {
		setUp();
		HomePage hp = new HomePage(driver);
		FindCarChoice fc = hp.findCarOfChoice();
	}

	@Test
	public void viewUsedCarsTest() {
		setUp();
		HomePage hp = new HomePage(driver);
		ViewUsedCars vc = hp.viewUsedCars();
	}

}
