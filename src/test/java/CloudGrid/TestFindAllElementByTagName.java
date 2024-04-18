package CloudGrid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFindAllElementByTagName extends BaseTest {

	@Test
	public void testFindAllElementByTagName() 
	{
		// navigate to LambdaTest e-commerce playground
		System.out.println("Navigating to LambdaTest e-commerce playground");
		driver.get("https://ecommerce-playground.lambdatest.io/");

		// Fetch the list of web elements with tag h4
		System.out.println("Fetching all the elements with tag h4");
		List<WebElement> elements = driver.findElements(By.tagName("h4"));

		// print the size of the web element list
		System.out.println("Total number of elements with tag h4 : " + elements.size());
		
		// print the value of each web element one by one
		for (int i = 0; i < elements.size(); i++)
		{
			WebElement element = elements.get(i);
			System.out.println(i + " : " + element.getText());
		}

		status = "passed";
	}

}
