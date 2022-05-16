package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void Singing(){
        System.out.print(getName()+"Singer singing ");
    }
    public void PlayGitar(){
        System.out.print("and Play Gitar. ");
    }

    public String getBandName() {
        return bandName;
    }

    @Override
    public void learn(){
        System.out.print("Learning a new song.");
    }

    @Override
    public void walk(){
        System.out.print("Walks in the city and park. ");
    }

    @Override
    public void eat(){
        System.out.print("Eats fruit and  vegetables. ");
    }

    @Override
    public String toString(){
        super.learn();
        super.walk();
        super.eat();
        Singing();
        PlayGitar();
        return "\nName: "+getName()+" Designation:"+getDesignation()+" Band name:"+getBandName();
    }

}
