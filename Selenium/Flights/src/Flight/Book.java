package Flight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Book {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver myD=new FirefoxDriver();
		myD.get("https://www.bing.com/");
		System.out.println("Starting Script");
		myD.findElement(By.xpath("//input[@name='q']")).sendKeys("book flights",Keys.ENTER);
		Thread.sleep(1500);
		myD.findElement(By.xpath("/html/body/div[1]/main/ol/li[2]/div[3]/div[2]/div[1]/div[2]/div[1]/a/span[1]")).click();
		myD.findElement(By.xpath("/html/body/div[1]/main/ol/li[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]")).click();
		Thread.sleep(500);
		myD.findElement(By.xpath("//*[@id=\"fb_astio\"]")).clear();
		myD.findElement(By.xpath("//*[@id=\"fb_astio\"]")).sendKeys("MAA");
		Thread.sleep(500);
//		myD.findElement(By.xpath("/html/body/div[1]/main/ol/li[2]/div[3]/div[2]/div[1]/div[3]/div[1]/div[2]/div/div[1]")).click();
		myD.findElement(By.xpath("//div[@aria-label='MAA - Chennai - Chennai']"));
		myD.findElement(By.xpath("//*[@id=\"fb_astid\"]")).sendKeys("PAT");
		Thread.sleep(500);
		myD.findElement(By.xpath("/html/body/div[1]/main/ol/li[2]/div[3]/div[2]/div[1]/div[3]/div[3]/div[2]/div/div[3]")).click();
		
		
//		String query=myD.findElement(By.xpath("//input[@name='q']")).getAttribute("value");
//		System.out.println(query);
//		String result=myD.findElement(By.xpath("//*[@id=\"resultStats\"]")).getText();
//		System.out.println(result);
		System.out.println("Stopping Script");
		
		
		myD.get("https://www.amazon.com");
		Actions act=new Actions(myD);
		act.moveToElement(myD.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[2]"))).build().perform();
		myD.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[2]/div[2]/div/div[1]/div/a/span")).click();
		
	
	}
}
