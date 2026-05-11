/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication42lab13;

class Faculty extends Employee{
    private String department;
    public Faculty(String name,int age){
        super(name,age);
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String toString(){
        return super.toString()+" Department Faculty: "+department;
    }
    public boolean equals(Object o){
        if((o instanceof Faculty)==false)
            return false;
        Faculty other=(Faculty) o;
        return this.getName().equals(other.getName())&&this.getAge()==other.getAge()
                &&this.department.equals(other.getDepartment());
    }
}
