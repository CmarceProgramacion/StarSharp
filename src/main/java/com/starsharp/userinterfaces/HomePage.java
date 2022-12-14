package com.starsharp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.HomePage.url")
public class HomePage extends PageObject {
    public static final Target INPUT_USER_NAME = Target.the("Text field corresponding to the user's name").located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("Text field corresponding to the password").located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target BUTTON_SIGN_IN = Target.the("Registration button").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));

}
