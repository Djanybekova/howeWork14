package com.company;

public class Dancer extends Person{
    private String groupName;


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void dencing(){
        System.out.print(getName()+" Dancer dencing.");
    }

    @Override
    public void learn(){
        System.out.print("Learning a new dance.");
    }

    @Override
    public void walk(){
        System.out.print("Walks in the city. ");
    }

    @Override
    public void eat(){
        System.out.print("Eats fruit. ");
    }

    @Override
    public String toString(){
        learn();
        walk();
        eat();
        dencing();
        return "\nName: "+getName()+" Designation: "+getDesignation()+" Grop name: "+getGroupName();
    }
}
