package SeleniumPracticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FB_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","F:\\QA prcticales\\SQA_Selenoum_Project\\WebDriver_Files\\chromedriver_92 version.exe");
			
			//Set Variables
			String BaseURL = "https://www.facebook.com/";
					
			//Define Logic and Objects
			WebDriver chromeDriver = new ChromeDriver();
			chromeDriver.manage().window().maximize();
			chromeDriver.get(BaseURL);
					
					
			WebElement UserNameTextBox = chromeDriver.findElement(By.xpath("//*[@id=\"email\"]")); // Identify the web element
			UserNameTextBox.sendKeys("*****"); // Action(hiding the username)
					
			Thread.sleep(3000);
					
			WebElement PasswordTextBox = chromeDriver.findElement(By.xpath("//*[@id=\"pass\"]"));
			PasswordTextBox.sendKeys("******");//(hiding the password)
					
			Thread.sleep(3000);
					
			WebElement LoginButton = chromeDriver.findElement(By.name("login"));
			LoginButton.click();
			
	}

}
