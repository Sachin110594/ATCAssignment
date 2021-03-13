package com.automationPractice.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.automationPractice.utilities.ReadConfig;

public class BaseClass {

	//Creating object for Readconfig
	
	ReadConfig rc = new ReadConfig();
	String baseURL = rc.getApplicationURL();
	String uname = rc.getUserName();
	String pass =rc.getUserPass();
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
			
	if (br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	}

	@AfterClass
	public void tiersetup() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public void waitI(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
}
