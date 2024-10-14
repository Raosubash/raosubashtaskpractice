package pompkg;

import org.openqa.selenium.By;

import basepkg.Basecls;

public class pomcls extends Basecls{
	
	public By signup = By.xpath("//a[normalize-space()='Signup / Login']");
	public By name= By.xpath("//input[@placeholder='Name']");
	public By email = By.xpath("//input[@data-qa='signup-email']");
	public By signupbtn = By.cssSelector("button[data-qa='signup-button']");
	public By acctinfowrning = By.xpath("//b[normalize-space()='Enter Account Information']");
	public By title = By.xpath("//input[@id='id_gender1']");
	public By title1=By.xpath("//div[@id='uniform-id_gender1']");
	public By passwd = By.xpath("//input[@id='password']");
	public By days = By.xpath("//select[@id='days']");
	public By month = By.xpath("//select[@id='months']");
	public By year = By.xpath("//select[@id='years']");
	public By newsleter = By.xpath("//input[@id='newsletter']");
	public By offers = By.xpath("//input[@id='optin']");
	public By firstname = By.xpath("//input[@id='first_name']");
	public By lastname = By.xpath("//input[@id='last_name']");
	public By company = By.xpath("//input[@id='company']");
	public By address = By.xpath("//input[@id='address1']");
	public By country = By.xpath("//select[@id='country']");
	public By state = By.xpath("//input[@id='state']");
	public By city = By.xpath("//input[@id='city']");
	public By zipcode = By.xpath("//input[@id='zipcode']");
	public By mobileno = By.xpath("//input[@id='mobile_number']");
	public By acctcreate = By.xpath("//button[normalize-space()='Create Account']");
	public By acctcreated = By.xpath("//b[normalize-space()='Account Created!']");
	public By continued = By.xpath("//a[normalize-space()='Continue']");
	public By loggedinwrning = By.xpath("//li[10]//a[1]");
	public By logintext = By.xpath("//h2[normalize-space()='Login to your account']");
	public By loginemail = By.xpath("//input[@data-qa='login-email']");
	public By loginpwd = By.xpath("//input[@placeholder='Password']");
	public By loginbtn = By.xpath("//button[normalize-space()='Login']");
	public By loggedinmsg = By.xpath("//header[@id='header']//li[1]//a[1]");
	public By logout = By.xpath("//a[normalize-space()='Logout']");
	public By contact = By.xpath("//a[normalize-space()='Contact us']");
	public By gettouchtext = By.xpath("//h2[normalize-space()='Get In Touch']");
	public By ctname = By.xpath("//input[@placeholder='Name']");
	public By ctmail = By.xpath("//input[@placeholder='Email']");
	public By subject = By.xpath("//input[@placeholder='Subject']");
	public By msg = By.xpath("//textarea[@id='message']");
	public By upload = By.xpath("//input[@name='upload_file']");
	public By submit = By.xpath("//input[@name='submit']");
	public By status = By.xpath("//div[@class='status alert alert-success']");
	public By homepage = By.xpath("//span[normalize-space()='Home']");
	public By products = By.xpath("//a[@href='/products']");
	public By allprod = By.xpath("//h2[normalize-space()='All Products']");
	public By viewprd1 = By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");
	public By bluetopvis = By.xpath("//h2[normalize-space()='Blue Top']");
	public By categoryvis = By.xpath("//p[normalize-space()='Category: Women > Tops']");
	public By pricevis = By.xpath("//span[normalize-space()='Rs. 500']");
	public By searchprd = By.xpath("//input[@id='search_product']");
	public By searchbtn = By.xpath("//button[@id='submit_search']");
	public By srchdprd = By.xpath("//h2[normalize-space()='Searched Products']");
	public By women = By.xpath("//a[normalize-space()='Women']");
	public By addcrt1 = By.xpath("//div[@class='features_items']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]");
	public By add = By.xpath("//button[normalize-space()='Add to cart']");
	public By srchtxt = By.xpath("//div[@class='productinfo text-center']//p[contains(text(),'Soft Stretch Jeans')]");
	public By addcart1 = By.xpath("//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]");
	public By addcart2 = By.xpath("//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]");
	public By addcart3 = By.xpath("//div[4]//div[1]//div[1]//div[2]//div[1]//a[1]");
	public By viewcart = By.xpath("//u[normalize-space()='View Cart']");
	public By continueshp = By.xpath("//button[normalize-space()='Continue Shopping']");
	public By shopcart = By.xpath("//li[@class='active']");
	public By prcdchkout = By.linkText("Proceed To Checkout");
	public By rgstr = By.xpath("//u[normalize-space()='Register / Login']");
	public By cartbtn = By.xpath("//a[normalize-space()='Cart']");
	public By delvaddr = By.xpath("//h3[normalize-space()='Your delivery address']");
	public By textarea = By.xpath("//textarea[@name='message']");
	public By placeorder = By.xpath("//a[normalize-space()='Place Order']");
	public By cardname = By.xpath("//input[@name='name_on_card']");
	public By crdno = By.xpath("//input[@name='card_number']");
	public By cvv = By.xpath("//input[@placeholder='ex. 311']");
	public By mm = By.xpath("//input[@placeholder='MM']");
	public By yyyy = By.xpath("//input[@placeholder='YYYY']");
	public By payorder = By.xpath("//button[@id='submit']");
	public By delacc = By.xpath("//a[normalize-space()='Delete Account']");
	public By accdltd = By.xpath("//b[normalize-space()='Account Deleted!']");
	
	

}
