/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33passbyvalue;


public class JavaApplication33PassByValue {

   
    public static void main(String[] args) {
       int number=5;
       System.out.println("previous value of number:" +number);
       changeTheValue(number);
       System.out.println("current value of number: "+number);
       PassByReference reference=new PassByReference();
       reference.number2=7;
       System.out.println("previous value of number2: "+reference.number2);
       reference.change(reference);
       System.out.println("current value of number2: "+reference.number2);
    }
    public static void changeTheValue(int number){ 
        number=number+5;
        
    }
    
}
