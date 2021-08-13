package com.it.helpers;

import com.it.emails.Email;
import com.it.pages.EmailPage;

public class EmailHelper extends EmailPage {
    public void email(Email email) {
    email(email.emailToSmbd, email.inputSubject, email.bodyOfEmail);
}

    private void email(String emailToSmbd, String inputSubject, String bodyOfEmail) {
    }

}
