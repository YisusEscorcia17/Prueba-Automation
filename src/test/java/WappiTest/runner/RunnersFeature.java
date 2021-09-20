package WappiTest.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
// si se desea ejecutar los casos por separados agregar  el tag deseado
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/Casos.feature" }, glue = { "Wappi.Definitions" })

public class RunnersFeature {

}


//consultar el resultado de la prueba en la ruta C:\Users\USUARIO\Downloads\PruebaBase\target\site\serenity