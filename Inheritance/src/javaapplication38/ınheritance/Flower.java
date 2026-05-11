/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication38.ınheritance;
class Flower {
    private String color;
    private String name;
    private double unitPrice;
    public Flower(String color,String name,double unitPrice){
        this.color=color;
        this.name=name;
        this.unitPrice=unitPrice;
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setName(String name){
       this.name=name;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    
    
}
