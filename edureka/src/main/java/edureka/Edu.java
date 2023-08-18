package edureka;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;

public class Edu {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Go to the webpage
		driver.get("http://www.mercury-tours.com/");
		
		//maximizing the webpage
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//verify the title of the webpage
		String expectedTitle="Mercury Tours Home Page";
		String actualTitle="";
	 actualTitle=driver.getTitle();
	 
	 //comparing the expected and actual title of the webpage
	 if(actualTitle.contentEquals(expectedTitle)) {
		 System.out.println("Test passed");
	 }else {
		 System.out.println("Test Failed");
	 }
	 
	 //closing the browser
	 driver.close();
	}
	
	
	
}
