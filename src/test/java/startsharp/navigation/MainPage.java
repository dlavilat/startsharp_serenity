package startsharp.navigation;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {
	
	public static final Target OPTION_ORGANIZATION 		= Target.the("Opción de menú - Organización").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/a/span"));
	public static final Target OPTION_BUSINESS_UNIT		= Target.the("Opción de Submenú - Business Unit").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[6]/ul/li[1]/a/span"));
	public static final Target OPTION_MEETING			= Target.the("Opción de menú - Meeting").located(By.xpath("//*[@id=\"SidebarMenu\"]/li[5]"));
	public static final Target OPTION_MEETINGS			= Target.the("Opción de Submenú menú - Meetings").located(By.xpath("//a[@href=\"/demo/Meeting/Meeting\"]"));
	//

}
