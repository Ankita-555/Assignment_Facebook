package Facebooktest_Class;

import org.testng.annotations.Test;

public class LoginTest_Class extends BaseTestClass {
	
	@Test(priority = 1)
	public void loginWithInvalidCredentials() throws InterruptedException  {
		
		lp.logintopage();
		
	}
	
	@Test(priority = 2)
	public void postmsg() {
		
		lp.createPost();
	}
	

}
