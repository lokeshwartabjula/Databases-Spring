import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver myD=new FirefoxDriver();
		myD.get("https://www.google.com/");
		List<WebElement> links=myD.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			if(links.get(i).getText().equals("")) continue;
			System.out.print(links.get(i).getText());
			System.out.println(" : "+links.get(i).getAttribute("href"));
				
		}
		
		Thread.sleep(3000);
		myD.close();
	}
}

