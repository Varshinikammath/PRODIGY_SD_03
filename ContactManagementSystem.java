import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class ContactManagementSystem {

    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Phone: ");
                String phone = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                contacts.add(new Contact(name, phone, email));
                System.out.println("Contact Added Successfully!");

            } 
            
            else if (choice == 2) {

                if (contacts.isEmpty()) {
                    System.out.println("No contacts available.");
                } else {
                    for (int i = 0; i < contacts.size(); i++) {
                        Contact c = contacts.get(i);
                        System.out.println((i + 1) + ". " + c.name + " - " + c.phone + " - " + c.email);
                    }
                }

            } 
            
            else if (choice == 3) {

                System.out.print("Enter contact number to delete: ");
                int index = sc.nextInt();

                if (index > 0 && index <= contacts.size()) {
                    contacts.remove(index - 1);
                    System.out.println("Contact Deleted Successfully!");
                } else {
                    System.out.println("Invalid contact number.");
                }

            } 
            
            else if (choice == 4) {

                System.out.println("Exiting program...");
                break;
            }
        }
    }
}
