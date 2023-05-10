package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
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
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("Dinga001@gmail.com");
		
		driver.findElement(By.linkText("Find Leads")).click();
			
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String text = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).getText();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//16. Confirm the duplicated lead name is same as captured name
		
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		if(text.equals(text2))
			System.out.println("Duplicate lead name is same as captured name");
		else
			System.out.println("!!! Duplicate lead name is not same as captured name");
		
		//17. close driver
		
		driver.close();
		
		
	}

}
