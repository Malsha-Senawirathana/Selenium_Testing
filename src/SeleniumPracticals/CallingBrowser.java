package SeleniumPracticals;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CallingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set system configuration
		System.setProperty("webdriver.chrome.driver","F:\\QA prcticales\\SQA_Selenoum_Project\\WebDriver_Files\\chromedriver_92 version.exe");
		
		//Define the web driver
		
		WebDriver ChromeDriver = new ChromeDriver();
		
		//get the browser link the window
		ChromeDriver.manage().window().maximize();
		
		// lord web site in the browser
		ChromeDriver.get("https://www.selenium.dev/");
		
			
	}

}
