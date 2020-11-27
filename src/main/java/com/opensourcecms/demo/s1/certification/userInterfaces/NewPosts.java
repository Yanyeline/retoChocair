package com.opensourcecms.demo.s1.certification.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewPosts extends PageObject {

    public static Target TXT_TITLE = Target.the("").located(By.id("post-title-0"));
    public static Target TXT_BLOCK_PARAGRAPH = Target.the("").located(By.xpath("//div[@id='wpbody-content']//textarea[@role='button']"));
    public static Target TXT_COMPLETE_COMPONENT = Target.the("").located(By.xpath("//div[@class='components-autocomplete']//p"));
    public static Target BTN_ADD_BLOCK = Target.the("").located(By.id("(//div[@class='editor-inserter block-editor-inserter']//button)[1]"));

    public static Target ICON_DISABLE_COMPONENTS = Target.the("").located(By.xpath("(//div[@class='components-popover__content']//button)[2]"));

    public static Target OPTION_DOCUMENT = Target.the("").located(By.xpath("//button[contains(text(),'Document')]"));

    //public static Target BTN_VISIBILITY = Target.the("").located(By.xpath("//div[@class='components-panel__row edit-post-post-visibility']//button"));
    //public static Target OPTION_VISIBILITY = Target.the("").locatedBy("//div[@class='editor-post-visibility__choice']//label[contains(text(),'{0}')]//parent::div//input");

    public static Target OPTION_PUBLISH = Target.the("").located(By.xpath("//div[@class='components-panel__row edit-post-post-schedule']//button"));
    public static Target TXT_DAY = Target.the("").located(By.xpath("//div[@class='components-popover__content']//input[contains(@class,'_time-field-day')]"));
    public static Target DDL_MONTH = Target.the("").located(By.xpath("(//div[@class='components-popover__content']//select)[1]"));

    public static Target OPTION_SELECT_MONTH = Target.the("").locatedBy("(//div[@class='components-popover__content']//select//option[contains(text(),'{0}')])[1]");
    public static Target TXT_YEAR = Target.the("").located(By.xpath("//div[@class='components-popover__content']//input[contains(@class,'_time-field-year')]"));
    public static Target TXT_HOUR = Target.the("").located(By.xpath("//div[@class='components-popover__content']//input[contains(@class,'_time-field-hours')]"));
    public static Target TXT_MINUTES = Target.the("").located(By.xpath("//div[@class='components-popover__content']//input[contains(@class,'_time-field-minutes')]"));

    public static Target OPTION_TYPE_TIME = Target.the("").locatedBy("//div[@class='components-popover__content']//button[contains(text(),'{0}')]");

    public static Target DDL_FORMAT = Target.the("").located(By.xpath("//select[contains(@id,'post-format-selector')]"));
    public static Target OPTION_FORMAT = Target.the("").locatedBy("//select[contains(@id,'post-format-selector')]//option[contains(text(),'{0}')]");

    public static Target OPTION_FORMATS = Target.the("").locatedBy("//div[@class='components-base-control__field']//label[contains(text(),'{0}')]//parent::div//input");

    public static Target OPTION_CATEGORIES = Target.the("").located(By.xpath("//button[contains(text(),'Categories')]"));
    public static Target OPTION_ADD_CATEGORIES = Target.the("").located(By.xpath("//button[contains(text(),'Add New Category')]"));

    public static Target TXT_CATEGORY = Target.the("").located(By.xpath("//input[@class='editor-post-taxonomies__hierarchical-terms-input' and @type='text']"));
    public static Target BTN_NEW_CATEGORY = Target.the("").locatedBy("//button[@class='components-button editor-post-taxonomies__hierarchical-terms-submit is-button is-default' and contains(text(),'Add New Category')]");

    public static Target OPTION_TAGS = Target.the("").located(By.xpath("//button[contains(text(),'Tags')]"));
    public static Target TXT_NEW_TAG = Target.the("").located(By.xpath("//input[@class='components-form-token-field__input']"));

    public static Target OPTION_EXERPT = Target.the("").located(By.xpath("//button[contains(text(),'Excerpt')]"));
    public static Target TXT_EXERPT = Target.the("").located(By.xpath("//textarea[@class='components-textarea-control__input']"));

    public static Target BTN_PUBLISH = Target.the("").located(By.xpath("//div[@class='edit-post-header__settings']//button[contains(text(),'Publis')]"));
    public static Target BTN_PUBLISH2 = Target.the("").located(By.xpath("//div[@class='editor-post-publish-panel__header-publish-button']//button[contains(text(),'Publis')]"));

    public static Target BTN_VISIBILITY = Target.the("").located(By.xpath("//div[@class='editor-post-publish-panel__content']//button[contains(text(),'Visibility')]"));
    public static Target OPTION_VISIBILITY = Target.the("").locatedBy("//label[contains(text(),'{0}')]");

    public static Target BTN_VIEW_POST = Target.the("").locatedBy("//div[@class='post-publish-panel__postpublish-buttons']//a[contains(text(),'View Post')]");

}
