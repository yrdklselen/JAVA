/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication42lab13;


class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Name: "+name+" Age: "+age;
    }
    public boolean equals(Object o){
        if((o instanceof Person)==false)
        return false;
        
        Person other=(Person) o;
        return  this.name.equals(other.getName())&&this.age==other.getAge();
    
    }
}
