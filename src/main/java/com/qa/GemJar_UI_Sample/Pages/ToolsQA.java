package com.qa.GemJar_UI_Sample.Pages;


import com.gemini.generic.ui.utils.DriverAction;
import com.qa.GemJar_UI_Sample.Objects.ToolsQA_locators;

import java.io.IOException;

public class ToolsQA {

    public static void fillForm(String firstName, String lastName, String email, String gender, String mobile, String month, String year, String path, String address) throws IOException {
        //code
        DriverAction.pageScroll(200, 300);
        DriverAction.waitSec(2);
        DriverAction.click(ToolsQA_locators.Forms, "Forms");
        DriverAction.waitSec(2);
        DriverAction.pageScroll(200, 300);
        DriverAction.click(ToolsQA_locators.PracticeForm, "Practice Form");
        DriverAction.waitSec(2);
        DriverAction.pageScroll(0, 300);
        DriverAction.typeText(ToolsQA_locators.firstName, firstName, "first name");
        DriverAction.waitUntilElementAppear(ToolsQA_locators.lastName,20);
        DriverAction.typeText(ToolsQA_locators.lastName, lastName, "last name");
        DriverAction.waitUntilElementAppear(ToolsQA_locators.email,20);
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
        DriverAction.pageScroll(0, 300);
        DriverAction.typeText(ToolsQA_locators.mobileNo, mobile, "Mobile");
        DriverAction.waitUntilElementAppear(ToolsQA_locators.dob,20);
        DriverAction.click(ToolsQA_locators.dob, "Date of Birth");
        DriverAction.waitUntilElementAppear(ToolsQA_locators.month,20);
        DriverAction.dropDown(ToolsQA_locators.month, month);//July
        DriverAction.waitUntilElementAppear(ToolsQA_locators.years,20);
        DriverAction.dropDown(ToolsQA_locators.years, year); //2000
        DriverAction.waitUntilElementAppear(ToolsQA_locators.date,20);
        DriverAction.click(ToolsQA_locators.date, "1");
        DriverAction.waitUntilElementAppear(ToolsQA_locators.sports,20);
        DriverAction.click(ToolsQA_locators.sports, "sports");
        DriverAction.waitUntilElementAppear(ToolsQA_locators.reading,20);
        DriverAction.click(ToolsQA_locators.reading, "reading");
        DriverAction.waitUntilElementAppear(ToolsQA_locators.music,20);
        DriverAction.click(ToolsQA_locators.music, "music");
        DriverAction.waitUntilElementAppear(ToolsQA_locators.upload,20);
        DriverAction.fileUpload(ToolsQA_locators.upload, path);
        DriverAction.waitUntilElementAppear(ToolsQA_locators.address,20);
        DriverAction.typeText(ToolsQA_locators.address, address, "Address");
    }

}
