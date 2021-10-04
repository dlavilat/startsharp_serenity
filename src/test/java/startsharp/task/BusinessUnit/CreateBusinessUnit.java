package startsharp.task.BusinessUnit;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static startsharp.navigation.BusinessUnit.*;

public class CreateBusinessUnit implements Task{

	String name;
	
	public CreateBusinessUnit (String name) {
		this.name = name;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(name).into(INPUT_NAME)
		);
		
	}
	
	public static CreateBusinessUnit conName(String name) {
		return Instrumented.instanceOf(CreateBusinessUnit.class).withProperties(name);
	}

}
