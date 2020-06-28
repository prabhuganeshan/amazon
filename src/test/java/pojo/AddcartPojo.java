package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.utili;

public class AddcartPojo extends utili{
	public AddcartPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="add-to-cart-button")
	private WebElement addcart;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[1]")
	private WebElement cart2;
	
	@FindBy(name="submit.delete.Ccda20d45-608b-4971-b0d0-fdbce003dd87")
	private WebElement deletcart;

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getCart2() {
		return cart2;
	}

	public WebElement getDeletcart() {
		return deletcart;
	}
}
