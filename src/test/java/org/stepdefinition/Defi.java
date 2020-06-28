package org.stepdefinition;

import org.utility.utili;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojo.AddcartPojo;
import pojo.LoginPojo;
import pojo.ProductorderPojo;

public class Defi  extends utili{
	@Given("validate the amazon home page")
	public void validate_the_amazon_home_page() {
		browserLaunch();
		impliwait();
	}

	@When("validate select the product search")
	public void validate_select_the_product_search() {
		LoginPojo lp=new LoginPojo();
		enter(lp.getHellosigin());
		
		fill(lp.getPhoneoremail(), "9003740055");
		enter(lp.getPhoneoremailContinue());
		fill(lp.getPassword(), "prabhu1305");
		enter(lp.getSubmit());
		ProductorderPojo pp=new ProductorderPojo();
		fill(pp.getSearchBar(), "samsung series 4");
		enter(pp.getSearch());
		enter(pp.getFirstResult());
	}

	@When("validate the add to cart")
	public void validate_the_add_to_cart() {
		
	}

	@When("validate  remove the product in cart")
	public void validate_remove_the_product_in_cart() {
		
	}

	@When("validate the place order")
	public void validate_the_place_order() {
		ProductorderPojo pp=new ProductorderPojo();
		pp.getBuyproduct();
		
	}

	@When("validate to create the login")
	public void validate_to_create_the_login() throws Throwable {
		
	}

	@When("validate address field and payment option")
	public void validate_address_field_and_payment_option() throws Throwable {
		ProductorderPojo pp=new ProductorderPojo();
		
		enter(pp.getRupees());
		enter(pp.getRupeesContinue());
		enter(pp.getSkip());
		enter(pp.getSkipContinue());
		
		Thread.sleep(5000);
	}

	@When("validate the remove the product from the cart")
	public void validate_the_remove_the_product_from_the_cart() {
		browserLaunch();
		impliwait();
		LoginPojo lp=new LoginPojo();
		enter(lp.getHellosigin());
		
		fill(lp.getPhoneoremail(), "9003740055");
		enter(lp.getPhoneoremailContinue());
		fill(lp.getPassword(), "prabhu1305");
		enter(lp.getSubmit());
		ProductorderPojo pp=new ProductorderPojo();
		fill(pp.getSearchBar(), "samsung series 4");
		enter(pp.getSearch());
		enter(pp.getFirstResult());
		AddcartPojo ap=new AddcartPojo();
		ap.getAddcart();
		ap.getCart2();
		ap.getDeletcart();
	}

	@Then("quite the page")
	public void quite_the_page() {
		
	}



}
