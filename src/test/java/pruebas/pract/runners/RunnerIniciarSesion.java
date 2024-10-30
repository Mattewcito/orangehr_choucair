package pruebas.pract.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feactures/iniciarsesion.feature", glue = "pruebas.pract.stepdefinition", snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "@successful")

public class RunnerIniciarSesion {
}
