package com.sgtest.programs;

abstract class Sounds{
    abstract void Typesofsounds();
}
class Bike extends Sounds{
    void Typesofsounds()
    {
        String bikesound="Vroom ";
        System.out.println("Sound of bike engine:"+bikesound);
    }
}
class Animals extends Sounds{
    void Typesofsounds()
    {
        String animalsound="onomatopoeias";
        System.out.println("Sound of animals:"+animalsound);
    }
}
class Birds extends Sounds{
    void Typesofsounds()
    {
        String birdsound="fee-bee";
        System.out.println("sound of bird phoebe :"+birdsound);
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Sounds ss=null;
        Bike o1=new Bike();
        Animals o2=new Animals();
        Birds o3=new Birds();

        ss=o1;
        ss.Typesofsounds();
        ss=o2;
        ss.Typesofsounds();
        ss=o3;
        ss.Typesofsounds();
    }
}
