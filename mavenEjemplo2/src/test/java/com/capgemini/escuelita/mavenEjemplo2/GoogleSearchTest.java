package com.capgemini.escuelita.mavenEjemplo2;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	private WebDriver driver;

@Before
public void setUp() {
	System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
}

@Test
public void testGooglePage() {
	WebElement searchBox=driver.findElement(By.name("q"));
	searchBox.clear();
	searchBox.sendKeys("covid Argentina");
	searchBox.submit();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	assertEquals("Dosis de refuerzo vacuna COVID-19",driver.getTitle());
}
}
