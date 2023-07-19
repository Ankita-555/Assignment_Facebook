package Facebooktest_Class;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Facebookscript_Class.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
String path;
WebDriver driver;
FileInputStream fis;
Properties prop;
Login_Page lp;
	
	
	
	@BeforeSuite
	public void initBrowser() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disabled-notification");
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);
		
		path = System.getProperty("user.dir")+"//config.properties";
		fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
		driver.get(prop.getProperty("testsiteurl"));
		}
	
	@BeforeClass
	
	public void createobject() throws IOException {
		
		 lp = new Login_Page(driver);
		
	}
}