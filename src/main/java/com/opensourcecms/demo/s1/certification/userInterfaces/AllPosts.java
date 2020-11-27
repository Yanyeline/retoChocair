package com.opensourcecms.demo.s1.certification.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AllPosts extends PageObject {

    public static Target TXT_SEARCH = Target.the("").located(By.id("NewPosts"));
    public static Target BTN_SEARCH = Target.the("").located(By.id("search-submit"));
    public static Target TBL_POSTS = Target.the("").locatedBy("(//tbody[@id='the-list']//tr//td//strong//a)[1]"); //tbody[@id='the-list']//tr//td//strong//a[contains(text(),'gggg')]
    public static Target OPTION_EDIT = Target.the("").locatedBy("(//a[contains(text(),'Edit') and @href])[1]"); //(//tbody[@id='the-list']//tr//td//strong//a)[1]
    public static Target OPTION_QUICK_EDIT = Target.the("").locatedBy("(//button[@class='button-link editinline'])[1]"); //(//tbody[@id='the-list']//tr//td//strong//a)[1]

    public static Target TXT_TITLE = Target.the("").locatedBy("(//input[@name='post_title'])[1]"); //(//tbody[@id='the-list']//tr//td//strong//a)[1]




}
