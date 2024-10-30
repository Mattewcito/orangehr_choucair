package pruebas.pract.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionUI extends PageObject {

    /**
     * Mapeo de localozadores vista LOGIN
     */

    public static final Target MODAL_LOGIN = Target.the("selecciona en el modal la opcion login")
            .located(By.xpath("//div[@class='orangehrm-login-slot']"));

    public static final Target INPUT_USER_NAME = Target.the("ingresa el nombre de usuario")
            .located(By.xpath(("//input[@name='username']")));

    public static final Target INPUT_PASSWORD = Target.the("ingresa la contraseña")
            .located(By.xpath(("//input[@name='password']")));

    public static final Target BUTTON_LOGIN = Target.the("pulsa el boton entrar")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));

}