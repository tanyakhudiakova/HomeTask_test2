package com.it.pages;

import com.it.emails.Email;
import com.it.helpers.EmailHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends BasePage {
 @FindBy (id = "to")
    private WebElement emailToSmbd; //Кому

 @FindBy(xpath = "//input[@name='subject']")
    private WebElement inputSubject;//Тема

 @FindBy(xpath = "//body[@class='Smile']")
    private WebElement bodyOfEmail;//Текст письма

 @FindBy(name = "send")
    private WebElement sendEmail;//Кнопка отправить

    public void createEmail (String emailToSmbd, String inputSubject, String bodyOfEmail, String sendButton){

        sendEmail.sendKeys();



    }

}
