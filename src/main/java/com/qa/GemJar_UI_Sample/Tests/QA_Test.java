package com.qa.GemJar_UI_Sample.Tests;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.tdd.GemJarDataProvider;
import com.gemini.generic.tdd.GemjarTestngBase;
import com.gemini.generic.ui.utils.DriverAction;
import com.gemini.generic.ui.utils.DriverManager;
import com.google.gson.JsonObject;
import com.qa.GemJar_UI_Sample.Objects.ToolsQA_locators;
import com.qa.GemJar_UI_Sample.Pages.ToolsQA;
import com.qa.GemJar_UI_Sample.Utility.commonFunctions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QA_Test extends GemjarTestngBase {

    @BeforeMethod
    public void projectSecificBeforemethod() {
        DriverManager.setUpBrowser();
    }
/*
    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void TestCaseName(JsonObject inputData) {
    // code
    try{

        }catch (Exception e){
            GemTestReporter.addTestStep("Execution Failed","Some Error Occurred",STATUS.FAIL);
        }
    }
*/

    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void FormToolsQA(JsonObject inputData) {
        // code
        try {
            String fname = inputData.get("fName").getAsString();
            String lname = inputData.get("lName").getAsString();
            String email = inputData.get("email").getAsString();
            String gender = inputData.get("gender").getAsString();
            String mobile = inputData.get("mobile").getAsString();
            String month = inputData.get("month").getAsString();
            String year = inputData.get("year").getAsString();
            String path = inputData.get("path").getAsString();
            String address = inputData.get("address").getAsString();
            commonFunctions.validateLink(inputData.get("url").getAsString());
            ToolsQA.fillForm(fname, lname, email, gender, mobile, month, year, path, address);
        } catch (Exception e) {
            GemTestReporter.addTestStep("Execution Failed", "Some Error Occurred", STATUS.FAIL);
        }
    }

}
