package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Aravind");
		
		driver.findElement(By.className("x-btn-text")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("Dinga001@gmail.com");
		
		driver.findElement(By.linkText("Find Leads")).click();
			
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		//Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Sasken");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		System.out.println(text);
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		

	}

}
