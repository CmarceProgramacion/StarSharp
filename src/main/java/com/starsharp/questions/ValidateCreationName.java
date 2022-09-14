package com.starsharp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.starsharp.userinterfaces.DashboardPage.LABEL_ELEMENT_NAME;

public class ValidateCreationName implements Question<Boolean> {
    private String name;

    public ValidateCreationName(String name) {
        this.name = name;
    }

    public static ValidateCreationName verify(String name) {
        return new ValidateCreationName(name);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LABEL_ELEMENT_NAME.of(name).isVisibleFor(actor);
    }
}
