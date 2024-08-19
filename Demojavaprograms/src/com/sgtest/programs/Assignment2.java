package com.sgtest.programs;

abstract class Vehicle{
    {
        System.out.println("Vehicle name");
    }
}
class Wheeler extends Vehicle{
    void Vehiclename(String name){
        System.out.println(name+" ");
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        Wheeler o1=new Wheeler();
        o1.Vehiclename("aruna akka favorite vehicle:"+"REMOTE CAR");
    }
}


