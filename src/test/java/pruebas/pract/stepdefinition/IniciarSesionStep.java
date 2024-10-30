package pruebas.pract.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class IniciarSesionStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("el usuario ingresa el nombre de usuario {string}")
    public void inputUsername(String arg0) {
    }

    @And("el usuario ingresa la contraseña {string}")
    public void inputPassword(String arg0) {
    }

    @And("hace clic en el botón de inicio de sesión")
    public void clicButton() {
    }

    @Then("el usuario debería ser redirigido a la página de inicio del dashboard")
    public void viewDasboard() {
    }

}
