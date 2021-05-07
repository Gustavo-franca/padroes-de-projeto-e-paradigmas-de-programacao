package Encapsulamento.exemplo2.v2;


import java.util.ArrayList;
import java.util.List;

public class People {
     
    private String name;
    private int age;
    private List<String> phones;
    private People mother;
    
    public People(String name, int age,People mother){
        this.name = name;
        this.age = age;
        this.phones = new ArrayList<>();
        this.mother = mother;
    }

    public String getMother() {
        return mother.name();
    }

    public String name(){
        return this.name;
    }
    public void name(String name){
        this.name = name;
    }

    public void age(int age){
        this.age = age;
    }
    public int age(){
        return this.age;
    }
    public void addPhone(String phone){
       if(phone.matches("([0-9]+)")){
           this.phones.add(phone);
           return;
       };
       
       throw new Error("invalid phone number format!");
    }

    public List<String> getPhones(){
        return new ArrayList<String>(this.phones);
    }
}

