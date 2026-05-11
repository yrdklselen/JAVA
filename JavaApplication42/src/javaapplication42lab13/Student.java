/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication42lab13;


class Student extends Person{
    private String department;
    public Student(String name,int age,String department){
        super(name,age);
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String toString(){
        return "Name: "+super.getName()+" Age: "+super.getAge()+" Department: "+department;
                
    }
    public boolean equals(Object o){
        if((o instanceof Student)==false)
        return false;
        Student other=(Student) o;
        return this.getName().equals(other.getName())&&this.getAge()==other.getAge()
                &&this.department.equals(other.getDepartment());
                
                
                
    }
    
}
