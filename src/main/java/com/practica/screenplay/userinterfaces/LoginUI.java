package com.practica.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class LoginUI {

    public static final Target TXT_USER = Target.the("TXT USER").located(By.name("username"));
    public static final Target TXT_PASSWORD = Target.the("TXT PASSWORD").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("BTN LOGIN").located(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
    public static final Target SPAN_DASHBOARD = Target.the("SPAN DASHBOARD").located(By.className("oxd-topbar-header-breadcrumb"));



}
