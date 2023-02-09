package PhoneBook;

public interface Phone {
    void addName(String name, String num, String category);
    void insert(int j, String n, String m, String c);
    void delete(String d);
    void searchName(String s);
    void searchCategory(String s);
    void print();

}
