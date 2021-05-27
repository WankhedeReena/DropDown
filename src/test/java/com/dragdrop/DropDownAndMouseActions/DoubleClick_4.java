package com.dragdrop.DropDownAndMouseActions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dragdrop.DropDownAndMouseActions.testBase.Base_1;
import com.dragdrop.DropDownAndMouseActions.testBase.Base_3;

public class DoubleClick_4 extends Base_3 {
	@Test
	public void dropDown() throws InterruptedException
	{
		WebElement righClickMeButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		// To Halt the execution for sometime (demonstration purposes)
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.doubleClick(righClickMeButton).build().perform();
	} 

}
