package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.numadic.genericUtils.BaseClass;


public class HomePage extends BaseClass {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[text()='All']")
	private WebElement AllBtn;

	public WebElement getAllBtn() {
		return AllBtn;
	}
	@FindBy(xpath = "//lyte-drop-item[@data-value='Engineering']")
	private WebElement EngineeringBtn;
	
	public WebElement getEngineeringBtn() {
		return EngineeringBtn;
	}
	
	@FindBy(xpath = "//h2[text()='JOIN OUR CREW']")
	private WebElement JoinOurCrewText;
	
	public WebElement getJoinOurCrewText() {
		return JoinOurCrewText;
	}
	
	
}
