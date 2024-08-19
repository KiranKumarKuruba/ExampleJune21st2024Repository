package com.sgtest.programs;

    abstract class Employees{
        Employees(int id,String Name){
            System.out.println("employee id:"+id);
            System.out.println("employee name:"+Name);
        }
        Employees(int sal,int phno){
            System.out.println("employee salary:"+sal);
            System.out.println("contact:"+phno);
        }
        Employees(String role){
            System.out.println("employee role:"+role);
        }
    }
    class Department extends Employees{
        Department(int eid,String Name){
            super(eid,Name);
        }
        Department(int sal,int phno){
            super(sal,phno);
        }
        Department(String role){
            super(role);
        }
    }

    public class Assignment1 {
        public static void main(String[] args) {
            Department k=new Department(01,"ARUNA");
            Department k1=new Department(200000,987654321);
            Department k2=new Department("SOFTWARE TESTER");
        }
    }


