import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstWebSiteTesting {

	public static void main(String[] args) throws Exception {
		// Load the FireFox Driver
		WebDriver driver = new FirefoxDriver();
		// Open a WebPage in the Firefox
		driver.get("https://www.facebook.com/?_rdr");
		// Searching email textbox and hand it over to emailTextBox Variable
		//WebElement emailTextBox= driver.findElement(By.id("email"));
		//emailTextBox.sendKeys("mike@gmail.com");
		driver.findElement(By.id("email")).sendKeys("mike@gmail.com");
		WebElement pwdTextBox= driver.findElement(By.id("pass"));
		pwdTextBox.sendKeys("1212mike4343");
		WebElement loginBt =driver.findElement(By.id("u_0_v"));
		loginBt.click();
		WebElement msg = driver.findElement(By.cssSelector(".fsl.fwb.fcb"));
		String messageValue = msg.getText();
		//if(messageValue.contains("your userid")){
		//if(messageValue.equals("Please re-enter your password")){	
		if(messageValue.startsWith("Please")){
		System.out.println("Test is Pass");
		}
		else
		{
			System.out.println("test is Fail...");
		}
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.close();
		

	}

}
