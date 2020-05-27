package org.dgusakov.selenide_testng_sample;


import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.*;



@Listeners({ScreenShooter.class})
public class SearchTests extends TestBase{

    @Parameters({ "search-string" })
    @Test
    public void testSearchResultsCount(String text){
        mainPage.openPage().search(text);
        searchResultsPage.resultsShouldBeMoreThanThousand();
    }

}
