package com.it.tests;

import com.it.App;
import com.it.emails.Email;
import com.it.emails.EmailFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    static App app = new App();
    static User validUser = UserFactory.getValidUser();
    static Email validEmail = EmailFactory.getValidEmail();


    @AfterSuite
    public void tearDown() {
        app.common.stopApp();

    }
}
