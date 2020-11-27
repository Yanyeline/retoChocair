package com.opensourcecms.demo.s1.certification.userInterfaces;

import com.opensourcecms.demo.s1.certification.utils.constants.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(Constants.URL_LOGIN_PAGE)

public class Login extends PageObject {

    public static Target TXT_USER = Target.the("").located(By.id("user_login"));
    public static Target TXT_PASSWORD = Target.the("").located(By.id("user_pass"));
    public static Target BTN_LOGIN = Target.the("").located(By.id("wp-submit"));

}
