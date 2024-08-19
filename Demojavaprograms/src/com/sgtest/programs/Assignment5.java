package com.sgtest.programs;

abstract  class Smell{
    abstract void smelltype();
}
class Flower extends Smell{
    void smelltype()
    {
        String flowersmell="Sweet";
        System.out.println("Smell Of Jasmine Flower:"+flowersmell);
    }
}
class Diesel extends Smell{
    void smelltype()
    {
        String dieselsmell="virtually odorless";
        System.out.println("Smell Of Diesel:"+dieselsmell);
    }
}
class Petrol extends Smell{
    void smelltype()
    {
        String petrolsmell="sweet and pungent smell";
        System.out.println("smell of petrol:"+petrolsmell);
    }
}
public class Assignment5 {
    public static void main(String[] args) {
        Smell s=null;
        Flower o1=new Flower();
        Diesel o2=new Diesel();
        Petrol o3=new Petrol();


        s=o1;
        s.smelltype();
        s=o2;
        s.smelltype();
        s=o3;
        s.smelltype();
    }

}

