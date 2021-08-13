package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage{
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbUserEmail;


    public String getLbUserEmail() {
        return lbUserEmail.getText();
    }

    @FindBy(xpath = "//p[@class='make_message']")
    private WebElement lbSendMessage;

    public String getLbSendMessage() {
        return lbSendMessage.getText();
    }

}
