package package1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch 
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			ChromeDriver cd = new ChromeDriver();
			cd.manage().window().maximize();
			cd.get("http://demo.guru99.com/test/web-table-element.php");
	
               
            String pt ="//table[@class ='dataTable']//tr//td//a[contains(text(),'')]";
         	List<WebElement> total = cd.findElements(By.xpath(pt));
         	int size =total.size();
         	System.out.println(size);
         	  
              for(int i=0; i<size; i++)
              {
            	  System.out.println(total.get(i).getText()); 
              }
		}
	

}
