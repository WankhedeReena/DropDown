package com.dragdrop.DropDownAndMouseActions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dragdrop.DropDownAndMouseActions.testBase.Base_1;

public class DragAndDrop_1 extends Base_1 {
	
	
	@Test
	public void dropDown() throws InterruptedException
	{
		WebElement element1 = driver.findElement(By.id("draggable"));
		//WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropArea = driver.findElement(By.id("droppable"));
		//WebElement dropArea = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		// To Halt the execution for sometime (demonstration purposes)
		Thread.sleep(3000);

		//act.clickAndHold(element1).moveToElement(dropArea).build().perform();
		act.dragAndDrop(element1, dropArea).build().perform();

	}
	
	
}


