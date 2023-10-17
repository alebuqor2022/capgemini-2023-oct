package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZaraSearch {
public static WebDriver driver;

@Given("^el usuario esta en la pagina de inicio$")
public void given() throws Throwable {
	driver=new ChromeDriver();
	driver.navigate().to("https://www.zara.com/ar/");;
	System.out.println("estoy en el given");
}


@When("^el usuario ingresa {article}$")
public void when(String article) throws Throwable {
	System.out.println("veo el value " + article);
	driver.findElement(By.id("search-products-form-combo-input")).sendKeys(article);
}


@Then("^MUJER aparece$")
public void verBlusas() {
System.out.println("estoy en el Then");
driver.close();
}

}
