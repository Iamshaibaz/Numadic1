package testScripts;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.numadic.genericUtils.BaseClass;
import com.numadic.genericUtils.WebDriverUtility;

import objectRepository.EngineeringPage;
import objectRepository.HomePage;
import objectRepository.QAEngineerPage;

public class Tc1 extends BaseClass {
	@Test
	public void tc() throws Throwable   {
		
	
        //Launching browser from base class	
    	//This is Our HomePage for Numadic website
		HomePage hmpg = new HomePage(driver);
	    
		//Verify JOIN OUR CREW
		String actualJoinOurCrew = hmpg.getJoinOurCrewText().getText();
		String expectJoinOurCrew = eLib.getExelData("Sheet1",2 ,3 );
		Assert.assertEquals(expectJoinOurCrew, actualJoinOurCrew);
	  
		//Click on ALL Button
		hmpg.getAllBtn().click();
	 
		// Click on Engineering Button
		hmpg.getEngineeringBtn().click();
	
		//Navigating to Engineering Page
		EngineeringPage egpg = new EngineeringPage(driver);
		//Click on QA Engineer Btn
		egpg.getQAEngineerBtn().click();
	
		String actualTitle = wLib.getCurrentTitle(driver);
		String expectedTitle = eLib.getExelData("Sheet1",5 ,3 );
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		QAEngineerPage qapg = new QAEngineerPage(driver);
		//Asserted I'm Interested button clickable or not
		boolean actualEnabledBtn = qapg.isEnabled(driver);
		Assert.assertEquals(true, actualEnabledBtn);
		
		//Click on I'm Interested Button
		qapg.getImInterestedBtn().click();
		
		
		
		
	
		
	
	}

}
