package com.dragdrop.DropDownAndMouseActions.testBase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Base_1 {
	protected WebDriver driver;

	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable");
		
		
	}
		@After
		public void teardown() throws InterruptedException
		{
			// To Halt the execution for sometime (demonstration purposes)
			Thread.sleep(5000);
			driver.quit();
		}


}
