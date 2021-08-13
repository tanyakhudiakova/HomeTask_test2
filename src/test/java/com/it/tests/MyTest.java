package com.it.tests;
import com.it.App;
import com.it.emails.Email;
import com.it.emails.EmailFactory;
import com.it.pages.DashBoardPage;
import com.it.pages.LoginPage;
import com.it.users.User;
import com.it.users.UserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class MyTest extends BaseTest {

    @Test
    public void myTest() throws InterruptedException, MalformedURLException {
        final List<User> randomUsers = UserFactory.getRandomUsers(200);
        randomUsers.forEach(System.out::println);
        app.login.login(validUser);
        Assert.assertEquals(app.board.getLbUserEmail(), validUser.email);

    }

    @Test
    public void myTestNumberTwo() {
        final List<User> randomUsers = UserFactory.getRandomUsers(1);
        randomUsers.forEach(System.out::println);
        app.login.login(validUser);
        Assert.assertEquals(app.board.getLbUserEmail(), validUser.email);
        final List<Email> randomEmails = EmailFactory.getRandomEmails(1);
        randomEmails.forEach(System.out::println);
        app.email.email(validEmail);
    }

    }


