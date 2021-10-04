package startsharp.task.BusinessUnit;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static startsharp.navigation.BusinessUnit.BTN_SAVE;
import static startsharp.navigation.BusinessUnit.COLUMN_ID;
import static startsharp.navigation.BusinessUnit.WINDOW_CREATE;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SaveBusinessUnit implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Click.on(BTN_SAVE),
				WaitUntil.the(WINDOW_CREATE, isNotVisible()), 
				DoubleClick.on(COLUMN_ID));

		actor.should();

	}

	public static SaveBusinessUnit save() {
		return Instrumented.instanceOf(SaveBusinessUnit.class).withProperties();
	}

}
