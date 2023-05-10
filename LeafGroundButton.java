package week2.day1.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////		2.https://www.leafground.com/button.xhtml

		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		driver.navigate().back();
		
		boolean enabled = driver.findElement(By.xpath("//button[@id = 'j_idt88:j_idt92']")).isEnabled();
		
		if(enabled)
			System.out.println("Button is enabled");
		else
			System.out.println("Button is Disabled");
		
		Point location = driver.findElement(By.xpath("//button[@id = 'j_idt88:j_idt94']")).getLocation();
		
		System.out.println("Position of Submit button is :"+location);
		
		String value = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		
		System.out.println("Color of save button is :"+value);
		
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		
		System.out.println("Height & Width of Submit button is :"+size);
		
		// -- Mouse over and confirm the color changed
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Success']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		
		//-- Click Image Button and Click on any hidden button
		
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		
		//driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imagePanel']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		
		int count = list.size();
		
		System.out.println("Number of rounded buttons in web page are :" +count);
		
		//driver.close();
		
	}

}
