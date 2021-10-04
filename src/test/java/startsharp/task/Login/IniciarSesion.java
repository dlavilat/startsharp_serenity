package startsharp.task.Login;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static startsharp.navigation.StartSharp.*;


public class IniciarSesion implements Task{

	String user;
	String password;
	
	public IniciarSesion (String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(user).into(INPUT_USER),
				Enter.theValue(password).into(INPUT_PASSWORD),
				Click.on(BTN_SIGNIN)
		);
		
	}
	
	public static IniciarSesion conCredenciales(String user, String password) {
		return Instrumented.instanceOf(IniciarSesion.class).withProperties(user,password);
	}

}
