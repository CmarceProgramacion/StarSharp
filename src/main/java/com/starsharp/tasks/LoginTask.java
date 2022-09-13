package com.starsharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.starsharp.userinterfaces.HomePage.*;

public class LoginTask implements Task {

    private String user;
    private String password;

    public LoginTask(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Performable withData(String user, String password) {
        return Tasks.instrumented(LoginTask.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(INPUT_USER_NAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_SIGN_IN)
        );
    }
}


