package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

	public static void main(String[] args) {

//		========================
//		LeafGround Assignments
//		***
//		**Note : Kindly refer the video attached to do the following assignments
//
//		1.https://www.leafground.com/input.xhtml

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Bhaanavi");
		
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).clear();
		
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Mumbai");
// Returns Enabled always		
		boolean enabled = driver.findElement(By.xpath("(//div[@class='col-12'])[3]")).isEnabled();

		if (enabled)
			System.out.println("Test box is Enabled");
		else
			System.out.println("Text box is Disabled");
		
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		
		String text = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("Manoj@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("Hi I'm Manoj and I'm from UK");
		
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText());
			
		driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield ui-inputtext')])[8]")).click();
//		
		//driver.findElement(By.xpath("//ul[contains(@class,'ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container')]")).sendKeys("Manoj");
//		
//		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
//		
//		driver.findElement(By.xpath("//li[text()=2]")).click();
		
//		Not able to pick the date
		
		//driver.findElement(By.xpath("//button[contains(@class,'ui-datepicker-trigger')]")).click();//sendKeys("01/06/1988");
		
		driver.findElement(By.xpath("//input[contains(@class,'ui-spinner-input ui-inputfield')]")).sendKeys("5");
		
		String number = driver.findElement(By.xpath("//input[contains(@class,'ui-spinner-input ui-inputfield')]")).getText();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
		
		String up = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).getText();
		
// Not able to find the increment & decrement value
		System.out.println(number+ "   "+ up);
		
		if(number.equals(up))
		{
			System.out.println("Up arrow is not working fine");
		}
		else
		{
			System.out.println("Up arrow is working fine");
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
		
		driver.findElement(By.xpath("(//a[contains(@class,'ui-spinner-button')])[2]")).click();
		
		driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield ui-inputtext ui-widget')])[9]")).sendKeys("45");
		
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-keyboard')]")).click();	
		
		System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'ui-widget ui-widget')])[3]")).isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'keypad-special keypad-close')]")).click();
		
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).click();
		
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("Edit Box typed some test to verify it");
	
		//driver.close();

	}

}
