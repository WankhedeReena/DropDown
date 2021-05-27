package com.dragdrop.DropDownAndMouseActions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dragdrop.DropDownAndMouseActions.testBase.Base_1;
import com.dragdrop.DropDownAndMouseActions.testBase.Base_2;

public class DragAndDrop_2 extends Base_2 {
	@Test
	public void dropDown() throws InterruptedException
	{
		
//		WebElement frameEle = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frameEle);
		
		// Alternate way
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		WebElement element1 = driver.findElement(By.id("draggable"));
		//WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']]"));
		WebElement dropArea = driver.findElement(By.id("droppable"));
		//WebElement dropArea = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		
		// To Halt the execution for sometime (demonstration purposes)
		Thread.sleep(3000);
		
		//act.clickAndHold(element1).moveToElement(dropArea).build().perform();
		act.dragAndDrop(element1, dropArea).build().perform();
	}

}
