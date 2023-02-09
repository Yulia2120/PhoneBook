import Phone.Category;
import Phone.PhoneBook;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Category> books = new ArrayList<>();
        books.add(new Category("Joe", "+3809657442", "other"));
        books.add(new Category("Anton", "+3809657453", "work"));
        books.add(new Category("Alice", "+3809657430", "family"));
        books.add(new Category("Jonn", "+3809657442", "other"));
        books.add(new Category("Alina", "+3809657453", "work"));
        books.add(new Category("Bill", "+3809657430", "family"));

        for( PhoneBook s : books) {
            s.printPhoneBook();
        }


    }
}
