package Phone;

import java.util.ArrayList;

public class PhoneBook {

   private String Name;
   private String Number;


   public PhoneBook( String name, String number){
       this.Name = name;
       this.Number = number;
   }
    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setNumber(String number) {
        Number = number;
    }

public void printPhoneBook(){
    System.out.println("\u001B[35mname: "+"\u001B[33m"+ getName()+" " +"\u001B[35mnumber: "+"\u001B[33m"+getNumber());
}

}
