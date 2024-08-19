package com.sgtest.programs;

abstract class Humans{
    abstract void role();
}
class Man extends Humans{
    void role()
    {
        String role="Husband";
        System.out.println("Role of a man:"+role);
    }
}
class Women extends Humans{
    void role()
    {
        String role="Mother";
        System.out.println("Role Of Women:"+role);
    }
}
class Father extends Humans{
    void role()
    {
        String role="Father";
        System.out.println("Role of a Man:"+role);
    }
}
public class Assignment4 {
    public static void main(String[] args) {
        Humans h=null;
        Man o1=new Man();
        Women o2=new Women();
        Father o3=new Father();

        h=o1;
        h.role();
        h=o2;
        h.role();
        h=o3;
        h.role();
    }
}


