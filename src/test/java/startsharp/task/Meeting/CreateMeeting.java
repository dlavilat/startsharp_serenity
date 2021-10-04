package startsharp.task.Meeting;

import static startsharp.navigation.BusinessUnit.BTN_NEW_BUSINESS_UNIT;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CreateMeeting implements Task{

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(BTN_NEW_BUSINESS_UNIT)
		);
		
	}
	
	public static CreateMeeting newMeeting() {
		return Instrumented.instanceOf(CreateMeeting.class).withProperties();
	}

}
