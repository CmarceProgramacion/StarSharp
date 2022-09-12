package com.starsharp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target INPUT_USER_NAME= Target.the("Campo de texto correspondiente al nombre del usuario").located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD=Target.the("Campo de texto Correspondiente al password").located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target BUTTON_SIGN_IN=Target.the("Boton para registrarse").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));



}
