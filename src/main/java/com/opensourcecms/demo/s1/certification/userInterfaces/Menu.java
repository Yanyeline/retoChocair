package com.opensourcecms.demo.s1.certification.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Menu extends PageObject {

    public static Target ICON_POSTS = Target.the("").located(By.xpath("//div[@id='adminmenuwrap']/ul[@id='adminmenu']/li[@id='menu-posts']/a[1]"));
    public static Target OPTION_ADD_NEW_POST = Target.the("").located(By.xpath("//ul[@id='adminmenu']//li[@id='menu-posts']/ul/li/a[contains(text(),'Add New')]"));
    public static Target OPTION_POSTS = Target.the("").located(By.xpath("//ul[@id='adminmenu']//li[@id='menu-posts']/ul/li/a[contains(text(),'NewPosts')]"));
    public static Target OPTION_ADD_NEW_POST2 = Target.the("").located(By.xpath("//div[@class='wrap']//a[contains(text(),'Add New')]"));

}
