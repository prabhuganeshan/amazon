package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.utili;

public class ProductorderPojo extends utili {
	public ProductorderPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBar;
	

	@FindBy(xpath="(//input[@class='nav-input'])[1]")
	private WebElement search;
	
	@FindBy(xpath="//span[contains(text(),'SAMSUNG QN32Q50RAFXZA Flat 32\" QLED 4K 32Q50 Series Smart TV')]")
	private WebElement firstResult;
	
	@FindBy(id="buy-now-button")
	private WebElement buyproduct;
	
	@FindBy(id="pp-QdkOn7-66")
	private WebElement rupees;
	
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	private WebElement rupeesContinue;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-radio'])[2]")
	private WebElement skip;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	private WebElement skipContinue;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getFirstResult() {
		return firstResult;
	}

	public WebElement getBuyproduct() {
		return buyproduct;
	}

	public WebElement getRupees() {
		return rupees;
	}

	public WebElement getRupeesContinue() {
		return rupeesContinue;
	}

	public WebElement getSkip() {
		return skip;
	}

	public WebElement getSkipContinue() {
		return skipContinue;
	}


	

}
