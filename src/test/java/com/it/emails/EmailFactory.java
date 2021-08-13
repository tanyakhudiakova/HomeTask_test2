package com.it.emails;

import com.it.utils.Utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmailFactory {
    static ResourceBundle email = ResourceBundle.getBundle("email");
    public static Email getValidEmail() {
        return new Email(email.getString("emailToSmbd"),
                email.getString("inputSubject"),
                email.getString("bodyOfEmail"),
                email.getString("sendButton")
        );
    }

public static Email getRandomEmail() {
    return new Email(Utils.getRandomString(10) + "@gmail.com",
            Utils.getRandomString(10),
            Utils.getRandomString(10),
            Utils.getRandomString(15)
    );
}
/*public static List<Email> getRandomEmails(int count) {
    return (Email) Stream.generate(EmailFactory::getRandomEmail)
            .limit(count)
            .collect(Collectors.toList());
}*/
public static List<Email> getRandomEmails(int count){
    return Stream.generate
            (()-> new Email(
                    Utils.getRandomString(10) + "@gmail.com",
                    Utils.getRandomString(15),
                    Utils.getRandomString(10),
                    Utils.getRandomString(10)
            )).limit(count)
            .collect(Collectors.toList());

}
}
