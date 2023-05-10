package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
		
		//driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active']")).click();
		
		//driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-c ui-icon-blank']")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).click();
		
		boolean enabled =driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isEnabled();
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled());
		
		System.out.println(enabled);
		
		if(enabled)
			System.out.println("check box Enabled");
		else
			System.out.println("Check box Disabled");
	
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple')]")).click();
	
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[12]")).click();
	
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[17]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[14]")).click();
	
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
