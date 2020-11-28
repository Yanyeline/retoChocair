package com.opensourcecms.demo.s1.certification.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AllPosts extends PageObject {

    public static Target TXT_SEARCH = Target.the("").located(By.id("post-search-input"));
    public static Target BTN_SEARCH = Target.the("").located(By.id("search-submit"));
    public static Target TBL_POSTS = Target.the("").locatedBy("(//tbody[@id='the-list']//tr//td//strong//a)[1]"); //tbody[@id='the-list']//tr//td//strong//a[contains(text(),'gggg')]
    public static Target TBL_POST = Target.the("").locatedBy("//tbody[@id='the-list']//tr//td//strong//a[contains(text(),'{0}')]"); //tbody[@id='the-list']//tr//td//strong//a[contains(text(),'gggg')]

    public static Target OPTION_EDIT = Target.the("").locatedBy("(//tbody/tr/td/div/span/a[1])[1]"); //(//tbody[@id='the-list']//tr//td//strong//a)[1]
    public static Target OPTION_QUICK_EDIT = Target.the("").locatedBy("(//button[@class='button-link editinline'])[1]"); //(//tbody[@id='the-list']//tr//td//strong//a)[1]

    public static Target TXT_TITLE = Target.the("").locatedBy("(//input[@name='post_title'])[1]");
    public static Target TXT_SLUG = Target.the("").locatedBy("(//input[@name='post_name'])[1]");

    public static Target DDL_MONTH = Target.the("").locatedBy("(//select[@name='mm'])[1]");
    public static Target OPTION_MONTH = Target.the("").locatedBy("(//select[@name='mm']//option[contains(text(),'{0}')])[1]");
    public static Target TXT_DAY = Target.the("").locatedBy("(//input[@name='jj'])[1]");
    public static Target TXT_YEAR = Target.the("").locatedBy("(//input[@name='aa'])[1]");
    public static Target TXT_HOUR = Target.the("").locatedBy("(//input[@name='hh'])[1]");
    public static Target TXT_MINUTES = Target.the("").locatedBy("(//input[@name='mn'])[1]");
    public static Target TXT_PASSWORD = Target.the("").locatedBy("(//input[@name='post_password'])[1]");
    public static Target CHK_PRIVATE = Target.the("").locatedBy("(//input[@name='keep_private'])[1]");
    public static Target CHK_CATEGORY = Target.the("").locatedBy("(//label[@class='selectit']//input)[1]");
    public static Target TXT_TAGS = Target.the("").locatedBy("(//textarea[@name='tax_input[post_tag]'])[1]");

    public static Target DDL_STATUS = Target.the("").locatedBy("(//select[@name='_status'])[1]");
    public static Target OPTION_STATUS = Target.the("").locatedBy("(//select[@name='_status']//option[contains(text(),'{0}')])[1]");

    public static Target CHK_STYCKY = Target.the("").locatedBy("(//input[@name='sticky'])[1]");
    public static Target BTN_UPDATE = Target.the("").locatedBy("(//tbody/tr/td/div/button[contains(text(),'Update')])[1]");//(//tbody/tr/td/div/button[2])[1]


}
