package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeLogin {

	public static void main(String[] args) throws InterruptedException {
		
//		Assignment:3
//		===================
//		1. Load url "https://acme-test.uipath.com/login"
//		2. Enter email as "kumar.testleaf@gmail.com"
//		3. Enter Password as "leaf@12"
//		4. Click login button
//		5. Get the title of the page and print
//		6. Click on Log Out
//		7. Close the browser (use -driver.close())
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.tagName("Login")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(10000);
		
		driver.findElement(By.partialLinkText("Log Out")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
