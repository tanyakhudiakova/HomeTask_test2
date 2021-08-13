package com.it.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class BasePage {

    static protected WebDriver driver;
    private static int count;

    static { //  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.i.ua");

    }
    public BasePage() {
        PageFactory.initElements(driver, this);
    }


    public void takeSnapShot (WebDriver driver){

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("build//screenshot//screen" + count + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path content = Paths.get("build//screenshot//screen" + count + ".png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("My attachment", is);
        } catch (IOException e) {
            //NOP
        }
        count++;
    }
}

