package Phone;

import java.util.ArrayList;

public class Category extends PhoneBook {
    private String nCategory;

    public Category( String name, String number, String category){
        super(name,number);
        this.nCategory = category;

    }

    public String getCategory() {
        return nCategory;
    }

    @Override
    public void printPhoneBook(){
        System.out.println("\u001B[35m"+"category:"+"\u001B[33m"+getCategory()+" "+"\u001B[35mname: "+"\u001B[33m"+ getName()+" " +"\u001B[35mnumber: "+"\u001B[33m"+getNumber());
    }


}
