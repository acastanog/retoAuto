package com.practica.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class RegistroClienteUI {

    public static final Target BTN_RECRUITMENT = Target.the("BTN Recruitment").located(By.xpath("//span[text()='Recruitment']"));
    public static final Target BTN_ADD_CANDIDATE = Target.the("BTN CANDIDATE").located(By.xpath("//button[text()=' Add ']"));
    public static final Target TXT_FIRST_NAME = Target.the("TXT FIRST NAME").located(By.name("firstName"));
    public static final Target TXT_MIDDLE_NAME = Target.the("TXT MIDDLE NAME").located(By.name("middleName"));
    public static final Target TXT_LAST_NAME = Target.the("TXT LAST NAME").located(By.name("lastName"));
    public static final Target TXT_EMAIL_NAME = Target.the("TXT EMAIL").located(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
    public static final Target SELECT_VACANCY = Target.the("SELECT VACANCY").located(By.className("oxd-select-wrapper"));
    public static final Target SELECT_TYPE_VACANCY = Target.the("TYPE VACANCY").located(By.className("//div[text()='Junior Account Assistant']"));
    public static final Target BTN_SAVE = Target.the("BTN SAVE EMPLOYEE").located(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"));
    public static final Target SPAN_VALID_APLICATION_STAGE = Target.the("SPAN APLICATION STAGE").located(By.xpath("//h6[text()='Application Stage']"));
    public static final Target LABEL_VALID_APLICATION_STAGE = Target.the("SPAN APLICATION STAGE").located(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[1]"));

}
