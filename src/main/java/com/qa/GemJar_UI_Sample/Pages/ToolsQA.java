package com.qa.GemJar_UI_Sample.Pages;


import com.gemini.generic.ui.utils.DriverAction;
import com.qa.GemJar_UI_Sample.Objects.ToolsQA_locators;

import java.io.IOException;

public class ToolsQA {

    public static void fillForm(String firstName, String lastName, String email, String gender, String mobile, String month, String year, String path, String address) throws IOException {
        //code
        DriverAction.setImplicitTimeOut(100);
        DriverAction.setScriptTimeOut(100);
        DriverAction.setPageLoadTimeOut(100);
        DriverAction.pageScroll(200, 300, true);
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.Forms, "Forms");
        DriverAction.waitSec(2);
        DriverAction.pageScroll(200, 300, true);
        DriverAction.click(ToolsQA_locators.PracticeForm, "Practice Form");
        DriverAction.waitSec(2);
        DriverAction.pageScroll(0, 300, true);
        DriverAction.typeText(ToolsQA_locators.firstName, firstName, "first name");
        DriverAction.waitSec(2);
        DriverAction.typeText(ToolsQA_locators.lastName, lastName, "last name");
        DriverAction.waitSec(2);
        DriverAction.typeText(ToolsQA_locators.email, email, "Email");
        DriverAction.waitSec(2);
        if (gender.equals("male")) {
            DriverAction.click(ToolsQA_locators.male, "Male");
        } else if (gender.equals("female")) {
            DriverAction.click(ToolsQA_locators.female, "Female");
        } else {
            DriverAction.click(ToolsQA_locators.others, "Other");
        }
        DriverAction.waitSec(2);
        DriverAction.pageScroll(0, 300, true);
        DriverAction.typeText(ToolsQA_locators.mobileNo, mobile, "Mobile");
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.dob, "Date of Birth");
        DriverAction.waitSec(2);
        DriverAction.dropDown(ToolsQA_locators.month, month);//July
        DriverAction.waitSec(2);
        DriverAction.dropDown(ToolsQA_locators.years, year); //2000
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.date, "1");
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.sports, "sports");
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.reading, "reading");
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.music, "music");
        DriverAction.waitSec(2);
        DriverAction.fileUpload(ToolsQA_locators.upload, path);
        DriverAction.waitSec(2);
        DriverAction.typeText(ToolsQA_locators.address, address, "Address");
        DriverAction.waitSec(2);
        DriverAction.setBrowserPosition(400, 1000);
        DriverAction.waitSec(2);
        DriverAction.pageScroll(0, 1200, true);
        DriverAction.click(ToolsQA_locators.state, "state");
        DriverAction.click(ToolsQA_locators.NCR, "NCR");
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.city, "city");
        DriverAction.click(ToolsQA_locators.Delhi, "Delhi");
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.submit, "Submit");
    }

}
