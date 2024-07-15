package com.practica.screenplay.task;
import com.practica.screenplay.models.UserLoombokData;
import com.practica.screenplay.userinterfaces.LoginUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Login implements Task {

    UserLoombokData userLoombokData;

    public Login(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginUI.TXT_USER, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(userLoombokData.getUser()).into(LoginUI.TXT_USER),
                Enter.theValue(userLoombokData.getPassword()).into(LoginUI.TXT_PASSWORD),
                JavaScriptClick.on(LoginUI.BTN_LOGIN),
                WaitUntil.the(LoginUI.SPAN_DASHBOARD, isVisible()).forNoMoreThan(10).seconds()


        );

    }

    public static Login onTheSite(UserLoombokData userLoombokData) {
        return Instrumented.instanceOf(Login.class).withProperties(userLoombokData);
    }
}
