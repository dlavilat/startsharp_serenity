package startsharp.stepdefinitions;

import static startsharp.navigation.BusinessUnit.TXT_ASERTION_NAME;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.EventualConsequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Managed;
import startsharp.navigation.StartSharp;
import startsharp.task.BusinessUnit.AccessBusinessUnit;
import startsharp.task.BusinessUnit.CreateBusinessUnit;
import startsharp.task.BusinessUnit.SaveBusinessUnit;
import startsharp.task.BusinessUnit.SelectOptionBusinessUnit;
import startsharp.task.Login.IniciarSesion;

public class CreateBusinessUnitSteps {

	@Managed(driver = "chrome")
	private WebDriver navegador;
	private Actor actor = Actor.named("Global");
	private StartSharp startSharp = new StartSharp();

	@Before
	public void setUp() {
		actor.can(BrowseTheWeb.with(navegador));
	}

	@Given("El usuario este logueado en la aplicacion StarSharp")
	public void elUsuarioEsteLogueadoEnLaAplicacionStarSharp() {
		String user = "admin";
		String pass = "serenity";

		actor.wasAbleTo(Open.browserOn(startSharp), IniciarSesion.conCredenciales(user, pass));
	}

	@Given("El usuario haya ingresado a la funcionalidad Business Units")
	public void elUsuarioHayaIngresadoALaFuncionalidadBusinessUnits() {

		actor.wasAbleTo(AccessBusinessUnit.ingresarBusinessUnit());
	}

	@When("el usuario presiona la opcion New Bussiness Unit")
	public void elUsuarioPresionaLaOpcionNewBussinessUnit() {

		actor.wasAbleTo(SelectOptionBusinessUnit.selectOption());
	}

	@When("diligencia el campo (.*)")
	public void diligenciaElCampoUnityTest() {
		String name = "UnitTest";

		actor.wasAbleTo(CreateBusinessUnit.conName(name));
	}

	@When("presiona el boton Save")
	public void presionaElBotonSave() {

		actor.wasAbleTo(SaveBusinessUnit.save());
	}

	@Then("la unidad debe agregarse a la tabla")
	public void debeAgregarseALaTabla() {

		actor.should(EventualConsequence.eventually(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_ASERTION_NAME),
				WebElementStateMatchers.containsText("UnitTest")))

		);

	}

}
