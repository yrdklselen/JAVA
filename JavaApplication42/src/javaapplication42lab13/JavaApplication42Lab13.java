/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication42lab13;


public class JavaApplication42Lab13 {

    public static void main(String[] args) {
        Person p1 =new Person("Ali",25);
        Student s1=new Student("Ayşe",23,"CS");
        GradStudent g1=new GradStudent("Berke",24,"CE");
        Employee e1=new Employee("Ahmet",30);
        Staff staff=new Staff("Mehmet",26);
        Faculty f1=new Faculty("Fatma",28);
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(staff);
        System.out.println(g1);
        System.out.println("\n");
        
        boolean eq;
        Person p2=new Person("Ali",25);
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);
        
        eq=p1==p2;
        
        System.out.println("p1==p2 ? ==>" +eq);
        
        eq=p1.equals(p2);
        System.out.println("P1 equals p2 ? ==>" +eq);
        System.out.println("\n");
       
        Student s2=new Student("emre",25,"CE");
        Faculty f2=new Faculty("Emre",25);
        f2.setDepartment("CE");
        
        System.out.println("s2: "+s2);
        System.out.println("f2: "+f2);
        
        eq=s1.equals(f2);
        System.out.println("s2 equals f2 ? ==>"+eq);  
        
    }
    
}
