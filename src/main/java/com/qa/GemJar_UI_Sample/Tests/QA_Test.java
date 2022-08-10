package com.qa.GemJar_UI_Sample.Tests;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.tdd.GemJarDataProvider;
import com.gemini.generic.tdd.GemjarTestngBase;
import com.gemini.generic.ui.utils.DriverManager;
import com.google.gson.JsonObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QA_Test extends GemjarTestngBase {

    @BeforeMethod
    public void projectSecificBeforemethod(){
        DriverManager.setUpBrowser();
    }
/*
    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void TestCaseName(JsonObject inputData) {
    // code
    }
*/

    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void TestCaseName(JsonObject inputData) {
        // code
        GemTestReporter.addTestStep("Test","Details",STATUS.PASS);
    }
}
