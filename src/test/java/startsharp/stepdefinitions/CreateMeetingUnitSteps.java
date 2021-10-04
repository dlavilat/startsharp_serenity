package startsharp.stepdefinitions;

import static startsharp.navigation.Meetings.TXT_ASERTION_NAME_MEETING;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
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
import startsharp.task.Login.IniciarSesion;
import startsharp.task.Meeting.CreateMeeting;
import startsharp.task.Meeting.FormMeeting;
import startsharp.task.Meeting.SaveMeeting;
import startsharp.task.Meeting.SelectOptionMeetings;

public class CreateMeetingUnitSteps {

	@Managed(driver = "chrome")
	private WebDriver navegador;
	private Actor actor = Actor.named("Global");
	private StartSharp startSharp = new StartSharp();
	DataTable datosFormulario;

	@Before
	public void setUp() {
		actor.can(BrowseTheWeb.with(navegador));
	}

	@Given("El usuario esté logueado en la aplicación StarSharp")
	public void elUsuarioEstéLogueadoEnLaAplicaciónStarSharp() {
		String user = "admin";
		String pass = "serenity";

		actor.wasAbleTo(Open.browserOn(startSharp), IniciarSesion.conCredenciales(user, pass));
	}

	@Given("El usuario haya ingresado a la funcionalidad Meetings")
	public void elUsuarioHayaIngresadoALaFuncionalidadMeetings() {
		actor.wasAbleTo(SelectOptionMeetings.selectOption());
	}

	@When("el usuario presiona la opción New Meetings")
	public void elUsuarioPresionaLaOpciónNewMeetings() {
		actor.wasAbleTo(CreateMeeting.newMeeting());
	}

	@When("diligenciar los siguientes campos:")
	public void diligenciarLosSiguientesCampos(io.cucumber.datatable.DataTable dataTable) {
		this.datosFormulario = dataTable;
		actor.wasAbleTo(
				FormMeeting.dataMeeting(dataTable)
		);
	}

	@When("presiona el botón Save")
	public void presionaElBotónSave() {
		actor.wasAbleTo(
				SaveMeeting.save()
		);
	}

	@Then("la reunión debe agregarse a la tabla de la vista inicial del modulo")
	public void laReuniónDebeCrearse() {
		actor.should(
				EventualConsequence.eventually(
						GivenWhenThen.seeThat(WebElementQuestion.the(TXT_ASERTION_NAME_MEETING),
						WebElementStateMatchers.containsText(datosFormulario.cell(1, 0)))
				)

		);
	}

}
