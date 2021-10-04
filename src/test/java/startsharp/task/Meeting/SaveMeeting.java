package startsharp.task.Meeting;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static startsharp.navigation.Meetings.BTN_SAVE_MEETING;
import static startsharp.navigation.Meetings.COLUMN_ID;
import static startsharp.navigation.Meetings.INPUT_MEETING_NAME;
import static startsharp.navigation.Meetings.BTN_REGRESAR;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SaveMeeting implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(BTN_SAVE_MEETING).afterWaitingUntilPresent(),				
				Click.on(BTN_REGRESAR).afterWaitingUntilEnabled(),
				WaitUntil.the(INPUT_MEETING_NAME, isNotVisible()),
				DoubleClick.on(COLUMN_ID)
		);
		
	}
	
	public static SaveMeeting save() {
		return Instrumented.instanceOf(SaveMeeting.class).withProperties();
	}

}
