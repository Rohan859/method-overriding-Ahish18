package com.driver;

public class Main {
   public static class A{
        String meth(){
           return "Invoking method from class A"; 
        }
    }
    public static class B extends A{
        String meth(){
            return "Method is overridden in Extended class B"; 
        }
    }
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.meth());
    }

  
}