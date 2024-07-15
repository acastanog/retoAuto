package com.practica.screenplay.task;

import com.practica.screenplay.models.RegistroCandidatoLoombokData;
import com.practica.screenplay.userinterfaces.RegistroClienteUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class RegistroCandidato implements Task {

    RegistroCandidatoLoombokData registroCandidatoLoombokData;

    public RegistroCandidato(RegistroCandidatoLoombokData registroCandidatoLoombokData) {
        this.registroCandidatoLoombokData = registroCandidatoLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegistroClienteUI.BTN_RECRUITMENT, isVisible()).forNoMoreThan(3).seconds(),
                JavaScriptClick.on(RegistroClienteUI.BTN_RECRUITMENT),
                WaitUntil.the(RegistroClienteUI.BTN_ADD_CANDIDATE, isVisible()).forNoMoreThan(3).seconds(),
                JavaScriptClick.on(RegistroClienteUI.BTN_ADD_CANDIDATE),
                Enter.theValue(registroCandidatoLoombokData.getFirstName()).into(RegistroClienteUI.TXT_FIRST_NAME),
                Enter.theValue(registroCandidatoLoombokData.getMiddleName()).into(RegistroClienteUI.TXT_MIDDLE_NAME),
                Enter.theValue(registroCandidatoLoombokData.getLastName()).into(RegistroClienteUI.TXT_LAST_NAME),
                Enter.theValue(registroCandidatoLoombokData.getEmail()).into(RegistroClienteUI.TXT_EMAIL_NAME),
                JavaScriptClick.on(RegistroClienteUI.SELECT_VACANCY),
                WaitUntil.the(RegistroClienteUI.SELECT_TYPE_VACANCY, isVisible()).forNoMoreThan(3).seconds(),
                JavaScriptClick.on(RegistroClienteUI.SELECT_TYPE_VACANCY),
                JavaScriptClick.on(RegistroClienteUI.BTN_SAVE),
                WaitUntil.the(RegistroClienteUI.SPAN_VALID_APLICATION_STAGE, isVisible()).forNoMoreThan(5).seconds()


        );

    }

    public static RegistroCandidato onTheSite(RegistroCandidatoLoombokData registroCandidatoLoombokData) {
        return Instrumented.instanceOf(RegistroCandidato.class).withProperties(registroCandidatoLoombokData);
    }

}
