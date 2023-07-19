package Facebookscript_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page extends BaseClass{
	WebDriver driver;
	WebDriverWait wait;
	Actions act;
	JavascriptExecutor js;

	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement password;
	
	@FindBy(xpath="//*[@name='login']")
	private WebElement login;
	
	@FindBy(xpath ="//div[@class='xi81zsa x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe']//span")
	private WebElement textArea;
	
	@FindBy(xpath = "(//*[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']")
	private WebElement postArea;
	
	
	
	public Login_Page(WebDriver driver) throws IOException{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,30);
	    act = new Actions(driver);
	    js = (JavascriptExecutor)driver;
		
			
	}
	
	public void logintopage() throws InterruptedException  {
			
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
		Thread.sleep(2000);
		email.clear();
			
	}
		public void createPost() {
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='xi81zsa x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe']//span")));
			js.executeScript("arguments[0].click();", textArea);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']"))).sendKeys("Hello World");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='x6s0dn4 x78zum5 xl56j7k x1608yet xljgi0e x1e0frkt'])[6]"))).click();
			
			
		}
}