package PhoneBookV01;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void callContact(String name) {
        findNumber(name);

        if (!Objects.equals(name, "")) {
            System.out.println("Calling " + name); //Todo
        } else {
            System.out.println("Could not find " + name);
        }
    }

    public static void saveContact(String name, long number) {
        System.out.println("Saving contact " + name + " : " + number);
        try {
            File file = new File("contact.txt");
            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.println(name + " : " + number);
            pw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findNumber(String name) {

        try (Scanner in = new Scanner(new File("contact.txt"))) {
            String[] s;
            boolean foundPerson = false;
            while (in.hasNextLine()) {
                s = in.nextLine().split(" : ");
                if (s[0].equals(name)) {
                    System.out.println("The number " + name + " - " + s[1]);
                }
                foundPerson = true;

            }
            if (!foundPerson) //Todo
                System.out.println("Could not find " + name);
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void displayMenu() {
        try {
            Scanner in = new Scanner(System.in);
            String name;
            do {
                System.out.println("Select the option:");
                System.out.println("1. Call Contact");
                System.out.println("2. Save Contact");
                System.out.println("3. Find Number");

                int choice = in.nextInt();
                in.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("\nWho would you like to call? (Firstname, Lastname)");
                        name = in.nextLine();
                        callContact(name);
                    }
                    case 2 -> {
                        System.out.println("\nWhat is the name of the person you would like to save? (Firstname, Lastname)");
                        name = in.nextLine();
                        System.out.println("What is the phone of the person you are  saving? (+380982345867)");
                        long number = in.nextLong();
                        in.nextLine();
                        saveContact(name, number);
                    }
                    case 3 -> {
                        System.out.println("\nWhat is the name of the person whose phone number you are searching? (Firstname, Lastname)");
                        findNumber(in.nextLine());
                    }
                    default -> {

                    }
                }
                System.out.println("Do you wish to perform another action? (Y/N)");
                if (in.next().toLowerCase().charAt(0) != 'y')
                    break;
            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}