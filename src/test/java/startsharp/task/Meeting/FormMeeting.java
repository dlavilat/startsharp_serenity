package startsharp.task.Meeting;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static startsharp.navigation.Meetings.*;

import java.time.Duration;

import org.openqa.selenium.Keys;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FormMeeting implements Task {

	String meetingName;
	String meetingType;
	String meetingNumber;
	String startDate;
	String endDate;
	String location;
	String unit;
	String name;
	String lastName;
	String email;
	String emailDomain;

	public FormMeeting(DataTable formulario) {
		this.meetingName = formulario.cell(1, 0);
		this.meetingType = formulario.cell(1, 1);
		this.meetingNumber = formulario.cell(1, 2);
		this.startDate = formulario.cell(1, 3);
		this.endDate = formulario.cell(1, 4);
		this.location = formulario.cell(1, 5);
		this.unit = formulario.cell(1, 6);
		this.name = formulario.cell(1, 7);
		this.lastName = formulario.cell(1, 8);
		this.email = formulario.cell(1, 9);
		this.emailDomain = formulario.cell(1, 10);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				Enter.theValue(meetingName).into(INPUT_MEETING_NAME),
				Click.on(DEPLOY_MEETING_TYPE).afterWaitingUntilPresent(),
				Enter.theValue(meetingType).into(INPUT_MEETING_TYPE), 
				Hit.the(Keys.ENTER).into(INPUT_MEETING_TYPE),
				Enter.theValue(meetingNumber).into(INPUT_MEETING_NUMBER),
				Enter.theValue(startDate).into(INPUT_START_DATE), 
				Enter.theValue(endDate).into(INPUT_END_DATE),
				
				//EVENTS TO LOCATION
				Click.on(BTN_NEW_LOCATION),				
				Enter.theValue(location).into(INPUT_LOCATION), 
				Click.on(BTN_SAVE_DIALOG),
				Click.on(BTN_CLOSE_DIALOG),
				WaitUntil.the(WINDOWS_CREATE, isNotVisible()),
		
				//EVENTS TO UNIT
				Click.on(DEPLOY_UNIT).afterWaitingUntilPresent(),
				Enter.theValue(unit).into(INPUT_WRITE_UNIT),
				Hit.the(Keys.ENTER).into(INPUT_WRITE_UNIT),
				
				//EVENTS TO ORGANIZED BY
				Click.on(BTN_ORGANIZED_BY),				
				Enter.theValue(name).into(INPUT_FIRST_NAME),
				Enter.theValue(lastName).into(INPUT_LAST_NAME),
				Enter.theValue(email).into(INPUT_EMAIL),
				Enter.theValue(emailDomain).into(INPUT_EMAIL_DOMAIN),
				Click.on(BTN_SAVE_DIALOG),
				Click.on(BTN_CLOSE_DIALOG),
				WaitUntil.the(WINDOWS_CREATE, isNotVisible()),
				
				//EVENTS TO REPORTER
				Click.on(DEPLOY_REPORTER).afterWaitingUntilPresent(),
				Enter.theValue(name).into(INPUT_WRITE_REPORTER),
				Hit.the(Keys.ENTER).into(INPUT_WRITE_REPORTER),
				
				
				//EVENTS TO ATTENDEELIST
				Click.on(DEPLOY_ATTENDEELIST).afterWaitingUntilPresent(),
				Enter.theValue(name).into(INPUT_WRITE_ATTENDEELIST),
				Hit.the(Keys.ENTER).into(INPUT_WRITE_ATTENDEELIST),
				
				Click.on(BTN_ATTENDEELIST),				
				Enter.theValue(name+"invitado").into(INPUT_FIRST_NAME),
				Enter.theValue(lastName+"invitado").into(INPUT_LAST_NAME),
				Enter.theValue(email+"invitado").into(INPUT_EMAIL),
				Enter.theValue(emailDomain).into(INPUT_EMAIL_DOMAIN),
				Click.on(BTN_SAVE_DIALOG),
				Click.on(BTN_CLOSE_DIALOG),
				WaitUntil.the(WINDOWS_CREATE, isNotVisible()),
				

				Click.on(DEPLOY_ATTENDEELIST).afterWaitingUntilPresent(),
				Enter.theValue(name+"invitado").into(INPUT_WRITE_ATTENDEELIST),
				Hit.the(Keys.ENTER).into(INPUT_WRITE_ATTENDEELIST)		
				
				
			);

	}

	public static FormMeeting dataMeeting(DataTable datos) {
		return Instrumented.instanceOf(FormMeeting.class).withProperties(datos);
	}
}
