package com.it.emails;

public class Email {
    public String emailToSmbd;
    public String inputSubject;
    public String bodyOfEmail;
    public String sendButton;

    public Email(String emailToSmbd, String inputSubject, String bodyOfEmail, String sendButton) {
        this.emailToSmbd = emailToSmbd;
        this.inputSubject = inputSubject;
        this.bodyOfEmail = bodyOfEmail;
        this.sendButton = sendButton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (emailToSmbd != null ? !emailToSmbd.equals(email.emailToSmbd) : email.emailToSmbd != null) return false;
        if (inputSubject != null ? !inputSubject.equals(email.inputSubject) : email.inputSubject != null) return false;
        if (bodyOfEmail != null ? !bodyOfEmail.equals(email.bodyOfEmail) : email.bodyOfEmail != null) return false;
        return sendButton != null ? sendButton.equals(email.sendButton) : email.sendButton == null;
    }

    @Override
    public int hashCode() {
        int result = emailToSmbd != null ? emailToSmbd.hashCode() : 0;
        result = 31 * result + (inputSubject != null ? inputSubject.hashCode() : 0);
        result = 31 * result + (bodyOfEmail != null ? bodyOfEmail.hashCode() : 0);
        result = 31 * result + (sendButton != null ? sendButton.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailToSmbd='" + emailToSmbd + '\'' +
                ", inputSubject='" + inputSubject + '\'' +
                ", bodyOfEmail='" + bodyOfEmail + '\'' +
                ", sendButton='" + sendButton + '\'' +
                '}';
    }
}