@All
Feature: Automation exercise test cases

 
   Background:
    Given user launch browser and navigates to url
    Then homepage should be visible

  Scenario Outline: Register user functionality
   When user click on signup button
    And user enters "<name>" and "<emailaddress>"
    Then clicks signup button
   And verify that enter account information is visible
   And fills the details "<password>","<day>","<month>","<year>"
    And selects the checkboxes
    And fills the "<fname>","<lname>","<cmpny>","<addrs>","<country>","<state>","<city>","<zip>","<mobile>"
    And clicks create account button
    Then verifies that account created is visible
   And clicks continue button
    And verifies logged in as username is visible
   

    Examples: 
      | name   | emailaddress               | password     | day | month  | year | fname  | lname | cmpny | addrs          | country | state | city | zip    | mobile     |
     | subash | rao.subash900812@gmail.com | Sprisum@5678 |  12 | August | 1990 | subash | rao   | xxx   | kennedy square | India    | tn    | chn  | 600011 | 9876543210 |
      
  
   @validlogin
   @smoke @regression  
   Scenario: Login with valid credentials
    When user click on signup button
    And verifies the login to your account is visible
    And enters the following valid creds
   |username|password|
   |rao.subash900812@gmail.com|Sprisum@5678|
    And clicks on login button
    And verifies logged in as username is visible
    And click logout button
   
   @Registerexistingmail
   @regression @smoke
   Scenario Outline: Register using existing mail
   When user click on signup button
   And user enters "<name>" and "<emailaddress>"
   Then clicks signup button
   And verifies message user already exists
   
   Examples:
   |name  |emailaddress              |
   |subash|rao.subash900812@gmail.com| 
   
   
   @contact
   Scenario: Contact us form
    And clicks on contact us button
    And verifies get in touch is visible
    And enters name as "subash",email as "rao.subash900812@gmail.com", subject as "query",message as "Hi"
    And uploads file
    And clicks submit and ok button
    And verifies 'Success! Your details have been submitted successfully.' is visible
    And click home button
    
    @Allproducts
    Scenario: Verifying all products
     When user clicks on product button
     And verifies that navigates to products page
     And clicks on view product of first product
     And verifies the details product name,category,price.
     
     @Addreviewonproduct
     Scenario: Add review for product
      When user clicks on product button
      And verifies that navigates to products page
      And clicks on view product buton
      And verifies write your review is visible
      And enters the following details
      |subash|xyz@gmail.com|Ok good|
      Then clicks submit button
      And verifies message "Thank you for your review." is visible
    
   @Searchfunctionality
   Scenario: Searching the product
     When user clicks on product button
     And verifies that navigates to products page
     And enters product name in search filed and clicks search button
     And verifies searched products is visible
     And also verifies all products related to search are visible
     
   #  @Orderplacewhilecheckout
   # Scenario: Place order while checkout
 #    When user adds product to cart
  #   Then clicks cart button
  #   And verifies cart page is displayed
  #   And proceeds to checkout
  #   And clicks register/login button
   #  And user enters name and Email address
   #  And clicks signup button
   #  And fills the details password,day,month,year
   #  And selects the checkboxes
   # And fills the mandatory details
  #  And clicks create account button
  #  And clicks continue button
  #   And verifies logged in as username is visible
  #  Then clicks the cart button
 #    And proceeds to checkout
 #    And verifes address details and review order
 #    And enters description in comment area and clicks place order
  #  And enters payment details
  #  And clicks pay and confirm order button
  #  And clicks delete account button
  
  @Downloadinvoice
  Scenario: Download invoice
   When user adds product to cart
   Then clicks cart button
   And verifies cart page is displayed
   And proceeds to checkout
   And clicks register/login button
   And user enters name and Email address
   And clicks signup button
   And fills the details password,day,month,year
   And selects the checkboxes
   And fills the mandatory details
   And clicks create account button
   And clicks continue button
   And verifies logged in as username is visible
   Then clicks the cart button
   And proceeds to checkout
   And verifes address details and review order
   And enters description in comment area and clicks place order
   And enters payment details
   And clicks pay and confirm order button
   #And verifies order message
   And clicks download invoice button
   And clicks continue button
   And clicks delete account button
   
   
   @Loginandplaceorder
   Scenario: Login and place order
    When user click on signup button
    And fills email as "applesubash@gmail.com",password as "Sprisum@5678"
    And clicks login button
    And verifies logged in as username is visible
    When user adds product to cart
    Then clicks cart button
    And verifies cart page is displayed
    And proceeds to checkout
    And verifes address details and review order
    And enters description in comment area and clicks place order
    And enters payment details
    And clicks pay and confirm order button
    And clicks delete account button
    And verifies message 'ACCOUNT DELETED!'
    And clicks continue button
    
  
  #@Addsearchedproductstocart
  # Scenario: Searching the product and add it  to cart
   #   When user clicks on product button
   #   And verifies that navigates to products page
    #  And enters product name in search filed and clicks search button
   #   And verifies searched products is visible
   #  And also verifies all products related to search are visible
   #  And add the searched product to cart
  #   Then clicks the cart button
  #   When user click on signup button
  #   And enters the following valid creds
   #  |username|password|
   #  |rao.subash900812@gmail.com|Sprisum@5678|
  #   And clicks on login button 
  #   Then clicks the cart button
   #  And verifies products are visible in cart after login as well.
    
    
    #@Modifyproductquantity
   # Scenario: Modify product quantity
   #  And clicks on view product of any product
  #   And verifies product detail is opened
   #  And increase qty to 4
   #  Then clicks the add to cart button	
   #  And clicks view cart button
  #   And verifies the product is displayed in cart page with the exact quantity
  
  
 # @Verifysubscriptionincartpage
 # Scenario: Verify subscription in cart page
 # And clicks the cart button
#  And scroll to bottom of the page
#  And verify subscription text is visible
 # And enters email address and clicks arrow button
 # And verifies the success messgae "You have been successfully subscribed!" is visible
  
 # @Removeproductfromcart
 # Scenario: Removing products from the cart
#  And user adds product to the cart
 # And clicks cart button
#  And verifies cart page is displayed
#  And removes the product from the cart
#  And verifies the product is removed from the cart

  @Addcartonrecommendeditems
  Scenario: Add cart on recommended items
  And scroll to recommended items
  And verify recommended items are available
  And add product to cart
  And click view cart button for the recommended product
  And verify product got displayed in cart page
  
  @Scrollfunctionalityusingarrowbutton
  Scenario: Scroll up using arrow button and scroll down
  And scroll unitl subscription is visible
  And click on arrow available  at the bottom right
  And verify the page is scrolled up and "Full-Fledged practice website for Automation Engineers" is visible
  
  @Scrollfunctionalitywithouarrowbutton
  Scenario: Scroll up to top of the page
  And scroll unitl subscription is visible
  And scroll to top
  And verify the page is scrolled up and "Full-Fledged practice website for Automation Engineers" is visible
  
  
  @Viewcategoryproducts
  Scenario: View category products
  Then scroll and click women category
  And click tops
  And verify that category page is displayed
  And again click on men category available on left side bar
  And verify user is navigated to that category page
  
  
  @Viewbrandproducts
  Scenario: View Brand products
  And user clicks on the product button
  And verifies brands are visible on the left side of the page
  And clicks on any brand name
  And verify that brand page is visible
  And again clicks on any brand name
  And verify that specific brand page is visible
  
     
    
     
      
