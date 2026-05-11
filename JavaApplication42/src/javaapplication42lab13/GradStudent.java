/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication42lab13;


class GradStudent extends Student {
    private Faculty advisor;
    public GradStudent(String name,int age,String department){
        super(name,age,department);
        
    }
    public Faculty getAdvisor(){
        return advisor;
    }
    public void setAdvisor(Faculty advisor){
        this.advisor=advisor;
    }
    public String toString(){
        String str=super.toString();
        if(advisor!=null){
            str+="\nAdvisor: "+advisor.toString();
        }
        return str;
    }
    public boolean equals(Object o){
        if((o instanceof GradStudent)==false)
        return false;
        GradStudent other=(GradStudent) o;
        return this.getName().equals(other.getName())&&this.getAge()==other.getAge()
                &&this.getDepartment().equals(other.getDepartment())&&this.advisor.equals(other.getAdvisor());
                
    }
}
