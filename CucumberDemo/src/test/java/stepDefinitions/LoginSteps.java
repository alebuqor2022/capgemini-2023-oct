package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
@Given(value = "el usuario esta logueado")
public void usuarioLogueado() {
	System.out.println("estoy en el given");
}

@When("el usuario ingresa su nombre y password")
public void usuarioNombrePassw() {
	System.out.println("estoy en el when");
}

@And("el usuario hizo click")
public void clickBoton() {
	System.out.println("estoy en el and");
}

@Then("el usuario fue a la home page")
public void usuarioNavegando() {
	System.out.println("estoy en el then");
}

}
