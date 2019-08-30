package search;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Predictions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver myD=new FirefoxDriver();
		myD.get("https://www.google.com/");
		myD.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Testing");
		Thread.sleep(500);
//		myD.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[2]/div[2]/div[2]/center/input[1]")).click();
		myD.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[3]/center/input[1]")).click();
		
		Thread.sleep(500);
		myD.findElement(By.xpath("//input[@name='q']")).click();
		
		ArrayList<String> predictions=new ArrayList<String>();
		String s=myD.findElement(By.xpath("//ul[@class='erkvQe']")).getText();
										
		predictions.add(s);
		System.out.println(predictions.toString());
	}

}
