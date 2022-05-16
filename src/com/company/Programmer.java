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

    @Override
    public void learn(){
        System.out.print("Learning coding. ");
    }

    @Override
    public void walk(){
        System.out.print("Walks in the park. ");
    }

    @Override
    public void eat(){
        System.out.print("Eats vegetables. ");
    }

    public void coding(){
        System.out.print("Programmer coding.");
    }

    public String toString(){
        learn();
        walk();
        eat();
        coding();
        return "\nName: "+getName()+" Designation: "+getDesignation()+" Compani name: "+getCompanyName();
    }

}
