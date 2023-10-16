package com.capgemini.escuelita.mavenEjemplo2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CookiesAccept {

	@Test
	public void testAcceptAllCookies() {
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.experis.co.uk/");//Browser URL

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();


		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("testeando como un QA!!");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/div[1]/input")).clear();
	
	// sin chequear aun		
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/div[2]/input")).sendKeys("London");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/div[2]/input")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/div/[2]/input")).submit();
	}


}
