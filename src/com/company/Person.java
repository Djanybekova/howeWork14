package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void learn(){
        System.out.print("learning  ");
    }

    public void walk(){
        System.out.print("Walks ");
    }

    public void eat(){
        System.out.print("Eats  ");
    }



}
