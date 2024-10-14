package basepkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basecls {
	
public static WebDriver driver;
	
	public static void launch()
	{
	
		driver = new ChromeDriver();
	}
	
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void geturl(String url)
	{
		driver.get(url);
	}

	
	public static void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	public static void shot(String imgname) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dst= new File("./tasks/target"+imgname+".png");
		FileUtils.copyFile(src, dst);
	}
	
	public static void scroll(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
	
	public static void scrollbottom()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void scrolltop()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}
	
	public static void clearele(WebElement ele)
	{
		ele.clear();
		}
	
	public static void clickele(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public static void entertext(WebElement ele, String text)
	{
	  ele.sendKeys(text);
	}
	
	public static void moveele(WebElement ele)
	{
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	
	public static void acceptalert()
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
		}
	
	public static boolean displaystatus(WebElement ele)
	{
		return ele.isDisplayed();
	}
	
	public static String retrievetext(WebElement ele)
	{
		return ele.getText();
	}
	
	public static void quit()
	{
		
		if(driver!=null)
		{
		driver.quit();
	}
	
	


	}


}
