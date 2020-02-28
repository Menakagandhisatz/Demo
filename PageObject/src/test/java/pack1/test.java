package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equals("Internet Explorer"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\menaka.gandhi\\Desktop\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			//driver=new FirefoxDriver();
			driver = new InternetExplorerDriver();
			
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\LKM\\Cucumber\\Drivers\\Drivers\\chromedriver.exe");
	        driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
