package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String vBrowserString="GC";
		if(vBrowserString.equals("GC")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			WebDriver myD=new ChromeDriver();
			myD.get("https://www.google.com/");
			System.out.println("Title: "+myD.getTitle());
			Thread.sleep(1500);
			myD.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("abc");
			//*[@id="tsf"]/div[2]/div/div[1]/div/div[1]/input
			Thread.sleep(5000);
			//*[@id="tsf"]/div[2]/div/div[1]/div/div[1]/input
			myD.close();
		}
		else if(vBrowserString.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
			WebDriver myD=new FirefoxDriver();
			myD.get("https://login.yahoo.com/");
			System.out.println("Title: "+myD.getTitle());
//			myD.manage().window().maximize();
			myD.findElement(By.id("createacc")).click();
//			Thread.sleep(1500);
			myD.findElement(By.id("usernamereg-firstName")).sendKeys("Saksham");
			Thread.sleep(500);
			myD.findElement(By.name("lastName")).sendKeys("Sauhard");
			Thread.sleep(500);
			myD.findElement(By.id("usernamereg-password")).sendKeys("usernamereg-password");
			Thread.sleep(1500);
//			myD.findElement(By.className("phone-no ")).sendKeys("6768786464");
//			myD.findElement(By.className("pure-button")).click();
//			myD.findElement(By.partialLinkText("Sign")).click();
			myD.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
			Thread.sleep(6000);
			myD.close();
		}

	}

}
