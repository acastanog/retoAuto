package stepdefinitions;

import com.practica.screenplay.models.RegistroCandidatoLoombokData;;
import com.practica.screenplay.questions.ValidarTexto;
import com.practica.screenplay.task.RegistroCandidato;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.practica.screenplay.userinterfaces.RegistroClienteUI.LABEL_VALID_APLICATION_STAGE;
import static com.practica.screenplay.userinterfaces.RegistroClienteUI.SPAN_VALID_APLICATION_STAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class RegistroCandidatoStepDefinitions {

    @Then("registro candidato")
    public void registroEmpleado(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroCandidato.onTheSite(RegistroCandidatoLoombokData.setData(dataTable).get(0)));
    }

    @Then("validar candidato registrado {string} y {string}")
    public void validarEmpleadoRegistrado(String texto, String nombre) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarTexto.of(SPAN_VALID_APLICATION_STAGE), containsString(texto)));
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarTexto.of(LABEL_VALID_APLICATION_STAGE), containsString(nombre)));


    }

}
