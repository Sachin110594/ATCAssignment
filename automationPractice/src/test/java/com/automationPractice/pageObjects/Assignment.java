package com.automationPractice.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	WebDriver ldriver;
	
	public Assignment(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(className="login")
	@CacheLookup
	WebElement clicktoSignIn;
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="passwd")
	@CacheLookup
	WebElement txtUserPass;
	
	@FindBy(name="SubmitLogin")
	@CacheLookup
	WebElement txtUserSubmit;
	
	@FindBy(xpath="//*[@class=\"icon-building\"]")
	WebElement clickMyAddress;
	
	@FindBy(xpath="//*[text()=\"Add a new address\"]")
	WebElement addNewAddress;
	
	@FindBy(name="company")
	WebElement company;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="id_state")
	WebElement state;
	
	@FindBy(name="postcode")
	WebElement postcode;
	
	@FindBy(name="phone")
	WebElement homePhone;
	
	@FindBy(name="phone_mobile")
	WebElement mobilePhone;
	
	@FindBy(name="other")
	WebElement Additional;
	
	@FindBy(name="alias")
	WebElement addressTitle;
	
	@FindBy(name="submitAddress")
	WebElement submitAddress;
	
	@FindBy(xpath="//*[text()=\"Women\"]")
	WebElement movetoWomen;
	
	@FindBy(className="icon-th-list")
	WebElement list;
	
	@FindBy(className="//*[@class=\"product_list row list\"]//*[@class=\"ajax_block_product first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line col-xs-12\"]/div/div/div[1]")
	WebElement clickonFirst;
	
	@FindBy(className="icon-plus")
	WebElement quantity;
	
	@FindBy(name="group_1")
	WebElement size;
	
	@FindBy(name="Blue")
	WebElement color;
	
	@FindBy(name="Submit")
	WebElement addToCart;
	
	@FindBy(className="continue btn btn-default button exclusive-medium")
	WebElement continueShoping;
	
	@FindBy(className="btn btn-default button button-medium")
	WebElement checkout;
	
	@FindBy(className="button btn btn-default standard-checkout button-medium")
	WebElement proceedToCheckout;
	
	@FindBy(name="processAddress")
	WebElement processAddress;
	
	@FindBy(name="cgv")
	WebElement policy;
	
	@FindBy(name="processCarrier")
	WebElement processCarrier;
	
	@FindBy(xpath="//*[@title=\"Pay by bank wire\"]")
	WebElement bankselect;
	
	@FindBy(xpath="//*[@class=\"button btn btn-default button-medium\"]")
	WebElement confirmOrder;
	
	@FindBy(className="button-exclusive btn btn-default")
	WebElement prevOrder;
	
	@FindBy(className="logout")
	WebElement signout;
	
	public void clicktoSign() {
		clicktoSignIn.click();
	}
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setUserPass(String pass) {
		txtUserPass.sendKeys(pass);
	}
	
	public void setSubmit() {
		txtUserSubmit.click();
	}
	
	public void clickMyAddress() {
		clickMyAddress.click();
	}
	
	public void addNewAddeess() {
		addNewAddress.click();
	}

	public void setCompany() {
		company.sendKeys("Abc Technology");
	}
	
	public void setAddress() {
		address.sendKeys("C-101 New Ara");
	}
	
	public void setCity() {
		city.sendKeys("Alabama");
	}
	
	public void setState() {
	Select drop = new Select(state);
	drop.selectByIndex(2);
	}
	
	public void postCode() {
		postcode.sendKeys("85013");
	}
	
	public void homePhone() {
		homePhone.sendKeys("8012343434");
	}
	
	public void mobilePhone() {
		mobilePhone.sendKeys("8501334562");
	}
	
	public void addressTitle() {
		addressTitle.clear();
		addressTitle.sendKeys("New 12w");
	}
	
	public void submitAddress() {
		submitAddress.click();
	}
	
	public void movetoWomen() {
		Actions action = new Actions(ldriver);
		action.moveToElement(movetoWomen).perform();
		WebElement el = ldriver.findElement(By.xpath("//*[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li[1]/ul/li[2]/ul/li[3]/a"));
		el.click();
	}
	
	public void list() {
		list.click();
	}
	
	public void clickonFirst() {
		clickonFirst.click();
	}
	
	public void quantity() {
		quantity.click();
		quantity.click();
		quantity.click();
		quantity.click();
	}
	
	public void size() {
	Select drop1 = new Select(size);
	drop1.selectByValue("L");
	}
	
	public void color() {
		color.click();
	}
	
	public void addToCart() {
		addToCart.click();
	}
	
	public void continueShoping() {
		continueShoping.click();
	}
	
	public void checkout() {
		checkout.click();
	}
	
	public void proceedToCheckout() {
		proceedToCheckout.click();
	}
	
	public void processAddress() {
		processAddress.click();
	}
	
	public void policy() {
		policy.click();
	}
	
	public void processCarrier() {
		processCarrier.click();
	}
	
	public void bankselect() {
		bankselect.click();
	}
	
	public void confirmOrder() {
		confirmOrder.click();
	}
	
	public void prevOrder() {
		prevOrder.click();
	}
	
	public void signout() {
		signout.click();
	}
}
