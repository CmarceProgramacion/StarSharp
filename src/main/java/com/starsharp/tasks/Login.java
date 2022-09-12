package com.starsharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.starsharp.userinterfaces.LoginPage.*;

public class Login implements Task {
    private String user;
    private String password;


    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Performable withData(String user, String password) {
        return Tasks.instrumented(Login.class, user, password);
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


