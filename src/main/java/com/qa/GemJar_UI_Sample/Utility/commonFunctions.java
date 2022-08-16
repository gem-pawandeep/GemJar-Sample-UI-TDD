package com.qa.GemJar_UI_Sample.Utility;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;

public class commonFunctions {
    /* the methods which are commonly use in more than 1 test case
    are written here and shall be invoked through other classes when needed.
    */
    public static void validateLink(String expectedURL) {
        DriverAction.setImplicitTimeOut(100);
        DriverAction.setPageLoadTimeOut(100);
        DriverAction.setScriptTimeOut(100);
        DriverAction.waitSec(5);
        String actualURL = DriverAction.getCurrentURL();
        if (actualURL.equals(expectedURL)) {
            GemTestReporter.addTestStep("Url Validation", "Successful<br>Expected URL: "+expectedURL+"<br>Actual URL: "+actualURL, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Url Validation","Unsuccessful<br>Expected URL: "+expectedURL+"<br>Actual URL: "+actualURL , STATUS.PASS);
        }
    }
}