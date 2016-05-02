package com.cmax.execise8;

/**
 * Created by Clint on 4/20/2016.
 */
public class Contact {
    private String name;
    private String email;

    Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.println("Name: " + name.toLowerCase());
        System.out.println("Email: " + email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) obj;
        return this.name.equals(other.getName())
                && this.email.equals(other.getEmail());
    }

    public boolean sendEmail(String messge) {
        // code to send email - return false if failure
        return true;
    }
}
