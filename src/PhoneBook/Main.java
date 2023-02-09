package PhoneBook;

public class Main {
    public static void main(String[] args){

        Category book = new Category();
        book.phoneBook.add(book.nameList);
        book.phoneBook.add(book.numList);
        book.phoneBook.add(book.catList);

        book.addName("Joe", "+380986785456", "family");
        book.addName("Jonn", "+3809657442", "other");
        book.addName("Alina", "+3809657453", "work");
        book.addName("Bill", "+3809657430", "family");
        book.addName("Alice", "+3809657430", "work");

        System.out.println("---------------------------------------------");
        book.print();
        System.out.println("---------------------------------------------");
        book.searchName("Jonn");
        System.out.println("---------------------------------------------");
        book.searchCategory("work");
        System.out.println("---------------------------------------------");
        book.insert(4, "Sara", "+3806376811122", "work");
        book.print();
        System.out.println("---------------------------------------------");
        book.delete("Bill");
        book.print();
        System.out.println("---------------------------------------------");



    }
}
