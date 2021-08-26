package com.tests.testcases;

import org.testng.annotations.Test;

import com.pages.page.NewCar;
import com.tests.base.BaseTest;

public class NewCarTest extends BaseTest {

	@Test
	public void findPriceOnRoadTest() {

		setUp();
		NewCar nc = new NewCar(driver);
		System.out.println(driver);
		nc.findOnRoadPrice();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		nc.carDetails();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
