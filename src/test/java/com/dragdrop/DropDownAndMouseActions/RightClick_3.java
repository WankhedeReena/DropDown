package com.dragdrop.DropDownAndMouseActions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dragdrop.DropDownAndMouseActions.testBase.Base_1;
import com.dragdrop.DropDownAndMouseActions.testBase.Base_2;
import com.dragdrop.DropDownAndMouseActions.testBase.Base_3;

public class RightClick_3 extends Base_3 {
	
	@Test
	public void dropDown() throws InterruptedException
	{
		WebElement righClickMeButton = driver.findElement(By.xpath("//span[text()='right click me']"));

		// To Halt the execution for sometime (demonstration purposes)
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
	
		act.contextClick(righClickMeButton).build().perform();
		
	}

}
