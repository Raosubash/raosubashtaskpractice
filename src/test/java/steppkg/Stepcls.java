package steppkg;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basepkg.Basecls;
import io.cucumber.java.en.*;
import pompkg.pomcls;
import pompkg.pomcls2;

public class Stepcls extends Basecls {
	
	pomcls pom = new pomcls();
	pomcls2 pom2 = new pomcls2();
	//JavascriptExecutor js = (JavascriptExecutor)driver;

	@Given("user launch browser and navigates to url")
	public void user_launch_browser_and_navigates_to_url() {
		//launch();
		//maximize();
		geturl("https://automationexercise.com/");
	  
	}
	@Then("homepage should be visible")
	public void homepage_should_be_visible() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed());
	    
	}
	@When("user click on signup button")
	public void user_click_on_signup_button() {
		
		driver.findElement(pom.signup).click();
			  
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String name, String email) {
		
		driver.findElement(pom.name).sendKeys(name);
		driver.findElement(pom.email).sendKeys(email);
	   
	}
	@Then("clicks signup button")
	public void clicks_signup_button() {
		WebElement sgnup = driver.findElement(pom.signupbtn);
		clickele(sgnup);
	   
	}
	@Then("verify that enter account information is visible")
	public void verify_that_enter_account_information_is_visible() {
		
		Assert.assertTrue(driver.findElement(pom.acctinfowrning).isDisplayed());
	  
	}
	@Then("fills the details {string},{string},{string},{string}")
	public void fills_the_details(String passwd, String days, String month, String year) {
		
		driver.findElement(pom.title).click();
		driver.findElement(pom.passwd).sendKeys(passwd);
		driver.findElement(pom.days).sendKeys(days);
		driver.findElement(pom.month).sendKeys(month);
		driver.findElement(pom.year).sendKeys(year);
		   
	}
	@Then("selects the checkboxes")
	public void selects_the_checkboxes() {
		implicitwait();
		WebElement nletr=driver.findElement(pom.newsleter);
		WebElement offer=driver.findElement(pom.offers);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",nletr);
		js.executeScript("arguments[0].click();",offer);
	
		//driver.findElement(pom.offers).click();
	    
	}
	@Then("fills the {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void fills_the(String fname, String lname, String cmpny, String addrs, String country, String state, String city, String zip, String mobile) {
	    
		driver.findElement(pom.firstname).sendKeys(fname);
		driver.findElement(pom.lastname).sendKeys(lname);
		driver.findElement(pom.company).sendKeys(cmpny);
		driver.findElement(pom.address).sendKeys(addrs);
		driver.findElement(pom.country).sendKeys(country);
		driver.findElement(pom.state).sendKeys(state);
		driver.findElement(pom.city).sendKeys(city);
		driver.findElement(pom.zipcode).sendKeys(zip);
		driver.findElement(pom.mobileno).sendKeys(mobile);
		
		
	}
	@Then("clicks create account button")
	public void clicks_create_account_button() {
		
		WebElement createbtn =driver.findElement(pom.acctcreate);
		implicitwait();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", createbtn);
	   
	}
	@Then("verifies that account created is visible")
	public void verifies_that_account_created_is_visible() {
	  Assert.assertTrue(driver.findElement(pom.acctcreated).isDisplayed());
	}
	@Then("clicks continue button")
	public void clicks_continue_button() {
		
		WebElement continuebtn = driver.findElement(pom.continued);
		implicitwait();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", continuebtn);
		
	   
	}
	@Then("verifies logged in as username is visible")
	public void verifies_logged_in_as_username_is_visible() {
		Assert.assertTrue(driver.findElement(pom.loggedinwrning).isDisplayed());
	   
	}
	
	@When("verifies the login to your account is visible")
	public void verifies_the_login_to_your_account_is_visible() {
		
		Assert.assertTrue(driver.findElement(pom.logintext).isDisplayed());
	    
	}
	@When("enters the following valid creds")
	public void enters_the_following_valid_creds(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		String uname=data.get(0).get("username");
		String pwd = data.get(0).get("password");
		driver.findElement(pom.loginemail).sendKeys(uname);
		driver.findElement(pom.loginpwd).sendKeys(pwd);
		
	    
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
		
		WebElement lgnbtn = driver.findElement(pom.loginbtn);
		clickele(lgnbtn);
	  
	}
	
	@When("click logout button")
	public void click_logout_button() {
		WebElement lgout = driver.findElement(pom.logout);
		clickele(lgout);
	   
	}
	
	@Then("clicks on contact us button")
	public void clicks_on_contact_us_button() {
		
		WebElement contacts = driver.findElement(pom.contact);
		clickele(contacts);
	  
	}

	@Then("verifies get in touch is visible")
	public void verifies_get_in_touch_is_visible() {
		
		Assert.assertTrue(driver.findElement(pom.gettouchtext).isDisplayed());
	   
	}

	@Then("enters name as {string},email as {string}, subject as {string},message as {string}")
	public void enters_name_as_email_as_subject_as_message_as(String name, String email, String subject, String message) {
	 
		driver.findElement(pom.ctname).sendKeys(name);
		implicitwait();
		driver.findElement(pom.ctmail).sendKeys(email);
		implicitwait();
		driver.findElement(pom.subject).sendKeys(subject);
		implicitwait();
		driver.findElement(pom.msg).sendKeys(message);
		implicitwait();
		
	}

	@Then("uploads file")
	public void uploads_file() throws InterruptedException {
		WebElement upld = driver.findElement(pom.upload);
		upld.sendKeys("C:\\Users\\Happy\\Downloads\\Dinesh_Rao_Documents\\Dinesh_Rao_Resume.doc");
		Thread.sleep(3000);;
	    
	}

	@Then("clicks submit and ok button")
	public void clicks_submit_and_ok_button() {
		WebElement submt = driver.findElement(pom.submit);
		clickele(submt);
		implicitwait();
		Alert al = driver.switchTo().alert();
		al.accept();
		
	   
	}

	@Then("verifies {string} is visible")
	public void verifies_is_visible(String string) {
		
		Assert.assertTrue(driver.findElement(pom.status).isDisplayed());
	   
	}

	@Then("click home button")
	public void click_home_button() {
		WebElement home = driver.findElement(pom.homepage);
		clickele(home);
	   
	}
	
	@When("user clicks on product button")
	public void user_clicks_on_product_button() {
		
		WebElement prodt = driver.findElement(pom.products);
		clickele(prodt);
			   
	}
	@When("verifies that navigates to products page")
	public void verifies_that_navigates_to_products_page() {
	  Assert.assertTrue(driver.findElement(pom.allprod).isDisplayed());
	}
	@When("clicks on view product of first product")
	public void clicks_on_view_product_of_first_product() {
		
		WebElement vwprd1 = driver.findElement(pom.viewprd1);
		clickele(vwprd1);
	   
	}
	@When("verifies the details product name,category,price.")
	public void verifies_the_details_product_name_category_price() {
		
		Assert.assertTrue(driver.findElement(pom.bluetopvis).isDisplayed());
		Assert.assertTrue(driver.findElement(pom.categoryvis).isDisplayed());
		Assert.assertTrue(driver.findElement(pom.pricevis).isDisplayed());
	   
	}
	
	@When("enters product name in search filed and clicks search button")
	public void enters_product_name_in_search_filed_and_clicks_search_button() {
		driver.findElement(pom.searchprd).sendKeys("jean");
		WebElement btn = driver.findElement(pom.searchbtn);
		clickele(btn);
	    
	}
	@When("verifies searched products is visible")
	public void verifies_searched_products_is_visible() {
		
		Assert.assertTrue(driver.findElement(pom.srchdprd).isDisplayed());
	   
	}
	@When("also verifies all products related to search are visible")
	public void also_verifies_all_products_related_to_search_are_visible() throws IOException {
		
		Assert.assertTrue(driver.findElement(pom.srchtxt).isDisplayed());
		shot("srch");
	    
	}
	
	@When("user adds product to cart")
	public void user_adds_product_to_cart() throws InterruptedException {
		WebElement wmn = driver.findElement(pom.women);
		scroll(wmn);
		WebElement addcrt1 = driver.findElement(pom.addcart1);
		moveele(addcrt1);
		Thread.sleep(3000);
		clickele(addcrt1);
		WebElement ctnueshp = driver.findElement(pom.continueshp);
		clickele(ctnueshp);
		implicitwait();
		WebElement addcrt2 = driver.findElement(pom.addcart2);
		moveele(addcrt2);
		Thread.sleep(3000);
		clickele(addcrt2);
		clickele(ctnueshp);
	    implicitwait();
		WebElement addcrt3 = driver.findElement(pom.addcart3);
		moveele(addcrt3);
		Thread.sleep(3000);
		clickele(addcrt3);
		clickele(ctnueshp);
		implicitwait();
	
	    
	}
	@Then("clicks cart button")
	public void clicks_cart_button() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement crt = driver.findElement(pom.cartbtn);
		clickele(crt);
	   
	}
	@Then("verifies cart page is displayed")
	public void verifies_cart_page_is_displayed() {
		Assert.assertTrue(driver.findElement(pom.shopcart).isDisplayed());
	    
	}
	@Then("proceeds to checkout")
	public void proceeds_to_checkout() {
		WebElement prcdchk = driver.findElement(pom.prcdchkout);
		clickele(prcdchk);
	    
	}
	@Then("clicks register\\/login button")
	public void clicks_register_login_button() {
	    WebElement rgster = driver.findElement(pom.rgstr);
	    clickele(rgster);
	}
	@Then("user enters name and Email address")
	public void user_enters_name_and_email_address() throws InterruptedException {
		
		driver.findElement(pom.name).sendKeys("apple");
		driver.findElement(pom.email).sendKeys("applesubash@gmail.com");
		implicitwait();
			    
	}
	@Then("fills the details password,day,month,year")
	public void fills_the_details_password_day_month_year() {
		WebElement ttle = driver.findElement(pom.title1);
		clickele(ttle);
		driver.findElement(pom.passwd).sendKeys("Sprisum@5678");
		driver.findElement(pom.days).sendKeys("12");
		driver.findElement(pom.month).sendKeys("August");
		driver.findElement(pom.year).sendKeys("1990");
		WebElement nwsltr = driver.findElement(pom.newsleter);
		clickele(nwsltr);
		WebElement offer = driver.findElement(pom.offers);
		clickele(offer);
	    
	}
	@Then("fills the mandatory details")
	public void fills_the_mandatory_details() {
		
		driver.findElement(pom.firstname).sendKeys("drfggh");
		driver.findElement(pom.lastname).sendKeys("dewadf");
		driver.findElement(pom.company).sendKeys("xxx");
		driver.findElement(pom.address).sendKeys("No.3 dfgbnb");
		driver.findElement(pom.country).sendKeys("India");
		driver.findElement(pom.state).sendKeys("tn");
		driver.findElement(pom.city).sendKeys("chn");
		driver.findElement(pom.zipcode).sendKeys("600011");
		driver.findElement(pom.mobileno).sendKeys("789024566");
		
		
	   
	}
	
	@Then("clicks the cart button")
	public void clicks_the_cart_button() {
		WebElement crtbtn = driver.findElement(pom.cartbtn);
		clickele(crtbtn);
		
	   
	}
	@Then("verifes address details and review order")
	public void verifes_address_details_and_review_order() {
		
		Assert.assertTrue(driver.findElement(pom.delvaddr).isDisplayed());
		
		WebElement address = driver.findElement(pom2.addressname);
		boolean addressname = displaystatus(address);
		assert addressname;
		
		WebElement billing = driver.findElement(pom2.billingaddress);
		boolean billingadr = displaystatus(billing);
		assert billingadr;
	   
	}
	@Then("enters description in comment area and clicks place order")
	public void enters_description_in_comment_area_and_clicks_place_order() {
		
		driver.findElement(pom.textarea).sendKeys("hi");
		WebElement plceorder = driver.findElement(pom.placeorder);
		clickele(plceorder);
	   
	}
	@Then("enters payment details")
	public void enters_payment_details() {
		driver.findElement(pom.cardname).sendKeys("fresqyhj");
		driver.findElement(pom.crdno).sendKeys("345679087");
		driver.findElement(pom.cvv).sendKeys("456");
		driver.findElement(pom.mm).sendKeys("09");
		driver.findElement(pom.yyyy).sendKeys("1997");
		implicitwait();
		
	    
	}
	@Then("clicks pay and confirm order button")
	public void clicks_pay_and_confirm_order_button() {
	    
		WebElement pay = driver.findElement(pom.payorder);
		clickele(pay);
		implicitwait();
	}
	
	@Then("clicks delete account button")
	public void clicks_delete_account_button() {
		
		WebElement accdel = driver.findElement(pom.delacc);
		clickele(accdel);
		Assert.assertTrue(driver.findElement(pom.accdltd).isDisplayed());
	    
	}
	
	@When("add the searched product to cart")
	public void add_the_searched_product_to_cart() {
		
		WebElement wmn = driver.findElement(pom.women);
		scroll(wmn);
		WebElement rglejean = driver.findElement(pom2.regularfitjean);
		moveele(rglejean);
		implicitwait();
		clickele(rglejean);
		WebElement ctnueshp = driver.findElement(pom.continueshp);
		clickele(ctnueshp);
		implicitwait();
		WebElement strchjean = driver.findElement(pom2.stretchedjeans);
		moveele(strchjean);
		implicitwait();
		clickele(strchjean);
		clickele(ctnueshp);
		implicitwait();
		WebElement slimjean = driver.findElement(pom2.slimfitjean);
		moveele(slimjean);
		implicitwait();
		clickele(slimjean);
		clickele(ctnueshp);
		implicitwait();
		
	   
	}
	@Then("verifies products are visible in cart after login as well.")
	public void verifies_products_are_visible_in_cart_after_login_as_well() {
		
		String expmsg = "Men > Jeans";
		String actmsg=driver.findElement(pom2.menjeans).getText();
		Assert.assertEquals(expmsg, actmsg);
	   
	}
	
	@Then("clicks on view product of any product")
	public void clicks_on_view_product_of_any_product() {
		
		WebElement viewproduct = driver.findElement(pom2.viewprd);
		clickele(viewproduct);
		
	    
	}
	@Then("verifies product detail is opened")
	public void verifies_product_detail_is_opened() {
		
		Assert.assertTrue(driver.findElement(pom2.category).isDisplayed());
	    
	}
	@Then("increase qty to {int}")
	public void increase_qty_to(Integer int1) {
		WebElement qty = driver.findElement(pom2.quantity);
		clickele(qty);
		implicitwait();
		clearele(qty);
		implicitwait();
		qty.sendKeys("4");
		implicitwait();
	    
	}
	@Then("clicks the add to cart button")
	public void clicks_the_add_to_cart_button() {
		
		WebElement addtocart = driver.findElement(pom2.addcart);
		clickele(addtocart);
		implicitwait();
	    
	}
	@Then("clicks view cart button")
	public void clicks_view_cart_button() throws InterruptedException {
		//implicitwait();
		WebElement viewcart = driver.findElement(pom2.viewcrt);
		Thread.sleep(5000);
		clickele(viewcart);
		Thread.sleep(3000);
	   
	}
	@Then("verifies the product is displayed in cart page with the exact quantity")
	public void verifies_the_product_is_displayed_in_cart_page_with_the_exact_quantity() {
		
		Assert.assertTrue(driver.findElement(pom2.qntymsg).isDisplayed());
	    
	}
	
	@Then("scroll to bottom of the page")
	public void scroll_to_bottom_of_the_page() {
		WebElement subscription = driver.findElement(pom2.subcriptionincart);
		scroll(subscription);
	    
	}
	@Then("verify subscription text is visible")
	public void verify_subscription_text_is_visible() {
		
		Assert.assertTrue(driver.findElement(pom2.subcriptionincart).isDisplayed());
	   
	}
	@Then("enters email address and clicks arrow button")
	public void enters_email_address_and_clicks_arrow_button() {
		WebElement subscribemail = driver.findElement(pom2.subscriblemailincart);
		clickele(subscribemail);
		implicitwait();
		subscribemail.sendKeys("rao.subash900812@gmail.com");
		WebElement arrowbtn = driver.findElement(pom2.rightarrowbtn);
		clickele(arrowbtn);
		implicitwait();
	   
	}
	@Then("verifies the success messgae {string} is visible")
	public void verifies_the_success_messgae_is_visible(String string) {
	   Assert.assertTrue(driver.findElement(pom2.subscribesuccessmsg).isDisplayed());
	   
	}

	
	@Then("user adds product to the cart")
	public void user_adds_product_to_the_cart() throws InterruptedException {
		
		WebElement wmn = driver.findElement(pom.women);
		scroll(wmn);
		WebElement addcrt1 = driver.findElement(pom.addcart1);
		moveele(addcrt1);
		Thread.sleep(3000);
		clickele(addcrt1);
		WebElement ctnueshp = driver.findElement(pom.continueshp);
		clickele(ctnueshp);
		implicitwait();
		WebElement addcrt2 = driver.findElement(pom.addcart2);
		moveele(addcrt2);
		Thread.sleep(3000);
		clickele(addcrt2);
		clickele(ctnueshp);
	    implicitwait();
		WebElement addcrt3 = driver.findElement(pom.addcart3);
		moveele(addcrt3);
		Thread.sleep(3000);
		clickele(addcrt3);
		clickele(ctnueshp);
		implicitwait();
	   
	}
	@Then("removes the product from the cart")
	public void removes_the_product_from_the_cart() {
		
		WebElement remove1 = driver.findElement(pom2.rmve1);
		clickele(remove1);
		WebElement remove2 = driver.findElement(pom2.rmve2);
		clickele(remove2);
		WebElement remove3 = driver.findElement(pom2.rmve3);
		clickele(remove3);
		implicitwait();
		
	    
	}
	@Then("verifies the product is removed from the cart")
	public void verifies_the_product_is_removed_from_the_cart() {
		
		
		
		    
	}
	
	@Then("verifies message user already exists")
	public void verifies_message_user_already_exists() {
	    
		WebElement existingmsg = driver.findElement(pom2.existingmail);
		String act = retrievetext(existingmsg);
		String exp= "Email Address already exist!";
		Assert.assertEquals(exp, act);
		
	}
	
	@Then("scroll to recommended items")
	public void scrollToRecommendedItems() {
		WebElement recommendeditm = driver.findElement(pom2.recomditm);
		scroll(recommendeditm);
	    
	}
	@Then("verify recommended items are available")
	public void verifyRecommendedItemsAreAvailable() {
		WebElement recommendeditm = driver.findElement(pom2.recomditm);
		boolean b = displaystatus(recommendeditm);
		assert b;
	    
	}
	@Then("add product to cart")
	public void addProductToCart() {
		
		WebElement recomditm = driver.findElement(pom2.recomditmcart);
		clickele(recomditm);
		implicitwait();
		
	    
	}
	@Then("click view cart button for the recommended product")
	public void clickViewCartButtonForTheRecommendedProduct() throws InterruptedException {
	   
		WebElement viewcart = driver.findElement(pom.viewcart);
		clickele(viewcart);
		Thread.sleep(10000);
		}
	@Then("verify product got displayed in cart page")
	public void verifyProductGotDisplayedInCartPage() throws InterruptedException {
		
		Thread.sleep(8000);
		implicitwait();
		WebElement msg = driver.findElement(pom2.recomdprditmmsg);
		boolean itmmsg=displaystatus(msg);
		assert itmmsg;
	
	}
	
	@Then("scroll unitl subscription is visible")
	public void scrollUnitlSubscriptionIsVisible() {
		WebElement subscription = driver.findElement(pom2.subcriptionincart);
		scroll(subscription);
		implicitwait();
	    
	}
	@Then("click on arrow available  at the bottom right")
	public void clickOnArrowAvailableAtTheBottomRight() {
		
		WebElement arrowup = driver.findElement(pom2.angleup);
		clickele(arrowup);
		implicitwait();
	    
	}
	@Then("verify the page is scrolled up and {string} is visible")
	public void verifyThePageIsScrolledUpAndIsVisible(String string) {
	   WebElement message = driver.findElement(pom2.textmsg);
	   boolean msg= displaystatus(message);
	   assert msg;
	}
	
	@Then("scroll to top")
	public void scrollToTop() {
	    
		implicitwait();
		scrolltop();
	}
	
	@Then("scroll and click women category")
	public void scrollAndClickWomenCategory() {
		WebElement wmn = driver.findElement(pom.women);
		scroll(wmn);
		clickele(wmn);
	    
	}
	@Then("click tops")
	public void clickTops() {
		
		WebElement tops = driver.findElement(pom2.tops);
		clickele(tops);
		implicitwait();
		
	    
	}
	@Then("verify that category page is displayed")
	public void verifyThatCategoryPageIsDisplayed() {
		
		WebElement topproduct = driver.findElement(pom2.topsproduct);
		boolean product = displaystatus(topproduct);
		assert product;
	    
	}
	@Then("again click on men category available on left side bar")
	public void againClickOnMenCategoryAvailableOnLeftSideBar() throws IOException {
		WebElement men = driver.findElement(pom2.men);
		clickele(men);
		WebElement jeans = driver.findElement(pom2.jeans);
		clickele(jeans);
		shot("image");
	   
	}
	@Then("verify user is navigated to that category page")
	public void verifyUserIsNavigatedToThatCategoryPage() {
		
		WebElement jeanproducts = driver.findElement(pom2.jeanproducts);
		boolean product2=displaystatus(jeanproducts);
		assert product2;
	  
	}
	
	@Then("user clicks on the product button")
	public void userClicksOnTheProductButton() {
		WebElement products = driver.findElement(pom.products);
		clickele(products);
		implicitwait();
	   
	}
	@Then("verifies brands are visible on the left side of the page")
	public void verifiesBrandsAreVisibleOnTheLeftSideOfThePage() {
		WebElement brands = driver.findElement(pom2.brands);
		scroll(brands);
		boolean brand = displaystatus(brands);
		
	    
	}
	@Then("clicks on any brand name")
	public void clicksOnAnyBrandName() {
		
		WebElement polo = driver.findElement(pom2.polo);
		clickele(polo);
		implicitwait();
	    
	}
	@Then("verify that brand page is visible")
	public void verifyThatBrandPageIsVisible() throws IOException {
		
		WebElement polobrandmsg = driver.findElement(pom2.polobrandmsg);
		boolean polobrand= displaystatus(polobrandmsg);
		assert polobrand;
		implicitwait();
		shot("polobrand");
	    
	}
	@Then("again clicks on any brand name")
	public void againClicksOnAnyBrandName() {
		
		WebElement babyhug = driver.findElement(pom2.babyhug);
		clickele(babyhug);
		implicitwait();
	    
	}
	@Then("verify that specific brand page is visible")
	public void verifyThatSpecificBrandPageIsVisible() throws IOException {
		
		WebElement babyhugmsg = driver.findElement(pom2.babyhugmsg);
		boolean babyhugbrand= displaystatus(babyhugmsg);
		assert babyhugbrand;
		implicitwait();
		shot("babyhugbrand");
	    
	}
	
	
	@When("clicks on view product buton")
	public void clicksOnViewProductButon() {
		
		WebElement graphic = driver.findElement(pom2.graphic);
		scroll(graphic);
		WebElement products = driver.findElement(pom2.viewprd43);
		clickele(products);
		implicitwait();
	}
	@When("verifies write your review is visible")
	public void verifiesWriteYourReviewIsVisible() {
		
		WebElement writereview = driver.findElement(pom2.writereview);
		boolean writervw = displaystatus(writereview);
		assert writervw;
	    
	}
	@When("enters the following details")
	public void entersTheFollowingDetails(io.cucumber.datatable.DataTable data) {
		
		implicitwait();
				
		List<List<String>> datarow = data.asLists();
		WebElement name = driver.findElement(pom2.name);
		String namevalue = datarow.get(0).get(0);
		entertext(name, namevalue);
		//name.sendKeys(namevalue);
		WebElement mail = driver.findElement(pom2.mail);
		String mailvalue=datarow.get(0).get(1);
		entertext(mail, mailvalue);
		WebElement reviewcmnt = driver.findElement(pom2.reviewcmnt);
		String reviewcommentvale = datarow.get(0).get(2);
		entertext(reviewcmnt, reviewcommentvale);
		
	    
	}
	@Then("clicks submit button")
	public void clicksSubmitButton() {
		
		WebElement submitreview = driver.findElement(pom2.submitreview);
		clickele(submitreview);
	    
	}
	@Then("verifies message {string} is visible")
	public void verifiesMessageIsVisible(String string) {
		
		implicitwait();
		WebElement msg = driver.findElement(pom2.reviewmsg);
		boolean rvwmsg =displaystatus(msg);
		assert rvwmsg;
		   
	}
	
//	@Then("verifies order message")
//	public void verifiesOrderMessage() {
//		
//		implicitwait();
//		WebElement ordermsg = driver.findElement(pom2.ordermsg);
//		implicitwait();
//		boolean msg = displaystatus(ordermsg);
//		implicitwait();
//		assert msg;
//		String actmsg = ordermsg.getText();
//		String expmsg = "Your order has been placed successfully!";
//		Assert.assertEquals(expmsg, actmsg);
//		
	    
	//}
	
	@Then("clicks download invoice button")
	public void clicksDownloadInvoiceButton() {
		WebElement download = driver.findElement(pom2.downloadinvoice);
		clickele(download);
		
		String downloadpath = "C:\\Users\\Happy\\Downloads";
		String downloadfile = "invoice.txt";
		
		File file = new File(downloadpath +"\\"+ downloadfile);
		
		if(file.exists())
	    
		{
			System.out.println("File downloaded successfully");
		}
		else
		{
			System.out.println("invoice not downloaded");
		}
	}
	
	@Then("fills email as {string},password as {string}")
	public void fillsEmailAsPasswordAs(String name, String pwd) {
		
		WebElement loginmail = driver.findElement(pom.loginemail);	
		entertext(loginmail, name);
		WebElement loginpwd = driver.findElement(pom.loginpwd);
		entertext(loginpwd, pwd);
		   
	}
	@Then("clicks login button")
	public void clicksLoginButton() {
		
		WebElement loginbtn = driver.findElement(pom.loginbtn);
		clickele(loginbtn);
	    
	}
	@Then("verifies message {string}")
	public void verifiesMessage(String string) {
		WebElement delacc = driver.findElement(pom2.accountdelete);
		boolean accdel=displaystatus(delacc);
		assert accdel;
	    
	}












}









	

