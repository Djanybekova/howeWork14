package com.company;

public class Programmer extends Person{
    private String CompanyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        CompanyName = companyName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void coding(){
        System.out.print(getName()+"Coding.");
    }

    public String toString(){
        super.learn();
        super.walk();
        super.eat();
        coding();
        return "\nName: "+getName()+" Designation: "+getDesignation()+" Compani name: "+getCompanyName();
    }

}
