package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) throws InterruptedException {
//		Assignments week2.day2
//		Assignment:1
//		FaceBook:
//		================================
//		// Step 1: Download and set the path 
//		// Step 2: Launch the chromebrowser
//		// Step 3: Load the URL https://en-gb.facebook.com/
//		// Step 4: Maximise the window
//		// Step 5: Add implicit wait
//		// Step 6: Click on Create New Account button
//		// Step 7: Enter the first name
//		// Step 8: Enter the last name
//		// Step 9: Enter the mobile number
//		// Step 10: Enter the password
//		// Step 11: Handle all the three drop downs
//		// Step 12: Select the radio button "Female" 
//		            ( A normal click will do for this step)
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Meenakshi");
		
		driver.findElement(By.name("lastname")).sendKeys("David");
		
		driver.findElement(By.name("reg_email__")).sendKeys("7010213198");
		
		driver.findElement(By.id("password_step_input")).sendKeys("M@no12345");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select D = new Select(day);
		
		D.selectByValue("6");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select M = new Select(month);
		
		M.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select Y = new Select(year);
		
		Y.selectByIndex(35);
		
		// To select Male Radio Button
		
		//driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		// To select Female Radi Button
		
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
