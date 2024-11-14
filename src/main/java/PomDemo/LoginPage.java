package PomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {
	//Constructor
	
		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}

		//void Loginpage(WebDriver driver)
		//{
			
			
			
			//this keyword points towards towards class variable
		//}
		
		//Locators
		
		By username =By.xpath("//input[@placeholder='ಇಮೇಲ್ ಅಥವಾ ಫೋನ್ ಸಂಖ್ಯೆ']");
		By password =By.xpath("//input[@placeholder='ಪಾಸ್‌ವರ್ಡ್']");
		By login =   By.xpath("//button[@value='1']");
		
		//Actual method
		
		void sendvaluesinusername(String user)
		{
			driver.findElement(username).sendKeys(user);
		}
		
		void sendvaluesinpassword(String pass)
		{
			driver.findElement(password).sendKeys(pass);
		}
		
		void clickonloginbutton()
		{
			driver.findElement(login).click();
		}
		
	}
	
	
	

