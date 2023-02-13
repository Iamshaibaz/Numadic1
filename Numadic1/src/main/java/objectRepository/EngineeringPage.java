package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.numadic.genericUtils.BaseClass;

public class EngineeringPage extends BaseClass{
	public EngineeringPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@data-zrqa='cw-job1-name2']")
	private WebElement QAEngineerBtn;
	
	public WebElement getQAEngineerBtn() {
		return QAEngineerBtn;
	}
	
	
}
