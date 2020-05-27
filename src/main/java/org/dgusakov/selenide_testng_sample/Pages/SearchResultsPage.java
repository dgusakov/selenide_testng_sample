package org.dgusakov.selenide_testng_sample.Pages;


import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {

    public SelenideElement resultCountText = $(byClassName("serp-adv__found"));

    public SearchResultsPage resultsShouldBeMoreThanThousand(){
        resultCountText.shouldBe(visible);
        resultCountText.shouldNotBe(empty);
        // Предполагаем, что искомая строка будет состоять из 3 слов только тогда, когда результатов меньше 1000
        Assert.assertTrue(resultCountText.text().split("\\s").length > 3,
                "Total results count is less than a 1000!");
        return this;
    }

}
