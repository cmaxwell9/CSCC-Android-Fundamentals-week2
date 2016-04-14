package com.cmaxw112;

/**
 * Created by Clint on 4/12/2016.
 */
import java.util.ArrayList;
import java.util.List;


class AddressBook {
    private List<Contact> addresses = new ArrayList<>();
    private String name;

    public AddressBook(String name) {
        this.name = name;
    }

    public void addAddress(String name, String address) {
        Contact newContact = new Contact(name, address);
        addresses.add(newContact);
    }

    public String[] getAddresses() {
        String[] allAddresses = new String[addresses.size()];
        for (int i=0; i < addresses.size(); i++) {
            allAddresses[i] = addresses.get(i).toString();
        }
        return allAddresses;
    }

    //nonstatic member class
    private class Contact {
        private String name;
        private String address;

        Contact(String name, String address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Address: " + address;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        AddressBook personal = new AddressBook("Personal");
        personal.addAddress("Bob", "123 Main St");
        personal.addAddress("Sue", "456 High St");

        for (String address: personal.getAddresses()) {
            System.out.println(address);
        }
    }
}
