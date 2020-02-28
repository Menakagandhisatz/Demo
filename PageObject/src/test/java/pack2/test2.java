package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class test2 {
	WebDriver driver;
//	By username=By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input");
//	By password=By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input");
//	By loginbutton=By.name("login");
	
	
	
	By username=By.id("Email");
	By password=By.name("Password");
	By loginbutton=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	
	public void LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUsername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickonSubmit()
	{
		driver.findElement(loginbutton).click();
	}



}
