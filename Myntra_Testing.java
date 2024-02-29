package Testing.January_2024;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra_Testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.myntra.com/");
		//	driver.manage().window().fullscreen();

		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("shirts");
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();


		WebElement unorderedList = driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul"));
		List<WebElement> listItems = unorderedList.findElements(By.tagName("li"));

		// Check if there are at least 7 items in the list
		if (listItems.size() >= 7) {
			// Select the 7th item (index is zero-based)
			WebElement seventhItem = listItems.get(6);
			seventhItem.click();
		} else {
			System.out.println("The list does not have enough items.");
		}

		//driver.findElement(By.cssSelector("size-buttons-unified-size")).click();
		// Get the handles of all open windows
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the new window
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}
		List<WebElement> sizeElements = driver.findElements(By.xpath("//p[contains(@class,'size-buttons-unified-size')]"));
		System.out.println("sizeElements"+ sizeElements.size());
		// Check if there are sizes available
		if (!sizeElements.isEmpty()) {
			// Generate a random index to select a random size
			int randomIndex = new Random().nextInt(sizeElements.size());

			// Get the randomly selected size element
			WebElement randomSizeElement = sizeElements.get(randomIndex);

			// Click the randomly selected size element
			randomSizeElement.click();
		} else {
			System.out.println("No size elements found.");
		}

		driver.findElement(By.className("pdp-add-to-bag")).click();

		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconBag sprites-headerBag')]")).click();

		windowHandles = driver.getWindowHandles();

		// Switch to the new window
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}


		driver.findElement(By.className("itemBlock-base-leftBlock")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'REMOVE')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton ']")).click();
		

		
		





	}

}
