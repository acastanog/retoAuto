package com.practica.screenplay.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ValidarTexto implements Question<String> {

    Target element;

    public ValidarTexto(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static ValidarTexto of(net.serenitybdd.screenplay.targets.Target element) {
        return Instrumented.instanceOf(ValidarTexto.class).withProperties(element);
    }
}
