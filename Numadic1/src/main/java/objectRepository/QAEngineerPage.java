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
	
	
	
	//Form Fields below
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000003217\"]/div/lyte-dropdown/div[1]/lyte-drop-button/span")
	private WebElement GenderDrpDwn;
	
	public WebElement getGenderDrpDwn() {
		return GenderDrpDwn;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000003149\"]/div/lyte-input/div/input")
	private WebElement FirstNameTxt;
	
	public WebElement getFirstNameTxt() {
		return FirstNameTxt;
	}
	
	
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000003151\"]/div/lyte-input/div/input")
	private WebElement LastNameTxt;
	
	public WebElement getLastNameTxt() {
		return LastNameTxt;
	}

	@FindBy(xpath = "//*[@id=\"rec-form_53264000000003155\"]/div/lyte-input/div/input")
	private WebElement EmailTxt;
	
	public WebElement getEmailTxt() {
		return EmailTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000003161\"]/div/div/lyte-input/div/input")
	private WebElement MobileTxt;
	
	public WebElement getMobileTxt() {
		return MobileTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000003169\"]/div/lyte-input/div/input")
	private WebElement StreetTxt;
	
	public WebElement getStreetTxt() {
		return StreetTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000003181\"]/div/lyte-input/div/input")
	private WebElement CurrentEmployerTxt ;
	
	public WebElement getCurrentEmployerTxt() {
		return CurrentEmployerTxt;
	}
	@FindBy(xpath = "//*[@id=\"addSkills\"]")
	private WebElement SkillSetTxt;
	
	public WebElement getSkillSetTxt() {
		return SkillSetTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000285107\"]/div/lyte-input/div/input")
	private WebElement CurrentCtcTxt;
	
	public WebElement getCurrentCtcTxt() {
		return CurrentCtcTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000285115\"]/div/lyte-input/div/input")
	private WebElement ExpectedCtcTxt;
	
	public WebElement getExpectedCtcTxt() {
		return ExpectedCtcTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000279001\"]/div/lyte-input/div/input")
	private WebElement NoticePeriodTxt;
	
	public WebElement getNoticePeriodTxt() {
		return NoticePeriodTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000279009\"]/div/lyte-input/div/input")
	private WebElement ReasonForChangeTxt;
	
	public WebElement getReasonForChangeTxt() {
		return ReasonForChangeTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_53264000000279013\"]/div/lyte-input/div/input")
	private WebElement WhyJoinNumadicTxt;
	
	public WebElement getWhyJoinNumadicTxt() {
		return WhyJoinNumadicTxt;
	}
	@FindBy(xpath = "//*[@id=\"rec-form_111222333445\"]/div/lyte-input/div/input")
	private WebElement LinkedInTxt;
	
	public WebElement getLinkedInTxt() {
		return LinkedInTxt;
	}
	public boolean isEnabled(WebDriver driver) {
		return ImInterestedBtn.isEnabled();
	}
	public void sendingFormDetails(String firstname,String lastname,String email, String mobile,String currentemployer,String skillset, String currentctc, String expectedctc,String reasonforchange, String whyjoinnumadic, String linkedin) {
		FirstNameTxt.sendKeys(firstname);
		LastNameTxt.sendKeys(lastname);
		EmailTxt.sendKeys(email);
		MobileTxt.sendKeys(mobile);
		CurrentEmployerTxt.sendKeys(currentemployer);
		SkillSetTxt.sendKeys(skillset);
		CurrentCtcTxt.sendKeys(currentctc);
		ExpectedCtcTxt.sendKeys(expectedctc);
		ReasonForChangeTxt.sendKeys(reasonforchange);
		WhyJoinNumadicTxt.sendKeys(whyjoinnumadic);
		LinkedInTxt.sendKeys(linkedin);
		
	}
	public void selectState(WebDriver driver)
	{
		getGenderDrpDwn().click();
		wLib.SelectOption(getGenderDrpDwn(), 2);
	}
}
