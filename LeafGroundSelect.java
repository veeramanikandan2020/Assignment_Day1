package week2.day1.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {
		// 3.https://www.leafground.com/select.xhtml
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/select.xhtml");
		
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		
		Select E = new Select(element);
		
		List<WebElement> options = E.getOptions();
		
		Thread.sleep(3000);
		
		options.get(1).click();
		
//		for (int i = 0; i < options.size(); i++) 
//		{
//			options.get(i).click();			
//		}
//		
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		
		driver.findElement(By.xpath("//li[@id='j_idt87:country_3']")).click();
		
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		
		//driver.findElement(By.xpath("//li[text()='Bengaluru']")).click();
		
		
		
	}

}
