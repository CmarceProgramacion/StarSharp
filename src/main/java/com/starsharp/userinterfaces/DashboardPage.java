package com.starsharp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class DashboardPage extends PageObject {
    public static final Target LIST_ORGANIZATION = Target.the("Organization drop-down list ").locatedBy("//span[contains(.,'Organization')]");
    public static final Target LIST_BUSINESS_UNITS = Target.the("Business Units rop-down list").locatedBy("//span[@class='s-sidebar-link-text'][contains(.,'Business Units')]");
    public static final Target BUTTON_NEW_BUSINESS_UNITS = Target.the("Button to add new business unit").locatedBy("//div[@class='tool-button add-button icon-tool-button']");
    public static final Target INPUT_NAME_BUSINESS_UNITS = Target.the("Text field for entering the business unit name").locatedBy("//input[starts-with(@id,'Serenity_Pro_Organization_BusinessUnitDialog')][@name='Name']");
    public static final Target SELECT_PARENT_UNIT = Target.the("").locatedBy("//span[starts-with(@id,'select2-chosen')]");
    public static final Target INPUT_PARENT_UNIT = Target.the("").locatedBy("//input[starts-with(@class,'select2-input')]");
    public static final Target BUTTON_SAVE = Target.the("").locatedBy("//div[starts-with(@class,'tool-button save')]");
    public static final Target INPUT_SEARCH_NAME = Target.the("").locatedBy("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']");
    public static final Target ELEMENT_NAME = Target.the("").locatedBy("//a[contains(text(),'{0}')]");

}


