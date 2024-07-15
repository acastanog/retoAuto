package stepdefinitions;

import com.practica.screenplay.models.UserLoombokData;
import com.practica.screenplay.questions.ValidarTexto;
import com.practica.screenplay.task.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.practica.screenplay.userinterfaces.LoginUI.SPAN_DASHBOARD;
import static com.practica.screenplay.utils.GlobalData.ACTOR;
import static com.practica.screenplay.utils.GlobalData.URL_AMBIENTE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;


public class LoginStepDefinitios {

    @Given("ingreso al aplicativo demo")
    public void ingresoAlAplicativoDemo() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL_AMBIENTE));
    }

    @When("ingreso usuario y contraseña")
    public void ingresoUsuarioYContraseña(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onTheSite(UserLoombokData.setData(dataTable).get(0)));
    }

    @Then("valido texto en pantalla (.*)$")
    public void validoTextoEnPantallaTexto(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarTexto.of(SPAN_DASHBOARD), containsString(texto)));
    }
}
