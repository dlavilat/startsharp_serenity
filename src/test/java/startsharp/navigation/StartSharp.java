package startsharp.navigation;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://serenity.is/demo/")
public class StartSharp extends PageObject {
	
	public static final Target INPUT_USER 		= Target.the("Input de usuario").located(By.id("StartSharp_Membership_LoginPanel0_Username"));
	public static final Target INPUT_PASSWORD 	= Target.the("Input de password").located(By.id("StartSharp_Membership_LoginPanel0_Password"));
	public static final Target BTN_SIGNIN	 	= Target.the("Botón SignIn").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
	
}
