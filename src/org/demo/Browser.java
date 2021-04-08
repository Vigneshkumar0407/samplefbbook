package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\org.demo\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		login.sendKeys("9043895560",Keys.ENTER);
		
		WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		pass.sendKeys("9043895560",Keys.ENTER);
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		submit.click();
		
		
		
		WebElement mouseover = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[2]/div/div"));
		String mouseovertxt = mouseover.getText();
		System.out.println(mouseovertxt);
		
		Actions ho=new Actions(driver);
		ho.moveToElement(mouseover).perform();
		
		
		
		WebElement mouseover1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[1]/div/img"));
		mouseover1.click();
		
//		WebElement bed = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div/img"));
//		bed.click();
		String mouseclick = mouseover1.getText();
		System.out.println(mouseclick);
		ho.moveToElement(mouseover1).perform();

	}
	
}
