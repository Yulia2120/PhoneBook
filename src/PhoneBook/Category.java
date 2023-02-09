package PhoneBook;

import java.util.ArrayList;

public class Category extends PhoneBook implements Phone{
    String Category;

    public ArrayList<ArrayList<String>> phoneBook = new ArrayList<>();
    public ArrayList<String> nameList = new ArrayList<>();
    public ArrayList<String> numList = new ArrayList<>();
    public ArrayList<String> catList = new ArrayList<>();

    //ADDING METHOD
    @Override
    public void addName(String name, String number, String category) {
        nameList.add(name);
        numList.add(number);
        catList.add(category);

    }

    //INSERTION METHOD
    @Override
    public void insert(int j, String n, String m, String c) {
        try {
            nameList.get(j);
            nameList.add(j, n);
            numList.add(j, m);
            catList.add(j, c);

        } catch (IndexOutOfBoundsException b) {
            System.out.println("Contact index not found, Try again!");
        }

    }

    //DELETION METHOD
    @Override
    public void delete(String d) {
        for (int i = 0; i <nameList.size(); i++) {
            if (d.equals(nameList.get(i))) {
                nameList.remove(i);
                numList.remove(i);
                catList.remove(i);
            }


        }

    }

    //SEARCHING METHOD
    @Override
    public void searchName(String s) {
        try{
            for(int i=0; i<=nameList.size(); i++){
                if(nameList.get(i).equals(s)){
                    System.out.println(s+ "'s"+" " +"\u001B[32m" + "contact found!\nNumber: "+numList.get(i)+"\u001B[0m");
                    break;
                }
            }
        }
        catch (IndexOutOfBoundsException m){
            System.out.println(s+" not found");
        }

    }

    @Override
    public void searchCategory(String s) {
        try{
            for(int i=0; i<=catList.size(); i++){
                if(catList.get(i).equals(s)){
                    System.out.println(s+ "ing"+" "  + "contact found!\nName: "+nameList.get(i)+" Number: "+numList.get(i));
                    i++;

                }
            }
        }
        catch (IndexOutOfBoundsException m){
            System.out.println(s+" not found");
        }
    }

    @Override
    public void print() {
        for(int i = 0; i <=phoneBook.size(); i++){
            System.out.println("\u001B[35m"+"Contact: "+"\u001B[33m"+nameList.get(i) +" " +numList.get(i)+ "  "+catList.get(i));
        }
    }
}
