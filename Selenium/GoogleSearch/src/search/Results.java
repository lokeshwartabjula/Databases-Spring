package search;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Results {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver myD=new FirefoxDriver();
		myD.get("https://www.google.com/");
		String[] queries= {"Apple Iphone XS","Samsung Note 10","OnePlus 7 Pro","Redmi K20","Pixel 3"};
		myD.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Testing");
		Thread.sleep(500);
		myD.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[2]/div[2]/div[2]/center/input[1]")).click();
		Thread.sleep(500);
		for(int i=0;i<10;i++) {
			
		System.out.println("Starting Script");
		
		String result=myD.findElement(By.xpath("//*[@id=\"resultStats\"]")).getText();
		System.out.println(result);
		myD.findElement(By.xpath("/html/body/div[3]/form/div[2]/div/div[2]/div/div[1]/input")).clear();
		myD.findElement(By.xpath("/html/body/div[3]/form/div[2]/div/div[2]/div/div[1]/input")).sendKeys(queries[i%5]);
		myD.findElement(By.xpath("//button[@class='Tg7LZd']")).click();
		System.out.println("Stopping Script");
//		myD.close();
		}
	}

}
