package startsharp.navigation;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessUnit {

	public static final Target BTN_NEW_BUSINESS_UNIT	= Target.the("Botón para crear Unidad de Negocio").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
	public static final Target INPUT_NAME				= Target.the("Input para nombre de unidad").located(By.id("StartSharp_Organization_BusinessUnitDialog7_Name"));
	public static final Target BTN_SAVE					= Target.the("Botón para guardar").located(By.xpath("//*[@id=\"StartSharp_Organization_BusinessUnitDialog7_Toolbar\"]/div/div/div/div[1]/div/span"));
	public static final Target COLUMN_ID				= Target.the("Columna del Id del registro").located(By.xpath("//div[@class=\"ui-state-default slick-header-column slick-header-sortable ui-sortable-handle\"][1]"));	
	public static final Target TXT_ASERTION_NAME		= Target.the("Aserción para validar nombre de Unidad creada").located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[4]/div[3]/div/div[1]/div[2]/a"));
	public static final Target WINDOW_CREATE			= Target.the("Aserción para validar nombre de Unidad creada").located(By.className("ui-dialog ui-corner-all ui-widget ui-widget-content ui-front s-Dialog s-BusinessUnitDialog s-Organization-BusinessUnitDialog ui-draggable ui-resizable flex-layout"));

}
