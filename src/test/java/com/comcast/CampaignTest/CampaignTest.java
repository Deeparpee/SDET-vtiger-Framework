package com.comcast.CampaignTest;

import org.testng.annotations.Test;

public class CampaignTest {
	@Test(groups="smokeTest")
	public void createCampaignTest()
	{
		System.out.println("Campaign created");
		String someParameter = System.getProperty("browser");
		String url = System.getProperty("url");
		System.out.println(someParameter);
		System.out.println(url);
	}
    @Test(groups="regressionTest")
	public void editCampaignTest()
	{
		System.out.println("Campaign edited");
	}	
}
