# Myntra-Testing
This Java program automates testing scenarios on the Myntra website using Selenium WebDriver.

#Description
This program demonstrates automated testing for the Myntra website, focusing on searching for shirts, selecting a specific item, choosing a size, adding the item to the cart, and then removing it from the cart. The script is written in Java and utilizes Selenium WebDriver for web automation.

#Features
1.Search and Selection:
  -Searches for shirts on the Myntra website.
  -Clicks on the search result to navigate to the product page.

2.Size Selection:
  -Finds available sizes for the selected product.
  -Randomly selects a size and clicks on it.

3.Add to Cart:
  -Adds the selected item to the shopping bag.

4.Cart Management:
  -Opens the shopping bag.
  -Removes the selected item from the cart.
  
#Requirements
 -Java Development Kit (JDK)
 -WebDriverManager for managing WebDriver binaries.
 -Selenium WebDriver library.
 -Supported web browser (Edge in this case).

#How to Use
1.Setup Environment:
  -Make sure JDK is installed.
  -Import the WebDriverManager dependency.
  -Add Selenium WebDriver library to the project.

2.Set Browser:
  -Currently configured for Microsoft Edge (EdgeDriver).
  -Modify WebDriverManager.edgedriver().setup(); for other browsers.

3.Execute Script:
  -Run the Myntra_Testing class.
  -Ensure the Myntra website is accessible.
