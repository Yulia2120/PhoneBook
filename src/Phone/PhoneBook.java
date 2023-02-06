package Phone;

import java.util.ArrayList;

public class PhoneBook {
   private int Id;
   private String Name;
   private String Number;

   ArrayList<ArrayList<String>> phoneBook = new ArrayList<>();
   ArrayList<String> nameList = new ArrayList<>();
   ArrayList<String> numList = new ArrayList<>();
    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumber(String number) {
        Number = number;
    }
    //ADDING METHOD
    public void addName(String name, String number){
        nameList.add(name);
        numList.add(number);
    }
    //INSERTION METHOD
    public void insert(int j, String w, String q){
        try{
            nameList.get(j);
            nameList.add(j,w);
            numList.add(j,q);

        }
        catch (IndexOutOfBoundsException b){
            System.out.println("Contact index not found, Try again!");
        }
    }
    //DELETION METHOD
    public void delete(String d){
        for (int i =0; i<=nameList.size(); i++){
            if(d.equals(nameList.get(i))) {
                nameList.remove(i);
                numList.remove(i);
            }
        }
    }
}
