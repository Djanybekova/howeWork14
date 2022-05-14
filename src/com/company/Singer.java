package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void Singing(){
        System.out.print(getName()+"Singing ");
    }
    public void PlayGitar(){
        System.out.print("and Play Gitar. ");
    }

    public String getBandName() {
        return bandName;
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
