Feature: to test login functionality

  Scenario Outline: 
    Given The user "<User>" on the country specific "<eTailing_URL>"
    And The corresponding "Landing" page is displayed
    When The user selects "<Re_Order_Reebok>"
    Then The "Homepage" page is displayed
    When The user clicks the "Catalogue" link
    Then The "Catalogue" page is displayed
    When The user clicks on any product "<Product>" that is in stock
    Then The corresponding PDP is displayed
    When The user clicks on the [Add to Cart] button in the PDP page
    Then The product is added to cart and cart icon is updated

    Examples: 
      | Logged_in_User   | eTailing_URL                         | Product |
      | 0100202227.weuro | https://mstage-adidas.cs82.force.com | B45941  |
