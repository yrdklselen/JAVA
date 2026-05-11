/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication42lab13;


class Employee extends Person {
    public Employee(String name,int age){
       super(name,age);
    }
     public String toString(){
            return super.toString();
        }
     public boolean equals(Object o){
     if((o instanceof Employee)==false)
         return false;
     Employee other=(Employee) o;
     return this.getName().equals(other.getName())&&this.getAge()==other.getAge();
     
}
}
