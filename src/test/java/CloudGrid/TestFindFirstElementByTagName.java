package CloudGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFindFirstElementByTagName extends BaseTest {

	@Test
	public void testFindFirstElementByTagName() 
	{
		// navigate to LambdaTest e-commerce playground
		System.out.println("Navigating to LambdaTest e-commerce playground");
		driver.get("https://ecommerce-playground.lambdatest.io/");

		// Fetch the first web element with tag h4
		System.out.println("Fetching the first element with tag h4");
		WebElement element = driver.findElement(By.tagName("h4"));

		// print the value of the fetched web element
		System.out.println("Value of the element with tag h4: " + element.getText());

		status = "passed";
	}

}
