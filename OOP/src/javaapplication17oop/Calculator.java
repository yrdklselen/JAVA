/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17oop;

public class Calculator {
    public int num1;
    public int num2;
    Calculator (int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int add(){
      return  num1+num2;
    }
    public int subs(){
    return this.num1-this.num2;
}
    public int multiply(){
     return this.num1*this.num2;
    }
    public double  divide(){
        return this.num1/this.num2;
    }
}
    