/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33passbyvalue;


class PassByReference {
    public int number2;
    public void change(PassByReference reference){
        reference=new PassByReference();
        reference.number2=reference.number2 +3;
    }
}
