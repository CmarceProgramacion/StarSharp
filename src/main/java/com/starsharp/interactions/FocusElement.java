package com.starsharp.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FocusElement implements Interaction {
    private final Target target;

    public FocusElement(Target target) {
        this.target = target;
    }

    public static Performable enfocar(Target target) {
        return Tasks.instrumented(FocusElement.class, target);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement elemento = Serenity.getWebdriverManager()
                .getWebdriver()
                .findElement(By.xpath(target.getCssOrXPathSelector()));

        JavascriptExecutor jse = (JavascriptExecutor) Serenity.getWebdriverManager().getWebdriver();
        jse.executeScript("arguments[0].scrollIntoView()", elemento);

    }
}
