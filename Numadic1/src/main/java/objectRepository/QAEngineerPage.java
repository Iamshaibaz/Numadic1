package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.numadic.genericUtils.BaseClass;

public class QAEngineerPage extends BaseClass {
	
	public QAEngineerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//div[@class='cw-detail-header-button']/descendant::lyte-yield[text()=\"I'm interested\"]")
	private WebElement ImInterestedBtn;
	
	public WebElement getImInterestedBtn() {
		return ImInterestedBtn;
	}
	
	public boolean isEnabled(WebDriver driver) {
		return ImInterestedBtn.isEnabled();
	}
	

}
