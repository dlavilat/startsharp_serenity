package startsharp.task.Meeting;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static startsharp.navigation.MainPage.*;

public class SelectOptionMeetings implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(OPTION_MEETING),
				Click.on(OPTION_MEETINGS)
		);	
	}
	
	public static SelectOptionMeetings selectOption() {
		return Instrumented.instanceOf(SelectOptionMeetings.class).withProperties();
	}

}
