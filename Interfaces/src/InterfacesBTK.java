/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author hp
 */
public class InterfacesBTK {

  
    public static void main(String[] args) {
       CustomerManager customerManager=new CustomerManager();
       customerManager.customerDal=new OracleCustomerDal();
       customerManager.add();
    }
    
}
