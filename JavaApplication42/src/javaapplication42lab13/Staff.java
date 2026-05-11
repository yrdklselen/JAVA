/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication42lab13;


class Staff extends Employee{
    public Staff(String name,int age){
        super(name,age);
    }
    public String toString(){
        return super.toString();
    }
    public boolean equals(Object o){
        if((o instanceof Staff)==false)
            return false;
        Staff other=(Staff)o;
        return this.getName().equals(other.getName())&&this.getAge()==other.getAge();
    }
}
