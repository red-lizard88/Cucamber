package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.String.format;

public class HomePage extends BasePage {
    private static final String CUCUMBER_URL = "https://onliner.by/";

    private static final String MENU_SECTION = "//nav[contains(@class, b-top-navigation)]//a [contains(text(),'Автобарахолка')]";
    private static final String MENU_SECTION_ITEMS = "//li[contains(@class, b-main-navigation__dropdown-advert-item)]//span[contains(@class, b-main-navigation__dropdown-advert-value)]";
    private static final String MENU_SECTION2 = "//nav[contains(@class, b-top-navigation)]//span[contains(@class, b-main-navigation__text) and contains(text(), 'Дома и квартиры')]";
    private static final String MENU_SECTION_ITEMS2 = "//li[contains(@class, b-main-navigation__dropdown-advert-item)]//span[contains(@class, b-main-navigation__dropdown-advert-value)]";

    public void openCucumberWebsite() {
        DriverManager.getDriver().get(CUCUMBER_URL);
    }

    public WebElement menuSection() {
        return findElement(By.xpath(MENU_SECTION));
    }

    public List<WebElement> menuSectionItems() {
        return findElements(By.xpath(MENU_SECTION_ITEMS));
    }

    public WebElement menuSection2() {
        return findElement(By.xpath(MENU_SECTION2));
    }

    public List<WebElement> menuSectionItems2() {
        return findElements(By.xpath(MENU_SECTION_ITEMS2));
    }
}
