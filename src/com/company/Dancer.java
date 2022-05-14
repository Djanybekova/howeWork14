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
        System.out.print(getName()+"Dencing.");
    }

    @Override
    public String toString(){
        super.learn();
        super.walk();
        super.eat();
        dencing();
        return "\nName: "+getName()+" Designation: "+getDesignation()+" Grop name: "+getGroupName();
    }
}
