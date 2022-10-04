package SampleTestJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests{
	
	@Test
	public void logindetailswithvaliedcredintials() {
		
		System.out.println("I am in jenkins project");
		Assert.assertTrue(true);
		System.out.println("I am in login test class");
			
	}
	
@Test	
public void logindetailswithinvaliedcredintials() {
		
		System.out.println("username");
		Assert.assertTrue(false);
		System.out.println("password");
			
	}
@Test	
public void logindetailswithnovaliedcredintials() {
	
	System.out.println("worng username");
	Assert.assertTrue(true);
	System.out.println("worg password");
		
}	
	
	
	
	
	
	
	
}
