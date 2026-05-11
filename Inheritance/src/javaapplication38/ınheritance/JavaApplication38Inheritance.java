/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38.ınheritance;


public class JavaApplication38Inheritance {

    
    public static void main(String[] args) {
        Flower f1=new Flower("pink","rose",1.5);
        Bouquet b1=new Bouquet("valentines day",f1,13);
        System.out.println(b1.getCost());
    }
    
}
