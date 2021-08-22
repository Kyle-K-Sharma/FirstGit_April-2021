package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InteruptedException {
		
		Scanner scn = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sharm\\Apr2021_Selenium\\First_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techfios..com//billing/?ng=admin//");
		driver.manage().window().maximize();
		
		thread.sleep(2000);
		
	}
}
