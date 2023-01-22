Feature: Amazon Case

  Scenario: Write product info to file
    Given Go to 'https://www.amazon.com.tr/'
    Given Verify 'Amazon'
    Given Search 'Macbook Pro'
    When Go to the '1'st product from the product list
    Then Write product 'price' info to file
    Then Write product 'model' info to file
    Then Write product 'cpu' info to file
