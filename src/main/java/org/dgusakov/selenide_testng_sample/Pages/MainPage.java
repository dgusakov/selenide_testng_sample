package org.dgusakov.selenide_testng_sample.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class MainPage {

    public SelenideElement searchField = $(byId("text"));

    public MainPage openPage(){
        open("/");
        return this;
}

    public MainPage search(String text){
        searchField.setValue(text).pressEnter();
        return this;
    }

}
