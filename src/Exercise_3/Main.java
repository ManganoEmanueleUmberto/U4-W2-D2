package Exercise_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, telephoneNumber;
        int choice;

        Map<String, String> contacts = new HashMap<>();
        while (true) {
            System.out.println("\n***********MENU*************\n\n1. Add a new number\n2. Remove a contact\n3. Search a contact by phone number\n4. Search a contact by name\n5. Show all the contacts\n0. Exit");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) break;
            switch (choice) {
                case 1:
                    NewKeyValue(contacts);
                    break;

                case 2:
                    System.out.println("Enter the contact name you wish to remove: ");
                    name = sc.nextLine();
                    RemoveKeyValue(contacts, name);
                    break;

                case 3:
                    System.out.println("Enter the telephoe number to search");
                    telephoneNumber = sc.nextLine();
                    SearchKeyValueByNumber(contacts, telephoneNumber);
                    break;

                case 4:
                    System.out.println("Enter the Name to search: ");
                    name = sc.nextLine();
                    SearchKeyValueByName(contacts, name);
                    break;
                case 5:
                    for (Map.Entry<String, String> entry : contacts.entrySet()) {
                        System.out.println("Name: " + entry.getKey() + " Telephone Number: " + entry.getValue());
                    }
                    break;
            }
        }
    }

    public static void NewKeyValue(Map<String, String> contacts) {
        String name, telephoneNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the telephone number: ");
        telephoneNumber = sc.nextLine();

        contacts.put(name, telephoneNumber);


    }

    public static void RemoveKeyValue(Map<String, String> contacts, String name) {
        contacts.remove(name);
    }

    public static void SearchKeyValueByName(Map<String, String> contacts, String name) {

        if (contacts.containsKey(name)) {
            System.out.println("Name: " + name);
            System.out.println("Telephone Number: " + contacts.get(name));
        } else {
            System.out.println("Name not found");
        }
    }

    public static void SearchKeyValueByNumber(Map<String, String> contacts, String telephoneNumber) {
        boolean found = false;
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(telephoneNumber)) {
                System.out.println("Contact found: " + entry.getKey() + " - " + entry.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found");
        }
    }
}
