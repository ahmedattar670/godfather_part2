package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Part2_Cast extends PageBase{
	
	public Part2_Cast(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}
	
	@FindBy (linkText = "Cast")
	public WebElement cast;
	
	@FindBy (linkText = "List of The Godfather characters")
	public WebElement all_of_them;
	

	@FindBy (xpath = "/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/div[5]")
	public WebElement all_of_them3;
	
	

}
