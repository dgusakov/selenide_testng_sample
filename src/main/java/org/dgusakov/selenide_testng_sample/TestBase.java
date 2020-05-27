package org.dgusakov.selenide_testng_sample;


import com.codeborne.selenide.Configuration;
import org.dgusakov.selenide_testng_sample.Pages.MainPage;
import org.dgusakov.selenide_testng_sample.Pages.SearchResultsPage;
import org.testng.annotations.BeforeClass;



public class TestBase {

    public static MainPage mainPage;
    public static SearchResultsPage searchResultsPage;


    @BeforeClass
    public void setUp(){
        Configuration.timeout = 10000;

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://yandex.ru";
        mainPage = new MainPage();
        searchResultsPage = new SearchResultsPage();
    }



}