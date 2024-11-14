package PomDemo;


import org.apache.commons.io.*;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;
import io.cucumber.java.Before;



public class ActualTest {
	
WebDriver driver = new ChromeDriver();

	@Before
	void setup()
	{
		//driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	void test()
	{
		//driver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.sendvaluesinusername("abcdefghuquququq@gmail.com");
		lp.sendvaluesinpassword("aaaa");
		lp.clickonloginbutton();
		//Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}

}
