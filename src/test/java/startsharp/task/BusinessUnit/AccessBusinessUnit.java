package startsharp.task.BusinessUnit;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static startsharp.navigation.MainPage.*;

public class AccessBusinessUnit implements Task{

		
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(OPTION_ORGANIZATION),
				Click.on(OPTION_BUSINESS_UNIT)
		);
		
	}
	
	public static AccessBusinessUnit ingresarBusinessUnit() {
		return Instrumented.instanceOf(AccessBusinessUnit.class).withProperties();
	}

}
