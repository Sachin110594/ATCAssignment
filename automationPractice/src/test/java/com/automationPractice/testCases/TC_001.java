package com.automationPractice.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.automationPractice.pageObjects.Assignment;

public class TC_001 extends BaseClass {

	@Test
	public void tc_001() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		Assignment as = new Assignment(driver);
		as.clicktoSign();
	    as.setUserName(uname);
	    waitI(3);
		as.setUserPass(pass);
		waitI(3);
		as.setSubmit();
		waitI(20);

		as.clickMyAddress();
		waitI(5);
		
		as.addNewAddeess();
		waitI(5);
		
		as.setCompany();
		wait(3);
		
		as.setAddress();
		Thread.sleep(5000);
		
		as.setCity();
		wait(3);
		
		as.setState();
		wait(3);
		
		as.postCode();
		wait(3);
		
		as.homePhone();
		wait(3);
		
		as.mobilePhone();
		wait(3);
		
		as.addressTitle();
		wait(3);
		
		as.submitAddress();
		wait(3);
		
		as.movetoWomen();
		wait(3);
		
		as.list();
		wait(3);
		
		as.clickonFirst();
		wait(3);
		
		as.quantity();
		wait(3);
		
		as.size();
		wait(3);
		
		as.color();
		wait(3);
		
		as.addToCart();
		wait(3);
		
		as.continueShoping();
		wait(3);
		
		as.quantity();
		wait(3);
		
		as.size();
		wait(3);
		
		as.color();
		wait(3);
		
		as.addToCart();
		wait(3);
		
		as.continueShoping();
		wait(3);
		as.quantity();
		wait(3);
		
		as.size();
		wait(3);
		
		as.color();
		wait(3);
		
		as.addToCart();
		wait(3);
		
		as.checkout();
		wait(3);
		
		as.proceedToCheckout();
		wait(3);
		
		as.processAddress();
		wait(3);
		
		as.policy();
		wait(3);
		
		as.processCarrier();
		wait(3);
		
		as.bankselect();
		wait(3);
		
		as.confirmOrder();
		wait(3);
		
		captureScreen(driver,"tc_001");
		
		as.signout();
		
	}
}
