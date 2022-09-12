package com.starsharp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.starsharp.userinterfaces.DashboardPage.ELEMENT_BUSINESS_UNIT;

public class ValidateMessage implements Question<Boolean> {
    private String nameUnit;

    public ValidateMessage(String nameUnit){
        this.nameUnit =nameUnit;
    }

    public static ValidateMessage verify(String nameUnit){
        return new ValidateMessage(nameUnit);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ELEMENT_BUSINESS_UNIT.of(nameUnit).isVisibleFor(actor);
    }
}
