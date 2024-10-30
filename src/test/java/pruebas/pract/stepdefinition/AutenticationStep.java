package pruebas.pract.stepdefinition;

//import pruebas.pract.tasks.ChooseCategory;
//import pruebas.pract.tasks.ChooseProducts;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import pruebas.pract.tasks.IniciarSesion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static pruebas.pract.ui.IniciarSesionUI.DASHBOARD;
import static pruebas.pract.utils.Constants.*;

public class AutenticationStep {

    private static EnvironmentVariables environmentVariables;
    private String user;
    private String pwd;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingresa las credenciales")
    public void enterCredentials() {

        user = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER_NAME);
        pwd = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PWD);
        theActorCalled(ACTOR).attemptsTo(
                IniciarSesion.authentication(user, pwd)
        );

        //Escoge categoria y productos
//        theActorCalled(ACTOR).attemptsTo(
//                ChooseCategory.dynamic(),
//                ChooseProducts.dynamic()
//        );
    }
    @Then("visualizará a la página de inicio del dashboard")
    public void viewDashboard() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        WebElementQuestion.the(DASHBOARD),
                        WebElementStateMatchers.isVisible()
                )
        );
    }
}
