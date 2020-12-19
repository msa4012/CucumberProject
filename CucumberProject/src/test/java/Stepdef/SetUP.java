package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUP {
	
	static WebDriver driver;
		
	@Before
	public void SetDriver() {
		System.out.println("Inside before");
		driver = new ChromeDriver();
        //driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@After
	public void CloseDriver() throws Exception {
		System.out.println("Inside After");
		Thread.sleep(3000);
		driver.close();
	}
}
	



