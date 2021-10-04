package startsharp.navigation;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Meetings {
	public static final Target BTN_NEW_MEETING 			= Target.the("Botón de nueva reunión").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div"));
	public static final Target INPUT_MEETING_NAME 		= Target.the("Campo para el nombre de la reunión").located(By.id("StartSharp_Meeting_MeetingDialog14_MeetingName"));
	public static final Target DEPLOY_MEETING_TYPE 		= Target.the("Select tipo de reunión").located(By.id("select2-chosen-6"));
	public static final Target INPUT_MEETING_TYPE 		= Target.the("Campo para el tipo de reunión").located(By.id("s2id_autogen6_search"));
	public static final Target INPUT_MEETING_NUMBER		= Target.the("Input para número de reunión").located(By.id("StartSharp_Meeting_MeetingDialog14_MeetingNumber"));
	
	public static final Target INPUT_START_DATE			= Target.the("Input para fecha de inicio").located(By.id("StartSharp_Meeting_MeetingDialog14_StartDate"));
	public static final Target INPUT_END_DATE			= Target.the("Input para fecha fin").located(By.id("StartSharp_Meeting_MeetingDialog14_EndDate"));
	
	public static final Target BTN_NEW_LOCATION			= Target.the("Botón para crear ubicación").located(By.xpath("//div[@class=\"field LocationId col-sm-6\"]//descendant::a[@class=\"inplace-button inplace-create\"]"));
	public static final Target INPUT_LOCATION			= Target.the("Input para nombre de ubicación").located(By.xpath("//input[@name=\"Name\"]"));	
	public static final Target BTN_SAVE_DIALOG			= Target.the("Botón Save para ubicación").located(By.xpath("//div[@role=\"dialog\"]//descendant::div[@title=\"Apply Changes\"]"));
	public static final Target BTN_CLOSE_DIALOG			= Target.the("Botón para Cerrar la ventana ubicación").located(By.xpath("//button[@class=\"ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close\"]"));	
	public static final Target WINDOWS_CREATE	= Target.the("Window para ubicación").located(By.xpath("//div[@class='s-TemplatedDialog ui-dialog-content ui-widget-content']//descendant::i[@class=\"fa fa-floppy-o text-purple\"]"));
	
	
	public static final Target DEPLOY_UNIT				= Target.the("Select unidad").located(By.id("select2-chosen-8"));
	public static final Target INPUT_WRITE_UNIT			= Target.the("Input para indicar la unidad").located(By.id("s2id_autogen8_search"));
	
	
	public static final Target BTN_ORGANIZED_BY			= Target.the("Botón para crear organizador").located(By.xpath("//div[@class=\"field OrganizerContactId col-sm-6\"]//descendant::a[@class=\"inplace-button inplace-create\"]"));
	public static final Target INPUT_FIRST_NAME			= Target.the("Input para nombre de organizador").located(By.xpath("//input[@name=\"FirstName\"]"));
	public static final Target INPUT_LAST_NAME			= Target.the("Input para apellido de organizador").located(By.xpath("//input[@name=\"LastName\"]"));
	public static final Target INPUT_EMAIL				= Target.the("Input email").located(By.xpath("//input[@name=\"Email\"]"));
	public static final Target INPUT_EMAIL_DOMAIN		= Target.the("Input email").located(By.xpath("//input[@class=\"emaildomain\"]"));
	
	
	public static final Target DEPLOY_REPORTER			= Target.the("Select locutor").located(By.id("select2-chosen-10"));
	public static final Target INPUT_WRITE_REPORTER		= Target.the("Input para indicar el locutor").located(By.id("s2id_autogen10_search"));
	
	
	public static final Target DEPLOY_ATTENDEELIST		= Target.the("Select lista de asistentes").located(By.xpath("//*[@id=\"s2id_autogen11\"]/a/span[2]"));
	public static final Target INPUT_WRITE_ATTENDEELIST	= Target.the("Input para indicar los asistentes").located(By.id("s2id_autogen12_search"));	
	public static final Target BTN_ATTENDEELIST			= Target.the("Botón para crear organizador").located(By.xpath("//div[@class=\"field AttendeeList\"]//descendant::a[@class=\"inplace-button inplace-create\"]"));
	

	public static final Target BTN_SAVE_MEETING			= Target.the("Botón para guardar reunión").located(By.xpath("//div[@class=\"tab-pane s-TabInfo ui-tabs-panel ui-corner-bottom ui-widget-content\"]//descendant::div[@title=\"Apply Changes\"]"));
	
	
	public static final Target COLUMN_ID					= Target.the("Columna de registro de reunión").located(By.xpath("//span[text()=\"ID\"]"));
	public static final Target TXT_ASERTION_NAME_MEETING	= Target.the("Asersión para validar creación de reunión").located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[4]/div[3]/div/div[1]/div[2]/a"));
	
	public static final Target BTN_REGRESAR					= Target.the("Botón regresar").located(By.xpath("//*[@id=\"StartSharp_Meeting_MeetingDialog14\"]/div[1]/button"));
	
	
	
	
	
	
	
	
	
	
	
	
}
