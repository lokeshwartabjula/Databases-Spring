package forms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver myD=new FirefoxDriver();
		myD.get("http://www.echoecho.com/htmlforms10.htm");
		myD.findElement(By.xpath("//input[@value='Cheese']")).click();
		System.out.println(myD.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
		List<WebElement> radioButtons=myD.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<radioButtons.size();i++) {
			System.out.print(radioButtons.get(i).getAttribute("value"));
			if(radioButtons.get(i).isSelected())
				System.out.println(" == TRUE");
			else System.out.println(" == FALSE");
		}
		
		Thread.sleep(3000);
		myD.close();
	}
}
